package com.adictos.tutorial.infrastructure.client.rest.controller;

import com.adictos.tutorial.application.client.port.ClientInteractionPort;
import com.adictos.tutorial.infrastructure.client.rest.dto.ClientCreateReq;
import com.adictos.tutorial.infrastructure.client.rest.dto.ClientRes;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("clients")
public class ClientController {
    private final ClientInteractionPort port;

    public ClientController(ClientInteractionPort port) {
        this.port = port;
    }

    @PostMapping()
    public ResponseEntity<ClientRes> create(@RequestBody ClientCreateReq clientToCreate) {
        var client= port.create(ClientCreateReq.toDomain(clientToCreate));
        return ResponseEntity.status(HttpStatus.CREATED).body(ClientRes.toResponse(client));
    }

    @GetMapping()
    public List<ClientRes> getAll() {
        return ClientRes.toResponse(port.findAll());
    }

}
