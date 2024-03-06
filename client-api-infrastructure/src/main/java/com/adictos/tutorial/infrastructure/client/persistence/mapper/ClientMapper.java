package com.adictos.tutorial.infrastructure.client.persistence.mapper;

import com.adictos.tutorial.domain.client.model.Client;
import com.adictos.tutorial.infrastructure.client.persistence.model.ClientEntity;

import java.util.List;

public class ClientMapper {

    private ClientMapper() {}
    public static Client toDomain(ClientEntity entity) {
        return new Client(entity.getId(), entity.getName(), entity.getLastName());
    }
    public static List<Client> toDomain(List<ClientEntity> entityList) {
        return entityList.stream().map(ClientMapper::toDomain).toList();
    }
    public static ClientEntity toEntity(Client client) {
        return new ClientEntity(client.id(), client.name(), client.lastName());
    }
}
