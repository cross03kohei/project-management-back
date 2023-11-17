package com.example.projectmanagementbackend.dao;

import com.example.projectmanagementbackend.entity.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<ClientEntity, Long> {
}
