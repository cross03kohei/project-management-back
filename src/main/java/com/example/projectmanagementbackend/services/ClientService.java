package com.example.projectmanagementbackend.services;

import ch.qos.logback.core.joran.util.beans.BeanUtil;
import com.example.projectmanagementbackend.dao.ClientRepository;
import com.example.projectmanagementbackend.entity.ClientEntity;
import com.example.projectmanagementbackend.model.Client;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public Client createClient(Client client) {
        ClientEntity clientEntity = new ClientEntity();

        BeanUtils.copyProperties(client, clientEntity);
        clientRepository.save(clientEntity);
        return client;
    }


}
