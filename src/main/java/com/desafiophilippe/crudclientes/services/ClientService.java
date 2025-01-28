package com.desafiophilippe.crudclientes.services;

import com.desafiophilippe.crudclientes.dto.ClientDTO;
import com.desafiophilippe.crudclientes.entities.Client;
import com.desafiophilippe.crudclientes.repositories.ClientRepository;
import com.desafiophilippe.crudclientes.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id) {
        Client client = repository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Recurso não Encontrado")
        );
        return new ClientDTO(client);
    }
}
