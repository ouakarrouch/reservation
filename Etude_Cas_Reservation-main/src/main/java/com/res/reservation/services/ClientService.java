package com.res.reservation.services;
import java.util.List;
import java.util.Optional;

import com.res.reservation.entities.Client;
import com.res.reservation.repositories.ClientRepository;
import com.res.reservation.stubs.*;
import io.grpc.stub.StreamObserver;
import org.springframework.beans.factory.annotation.Autowired;

import io.grpc.Status;

import net.devh.boot.grpc.server.service.GrpcService;


@GrpcService
public class ClientService extends ClientServiceGrpc.ClientServiceImplBase {
    @Autowired
    private ClientRepository clientRepository;

    @Override
    public void allClients(GetAllClientsRequest request, StreamObserver<GetAllClientsResponse> responseObserver) {
        try {
            List<Client> clients = clientRepository.findAll();
            GetAllClientsResponse.Builder responseBuilder = GetAllClientsResponse.newBuilder();

            for (Client client : clients) {
                responseBuilder.addClients(mapToGrpcClient(client));
            }

            responseObserver.onNext(responseBuilder.build());
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(Status.INTERNAL.withDescription("An unexpected error occurred: " + e.getMessage()).asRuntimeException());
        }
    }

    @Override
    public void clientById(GetClientByIdRequest request, StreamObserver<GetClientByIdResponse> responseObserver) {
        try {
            Long id = parseClientId(request.getId());
            Optional<Client> optionalClient = clientRepository.findById(id);

            if (optionalClient.isPresent()) {
                responseObserver.onNext(GetClientByIdResponse.newBuilder()
                        .setClient(mapToGrpcClient(optionalClient.get()))
                        .build());
            } else {
                responseObserver.onError(Status.NOT_FOUND.withDescription("Client with ID " + id + " not found.").asRuntimeException());
            }
            responseObserver.onCompleted();
        } catch (NumberFormatException e) {
            responseObserver.onError(Status.INVALID_ARGUMENT.withDescription("Invalid ID format. ID must be a number.").asRuntimeException());
        } catch (Exception e) {
            responseObserver.onError(Status.INTERNAL.withDescription("An unexpected error occurred: " + e.getMessage()).asRuntimeException());
        }
    }

    @Override
    public void saveClient(SaveClientRequest request, StreamObserver<SaveClientResponse> responseObserver) {
        ClientRequest clientReq = request.getClient();

        Client newClient = new Client();
        newClient.setNom(clientReq.getNom());
        newClient.setPrenom(clientReq.getPrenom());
        newClient.setEmail(clientReq.getEmail());
        newClient.setTelephone(clientReq.getTelephone());

        try {
            Client savedClient = clientRepository.save(newClient);
            responseObserver.onNext(SaveClientResponse.newBuilder()
                    .setClient(mapToGrpcClient(savedClient))
                    .build());
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(Status.INTERNAL.withDescription("An error occurred while saving client: " + e.getMessage()).asRuntimeException());
        }
    }

    @Override
    public void deleteClient(DeleteClientRequest request, StreamObserver<DeleteClientResponse> responseObserver) {
        try {
            Long id = parseClientId(request.getId());
            Optional<Client> optionalClient = clientRepository.findById(id);

            if (optionalClient.isPresent()) {
                clientRepository.delete(optionalClient.get());
                responseObserver.onNext(DeleteClientResponse.newBuilder().setSuccess(true).build());
            } else {
                responseObserver.onError(Status.NOT_FOUND.withDescription("Client with ID " + id + " not found.").asRuntimeException());
            }
            responseObserver.onCompleted();
        } catch (NumberFormatException e) {
            responseObserver.onError(Status.INVALID_ARGUMENT.withDescription("Invalid ID format. ID must be a number.").asRuntimeException());
        } catch (Exception e) {
            responseObserver.onError(Status.INTERNAL.withDescription("An unexpected error occurred: " + e.getMessage()).asRuntimeException());
        }
    }

    private com.res.reservation.stubs.Client mapToGrpcClient(Client client) {
        String id = client.getId() != null ? String.valueOf(client.getId()) : "";
        return com.res.reservation.stubs.Client.newBuilder()
                .setId(id)
                .setNom(client.getNom() != null ? client.getNom() : "")
                .setPrenom(client.getPrenom() != null ? client.getPrenom() : "")
                .setEmail(client.getEmail() != null ? client.getEmail() : "")
                .setTelephone(client.getTelephone() != null ? client.getTelephone() : "")
                .build();
    }

    private Long parseClientId(String clientId) throws NumberFormatException {
        return Long.parseLong(clientId);
    }
}
