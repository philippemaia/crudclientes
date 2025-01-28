package com.desafiophilippe.crudclientes.repositories;

import com.desafiophilippe.crudclientes.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
