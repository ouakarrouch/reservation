package com.res.reservation.controllers;


import com.res.reservation.entities.Client;
import com.res.reservation.repositories.ClientRepository;
import com.res.reservation.request.ClientRequest;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private ClientRepository clientRepository;


    @GetMapping("/clients")
    public List<Client> getAllClients(){
        return clientRepository.findAll();
    }

    @GetMapping("/clients/{id}")
    public ResponseEntity<Client> getClientById(@PathVariable Long id){
        return clientRepository.findById(id)
                .map(client ->ResponseEntity.ok().body(client))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/clients")
    public Client createClient(@RequestBody ClientRequest clientRequest) {
        Client client = new Client();
        client.setEmail(clientRequest.getEmail());
        client.setNom(clientRequest.getNom());
        client.setPrenom(clientRequest.getPrenom());
        client.setTelephone(clientRequest.getTelephone());
        return clientRepository.save(client);
    }

    @PutMapping("/clients/{id}")
    public ResponseEntity<Client> updateClient(@PathVariable Long id,@RequestBody ClientRequest clientDetails){
        return clientRepository.findById(id).map(client ->{
            client.setNom(clientDetails.getNom());
            client.setPrenom(clientDetails.getPrenom());
            client.setEmail(clientDetails.getEmail());
            client.setTelephone(clientDetails.getEmail());
            Client updateClient=clientRepository.save(client);
            return ResponseEntity.ok().body(updateClient);
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/clients/{id}")
    public ResponseEntity<Void> deleteClient(@PathVariable Long id){
        return clientRepository.findById(id).map(client->{
            clientRepository.delete(client);
            return ResponseEntity.ok().<Void>build();
        }).orElse(ResponseEntity.notFound().build());
    }

}
