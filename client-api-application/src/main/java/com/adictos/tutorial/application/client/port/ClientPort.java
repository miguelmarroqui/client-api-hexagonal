package com.adictos.tutorial.application.client.port;

import com.adictos.tutorial.domain.client.model.Client;

import java.util.List;

public interface ClientPort {
    Client create(Client client);
    List<Client> findAll();
}
