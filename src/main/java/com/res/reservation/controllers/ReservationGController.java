package com.res.reservation.controllers;

import com.res.reservation.entities.Chambre;
import com.res.reservation.entities.Client;
import com.res.reservation.entities.Reservation;
import com.res.reservation.repositories.ChambreRepository;
import com.res.reservation.repositories.ClientRepository;
import com.res.reservation.repositories.ReservationRepository;
import com.res.reservation.request.ReservationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ReservationGController {
    @Autowired
    private ReservationRepository reservationRepository;
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private ChambreRepository chambreRepository;

    @QueryMapping
    public List<Reservation> allReservations() {
        return reservationRepository.findAll();
    }

    @QueryMapping
    public Reservation reservationById(@Argument("id") Long id) {
        Reservation reservation = reservationRepository.findById(id).orElse(null);
        if(reservation == null) throw new RuntimeException(String.format("Reservation %s not found", id));
        else return reservation;
    }


    @MutationMapping
    public Reservation saveReservation(@Argument("reservation") ReservationRequest reservationRequest ) {
        Client client = clientRepository.findById(reservationRequest.getClientId()).orElse(null);
        Chambre chambre = chambreRepository.findById(reservationRequest.getChambreId()).orElse(null);
        if(client == null) throw new RuntimeException(String.format("Client %s not found", reservationRequest.getClientId()));
        else if(chambre == null) throw new RuntimeException(String.format("Chambre %s not found", reservationRequest.getChambreId()));
        else {
            Reservation reservation = new Reservation();
            reservation.setChambre(chambre);
            reservation.setClient(client);
            reservation.setDateDebut(reservationRequest.getDateDebut());
            reservation.setDateFin(reservationRequest.getDateFin());
            reservation.setPreferences(reservationRequest.getPreferences());
            return reservationRepository.save(reservation);
        }
    }
    @MutationMapping
    public Reservation updateReservation(@Argument("reservation") Reservation reservation) {
        Reservation res = reservationRepository.findById(reservation.getId()).orElseThrow(() -> new RuntimeException("Reservation not found"));

        if (reservation.getDateDebut() != null) {
            res.setDateDebut(reservation.getDateDebut());
        }
        if (reservation.getDateFin() != null) {
            res.setDateFin(reservation.getDateFin());
        }
        if (reservation.getPreferences() != null) {
            res.setPreferences(reservation.getPreferences());
        }

        return reservationRepository.save(reservation);
    }
    @MutationMapping
    public String deleteReservationById(@Argument("id") Long id) {
        Reservation reservation = reservationRepository.findById(id).orElse(null);
        if (reservation == null) {
            throw new RuntimeException(String.format("Reservation %s not found", id));
        }

        // Optionally handle any additional logic (e.g., disassociating related entities)
        reservationRepository.deleteById(id);

        return "Reservation with ID " + id + " deleted successfully.";
    }

}
