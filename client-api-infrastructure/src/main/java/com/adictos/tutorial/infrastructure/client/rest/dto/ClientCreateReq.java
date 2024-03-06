package com.adictos.tutorial.infrastructure.client.rest.dto;

import com.adictos.tutorial.domain.client.model.Client;

public record ClientCreateReq(String name, String lastName) {
    public static Client toDomain(ClientCreateReq client) {
        return new Client(null, client.name, client.lastName);
    }
}
