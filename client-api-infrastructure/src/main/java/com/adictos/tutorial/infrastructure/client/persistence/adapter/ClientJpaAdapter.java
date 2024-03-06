package com.adictos.tutorial.infrastructure.client.persistence.adapter;

import com.adictos.tutorial.application.client.port.ClientPort;
import com.adictos.tutorial.domain.client.model.Client;
import com.adictos.tutorial.infrastructure.client.persistence.ClientJpaRepository;
import com.adictos.tutorial.infrastructure.client.persistence.mapper.ClientMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClientJpaAdapter implements ClientPort {

    public ClientJpaAdapter(ClientJpaRepository repository) {
        this.repository = repository;
    }
    private final ClientJpaRepository repository;

    @Override
    public Client create(Client client) {
        return ClientMapper.toDomain(repository.save(ClientMapper.toEntity(client)));
    }

    @Override
    public List<Client> findAll() {
        return ClientMapper.toDomain(repository.findAll());
    }
}
