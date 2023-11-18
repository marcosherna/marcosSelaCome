package com.example.proyectoApi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proyectoApi.repositories.ClientesRepository;

@Service
public class ClientesServices {
    
    @Autowired
    private ClientesRepository clientesRepository;

    public ClientesRepository getClientesRepository() {
        return clientesRepository;
    }
 
}
