package com.res.reservation.services;

import com.res.reservation.entities.Client;
import com.res.reservation.entities.Reservation;
import com.res.reservation.repositories.ChambreRepository;
import com.res.reservation.repositories.ClientRepository;
import com.res.reservation.repositories.ReservationRepository;
import com.res.reservation.stubs.*;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Optional;

@GrpcService
public class ReservationService extends ReservationServiceGrpc.ReservationServiceImplBase {

    @Autowired
    private ReservationRepository reservationRepository;
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private ChambreRepository chambreRepository;

    @Override
    public void deleteReservation(DeleteReservationRequest request, StreamObserver<DeleteReservationResponse> responseObserver) {
        try {
            Long id = Long.parseLong(request.getId());
            Optional<Reservation> optionalReservation = reservationRepository.findById(id);

            if (optionalReservation.isPresent()) {
                Reservation reservation = optionalReservation.get();


                reservationRepository.deleteById(id);

                responseObserver.onNext(DeleteReservationResponse.newBuilder().setSuccess(true).build());
                responseObserver.onCompleted();
            } else {
                responseObserver.onError(Status.NOT_FOUND
                        .withDescription("Reservation with ID " + id + " not found.")
                        .asRuntimeException());
            }
        } catch (NumberFormatException e) {
            responseObserver.onError(Status.INVALID_ARGUMENT
                    .withDescription("Invalid ID format. ID must be a number.")
                    .asRuntimeException());
        } catch (Exception e) {
            responseObserver.onError(Status.INTERNAL
                    .withDescription("Reservation deletion failed. Please check for database constraints.")
                    .asRuntimeException());
        }
    }




    @Override
    public void allReservations(GetAllReservationsRequest request, StreamObserver<GetAllReservationsResponse> responseObserver) {
        try {
            List<Reservation> reservations = reservationRepository.findAll();
            GetAllReservationsResponse.Builder responseBuilder = GetAllReservationsResponse.newBuilder();

            for (Reservation reservation : reservations) {
                responseBuilder.addReservations(mapToGrpcReservation(reservation));
            }

            responseObserver.onNext(responseBuilder.build());
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(new Throwable("An unexpected error occurred: " + e.getMessage()));
        }
    }

    @Override
    public void reservationById(GetReservationByIdRequest request, StreamObserver<GetReservationByIdResponse> responseObserver) {
        try {
            Long id = Long.parseLong(request.getId());
            Optional<Reservation> optionalCompte = reservationRepository.findById(id);

            if (optionalCompte.isPresent()) {
                responseObserver.onNext(GetReservationByIdResponse.newBuilder()
                        .setReservation(mapToGrpcReservation(optionalCompte.get()))
                        .build());
            } else {
                responseObserver.onError(new Throwable("Reservation with ID " + id + " not found."));
            }
            responseObserver.onCompleted();
        } catch (NumberFormatException e) {
            responseObserver.onError(new Throwable("Invalid ID format. ID must be a number."));
        } catch (Exception e) {
            responseObserver.onError(new Throwable("An unexpected error occurred: " + e.getMessage()));
        }
    }



    @Override
    public void saveReservation(SaveReservationRequest request, StreamObserver<SaveReservationResponse> responseObserver) {
        try {
            ReservationRequest reservationReq = request.getReservation();
            System.out.println("Received reservation request: " + reservationReq);

            // Validate inputs
            if (reservationReq.getChambreId().isEmpty()) {
                throw Status.INVALID_ARGUMENT.withDescription("Chambre ID is required and cannot be empty.").asRuntimeException();
            }
            if ( reservationReq.getClientId().isEmpty()) {
                throw Status.INVALID_ARGUMENT.withDescription("Client ID is required and cannot be empty.").asRuntimeException();
            }

            Long idChambre = Long.parseLong(reservationReq.getChambreId());
            Long idClient = Long.parseLong(reservationReq.getClientId());

            // Fetch related entities
            Client client = clientRepository.findById(idClient)
                    .orElseThrow(() -> Status.NOT_FOUND.withDescription("Client not found").asRuntimeException());
            com.res.reservation.entities.Chambre chambre = chambreRepository.findById(idChambre)
                    .orElseThrow(() -> Status.NOT_FOUND.withDescription("Chambre not found").asRuntimeException());

            // Parse and save the reservation
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd-yyyy");
            Reservation newReservation = new Reservation();
            newReservation.setPreferences(reservationReq.getPreferences());
            newReservation.setDateDebut(simpleDateFormat.parse(reservationReq.getDateDebut()));
            newReservation.setDateFin(simpleDateFormat.parse(reservationReq.getDateFin()));
            newReservation.setChambre(chambre);
            newReservation.setClient(client);

            Reservation savedReservation = reservationRepository.save(newReservation);

            responseObserver.onNext(SaveReservationResponse.newBuilder()
                    .setReservation(mapToGrpcReservation(savedReservation))
                    .build());
            responseObserver.onCompleted();

        } catch (NumberFormatException e) {
            responseObserver.onError(Status.INVALID_ARGUMENT
                    .withDescription("Invalid ID format: " + e.getMessage())
                    .asRuntimeException());
        } catch (ParseException e) {
            responseObserver.onError(Status.INVALID_ARGUMENT
                    .withDescription("Invalid date format. Expected format is MM-dd-yyyy.")
                    .asRuntimeException());
        } catch (StatusRuntimeException e) {
            responseObserver.onError(e);
        } catch (Exception e) {
            responseObserver.onError(Status.INTERNAL
                    .withDescription("An unexpected error occurred: " + e.getMessage())
                    .asRuntimeException());
        }
    }



    // Utility function to map JPA entity to gRPC Compte
    private com.res.reservation.stubs.Reservation mapToGrpcReservation(com.res.reservation.entities.Reservation reservation) {
        com.res.reservation.stubs.Client grpcClient = com.res.reservation.stubs.Client.newBuilder()
                .setId(String.valueOf(reservation.getClient().getId()))
                .setNom(reservation.getClient().getNom())
                .setPrenom(reservation.getClient().getPrenom())
                .setEmail(reservation.getClient().getEmail())
                .setTelephone(reservation.getClient().getTelephone())
                .build();

        com.res.reservation.stubs.Chambre grpcChambre = com.res.reservation.stubs.Chambre.newBuilder()
                .setId(String.valueOf(reservation.getChambre().getId()))
                .setType(com.res.reservation.stubs.TypeChambre.valueOf(reservation.getChambre().getType().name()))
                .setPrix((float)reservation.getChambre().getPrix())
                .setDisponible(reservation.getChambre().isDisponible())
                .build();

        return com.res.reservation.stubs.Reservation.newBuilder()
                .setId(String.valueOf(reservation.getId()))
                .setDateDebut(reservation.getDateDebut().toString())
                .setDateFin(reservation.getDateFin().toString())
                .setPreferences(reservation.getPreferences())
                .setClient(grpcClient)
                .setChambre(grpcChambre)
                .build();
    }

}
