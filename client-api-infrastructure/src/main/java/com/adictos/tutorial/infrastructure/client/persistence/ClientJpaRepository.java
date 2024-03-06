package com.adictos.tutorial.infrastructure.client.persistence;

import com.adictos.tutorial.infrastructure.client.persistence.model.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientJpaRepository extends JpaRepository<ClientEntity, Long> {}
