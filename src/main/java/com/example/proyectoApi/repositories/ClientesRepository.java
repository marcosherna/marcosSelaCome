package com.example.proyectoApi.repositories;

import com.example.proyectoApi.Models.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClientesRepository extends JpaRepository<Clientes, Integer> {
    
}
