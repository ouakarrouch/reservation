package com.res.reservation.services;

import com.res.reservation.entities.Chambre;
import com.res.reservation.repositories.ChambreRepository;
import com.res.reservation.stubs.*;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@GrpcService
public class ChambreService extends ChambreServiceGrpc.ChambreServiceImplBase {

    @Autowired
    private ChambreRepository chambreRepository;

    @Override
    public void deleteChambre(DeleteChambreRequest request, StreamObserver<DeleteChambreResponse> responseObserver) {
        try {
            Long id = Long.parseLong(request.getId());
            Optional<com.res.reservation.entities.Chambre> optionalChambre = chambreRepository.findById(id);

            if (optionalChambre.isPresent()) {
                chambreRepository.delete(optionalChambre.get());
                responseObserver.onNext(DeleteChambreResponse.newBuilder().setSuccess(true).build());
            } else {
                responseObserver.onError(new Throwable("Compte with ID " + id + " not found."));
            }
            responseObserver.onCompleted();
        } catch (NumberFormatException e) {
            responseObserver.onError(new Throwable("Invalid ID format. ID must be a number."));
        } catch (Exception e) {
            responseObserver.onError(new Throwable("An unexpected error occurred: " + e.getMessage()));
        }
    }

    @Override
    public void allChambres(GetAllChambresRequest request, StreamObserver<GetAllChambresResponse> responseObserver) {
        try {
            List<com.res.reservation.entities.Chambre> chambres = chambreRepository.findAll();
            GetAllChambresResponse.Builder responseBuilder = GetAllChambresResponse.newBuilder();

            for (Chambre chambre : chambres) {
                responseBuilder.addChambres(mapToGrpcChambre(chambre));
            }

            responseObserver.onNext(responseBuilder.build());
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(new Throwable("An unexpected error occurred: " + e.getMessage()));
        }
    }

    @Override
    public void chambreById(GetChambreByIdRequest request, StreamObserver<GetChambreByIdResponse> responseObserver) {
        try {
            Long id = Long.parseLong(request.getId());
            Optional<com.res.reservation.entities.Chambre> optionalChambre = chambreRepository.findById(id);

            if (optionalChambre.isPresent()) {
                responseObserver.onNext(GetChambreByIdResponse.newBuilder()
                        .setChambre(mapToGrpcChambre(optionalChambre.get()))
                        .build());
            } else {
                responseObserver.onError(new Throwable("Compte with ID " + id + " not found."));
            }
            responseObserver.onCompleted();
        } catch (NumberFormatException e) {
            responseObserver.onError(new Throwable("Invalid ID format. ID must be a number."));
        } catch (Exception e) {
            responseObserver.onError(new Throwable("An unexpected error occurred: " + e.getMessage()));
        }
    }

    @Override
    public void saveChambre(SaveChambreRequest request, StreamObserver<SaveChambreResponse> responseObserver) {
        ChambreRequest chambreReq = request.getChambre();


        Chambre newChambre = new com.res.reservation.entities.Chambre();
        newChambre.setDisponible(chambreReq.getDisponible());
        newChambre.setPrix((double) chambreReq.getPrix());

        // Parse date
        newChambre.setType(chambreReq.getType().getNumber() == 0 ?
                com.res.reservation.entities.TypeChambre.DOUBLE : com.res.reservation.entities.TypeChambre.SIMPLE);

        // Save the entity
        Chambre savedChambre = chambreRepository.save(newChambre);

        // Map back to gRPC Compte
        responseObserver.onNext(SaveChambreResponse.newBuilder()
                .setChambre(mapToGrpcChambre(savedChambre))
                .build());
        responseObserver.onCompleted();

    }

    // Utility function to map JPA entity to gRPC Compte
    private com.res.reservation.stubs.Chambre mapToGrpcChambre(Chambre chambre) {
        com.res.reservation.stubs.TypeChambre type = chambre.getType() == com.res.reservation.entities.TypeChambre.DOUBLE ?
                com.res.reservation.stubs.TypeChambre.DOUBLE : com.res.reservation.stubs.TypeChambre.SIMPLE;
        return com.res.reservation.stubs.Chambre.newBuilder()
                .setId(String.valueOf(chambre.getId()))
                .setType(type)
                .setPrix((float) chambre.getPrix())
                .setDisponible((boolean) chambre.isDisponible())
                .build();
    }
}
