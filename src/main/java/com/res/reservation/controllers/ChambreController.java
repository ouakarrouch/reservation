package com.res.reservation.controllers;

import com.res.reservation.entities.Chambre;
import com.res.reservation.repositories.ChambreRepository;
import com.res.reservation.request.ChambreRequest;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chambre")
public class ChambreController {
    @Autowired
    private ChambreRepository chambreRepository;


    @GetMapping("/chambres")
    public List<Chambre> getAllChambres(){
        return chambreRepository.findAll();
    }

    @GetMapping("/chambres/{id}")
    public ResponseEntity<Chambre> getChambreById(@PathVariable Long id){
        return chambreRepository.findById(id)
                .map(chambre ->ResponseEntity.ok().body(chambre))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/chambres")
    public Chambre createChambre(@RequestBody ChambreRequest chambreRequest) {
        Chambre chambre = new Chambre();
        chambre.setPrix(chambreRequest.getPrix());
        chambre.setType(chambreRequest.getType());
        chambre.setDisponible(chambreRequest.isDisponible());
        return chambreRepository.save(chambre);
    }

    @PutMapping("/chambres/{id}")
    public ResponseEntity<Chambre> updateChambre(@PathVariable Long id,@RequestBody ChambreRequest chambreDetails){
        return chambreRepository.findById(id).map(chambre ->{
            chambre.setType(chambreDetails.getType());
            chambre.setPrix(chambreDetails.getPrix());
            chambre.setDisponible(chambreDetails.isDisponible());
            Chambre updateChambre=chambreRepository.save(chambre);
            return ResponseEntity.ok().body(updateChambre);
        }).orElse(ResponseEntity.notFound().build());
    }

    //DELETE:supprimer un chambre
    @DeleteMapping("/chambres/{id}")
    public ResponseEntity<Void> deleteChambre(@PathVariable Long id){
        return chambreRepository.findById(id).map(chambre->{
            chambreRepository.delete(chambre);
            return ResponseEntity.ok().<Void>build();
        }).orElse(ResponseEntity.notFound().build());
    }
}
