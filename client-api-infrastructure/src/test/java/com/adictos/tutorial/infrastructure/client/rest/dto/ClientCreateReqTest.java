package com.adictos.tutorial.infrastructure.client.rest.dto;

import com.adictos.tutorial.domain.client.model.Client;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClientCreateReqTest {

    @Test
    void toDomain_whenInvoke_thenMappingCorrectly() {
        var createReq = new ClientCreateReq("test", "test2");
        var clientDomain = new Client(null, "test", "test2");

        var result = ClientCreateReq.toDomain(createReq);

        assertEquals(clientDomain, result);
    }
}