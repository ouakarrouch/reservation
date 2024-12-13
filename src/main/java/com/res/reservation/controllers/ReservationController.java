package com.res.reservation.controllers;

import com.res.reservation.entities.Chambre;
import com.res.reservation.entities.Client;
import com.res.reservation.entities.Reservation;
import com.res.reservation.repositories.ChambreRepository;
import com.res.reservation.repositories.ClientRepository;
import com.res.reservation.repositories.ReservationRepository;
import com.res.reservation.request.ReservationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservation")
public class ReservationController {

    @Autowired
    private ReservationRepository reservationRepository;
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private ChambreRepository chambreRepository;


    @GetMapping("/reservations")
    public List<Reservation> getAllReservations(){
        return reservationRepository.findAll();
    }

    @GetMapping("/reservations/{id}")
    public ResponseEntity<Reservation> getReservationById(@PathVariable Long id){
        return reservationRepository.findById(id)
                .map(reservation ->ResponseEntity.ok().body(reservation))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/reservations")
    public ResponseEntity<Reservation> createReservation(@RequestBody ReservationRequest reservationRequest) {
        if (reservationRequest.getClientId() == null || reservationRequest.getChambreId() == null) {
            throw new IllegalArgumentException("Client ID and Chambre ID must not be null");
        }

        Client client = clientRepository.findById(reservationRequest.getClientId())
                .orElseThrow(() -> new RuntimeException("Client not found with ID: " + reservationRequest.getClientId()));

        Chambre chambre = chambreRepository.findById(reservationRequest.getChambreId())
                .orElseThrow(() -> new RuntimeException("Chambre not found with ID: " + reservationRequest.getChambreId()));

        Reservation reservation = new Reservation();
        reservation.setClient(client);
        reservation.setChambre(chambre);
        reservation.setPreferences(reservationRequest.getPreferences());
        reservation.setDateDebut(reservationRequest.getDateDebut());
        reservation.setDateFin(reservationRequest.getDateFin());

        Reservation savedReservation = reservationRepository.save(reservation);
        return ResponseEntity.ok(savedReservation);
    }

    @PutMapping("/reservations/{id}")
    public ResponseEntity<Reservation> updateReservation(@PathVariable Long id,@RequestBody Reservation reservationDetails){
        return reservationRepository.findById(id).map(reservation ->{
            reservation.setClient(reservationDetails.getClient());
            reservation.setChambre(reservationDetails.getChambre());
            reservation.setDateDebut(reservationDetails.getDateDebut());
            reservation.setDateFin(reservationDetails.getDateFin());
            reservation.setPreferences(reservationDetails.getPreferences());
            Reservation updateReservation=reservationRepository.save(reservation);
            return ResponseEntity.ok().body(updateReservation);
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/reservations/{id}")
    public ResponseEntity<Void> deleteReservation(@PathVariable Long id){
        return reservationRepository.findById(id).map(reservation->{
            reservationRepository.deleteById(id);
            return ResponseEntity.ok().<Void>build();
        }).orElse(ResponseEntity.notFound().build());
    }
}
