package com.example.projectmanagementbackend.controller;

import com.example.projectmanagementbackend.dao.ClientRepository;
import com.example.projectmanagementbackend.model.Client;
import com.example.projectmanagementbackend.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/client")
public class ClientController {
    @Autowired
    ClientService clientService;
    @PostMapping
    public Client post(@RequestBody Client client) {
        return clientService.createClient(client);
    }
}
