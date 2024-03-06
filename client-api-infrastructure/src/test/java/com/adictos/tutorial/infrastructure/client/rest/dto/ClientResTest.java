package com.adictos.tutorial.infrastructure.client.rest.dto;

import com.adictos.tutorial.domain.client.model.Client;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClientResTest {

    @Test
    void toResponse_whenHasSingleElement_thenMappingCorrectly() {
        var clientDomain = new Client(1L, "test", "test2");
        var clientRes = new ClientRes(1L, "test", "test2");

        var result = ClientRes.toResponse(clientDomain);

        assertEquals(clientRes, result);
    }

    @Test
    void toResponse_whenHasList_thenMappingCorrectly() {
        var clientDomainList = List.of(
                new Client(1L, "test", "test2"),
                new Client(2L, "name", "lastname")
        );
        var clientResList = List.of(
                new ClientRes(1L, "test", "test2"),
                new ClientRes(2L, "name", "lastname")
        );

        var result = ClientRes.toResponse(clientDomainList);

        assertEquals(clientResList, result);
    }

}