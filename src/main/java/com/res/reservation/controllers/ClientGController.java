package com.res.reservation.controllers;

import com.res.reservation.entities.Client;
import com.res.reservation.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ClientGController {
    @Autowired
    private ClientRepository clientRepository;

    @QueryMapping
    public List<Client> allClients(){
        return clientRepository.findAll();
    }


    @QueryMapping
    public Client clientById(@Argument("id") Long id) {
        Client client = clientRepository.findById(id).orElse(null);
        if(client == null) throw new RuntimeException(String.format("Client %s not found", id));
        else return client;
    }

    @MutationMapping
    public Client saveClient(@Argument("client") Client client) {
        return clientRepository.save(client);
    }

    @MutationMapping
    public String deleteClientById(@Argument("id") Long id) {
        Client client = clientRepository.findById(id).orElse(null);
        if(client == null) {
            return "client with id : " + id + " is not found";
        }
        clientRepository.deleteById(id);
        return "client with id : " + id + " is deleted successfuly";
    }


}
