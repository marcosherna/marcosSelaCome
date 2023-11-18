package com.example.proyectoApi.controllers;

  
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.proyectoApi.Models.Clientes;
import com.example.proyectoApi.services.ClientesServices;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    
    @Autowired
    private ClientesServices clientesServices;


    @RequestMapping("/")
    public List<Clientes> getClientes(){
        return clientesServices.getClientesRepository().findAll();
    } 


    @RequestMapping("/{id}")
    public Clientes getClienteById(@PathVariable("id") int id){
        return clientesServices
                    .getClientesRepository().
                            findById(id).get();
    }
 

    @RequestMapping("/delete/{id}")
    public String deleteClienteById(@PathVariable("id") int id){
        clientesServices.getClientesRepository().deleteById(id);
        return "Cliente eliminado";
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Clientes> updateClienteById(@PathVariable("id") int id, @RequestBody Clientes cliente){  

        Clientes _cliente = clientesServices.getClientesRepository().findById(id).get();
        _cliente.setNombre(cliente.getNombre());
        _cliente.setApellido(cliente.getApellido());
        _cliente.setDireccion(cliente.getDireccion());
        _cliente.setTelefono(cliente.getTelefono());
        _cliente.setEmail(cliente.getEmail());
        _cliente.setPassword(cliente.getPassword());
        _cliente.setFecha_nacimiento(cliente.getFecha_nacimiento());  
        
        return ResponseEntity.ok(clientesServices.getClientesRepository().save(_cliente));
    }
    
    @PostMapping("/add")
    public Clientes addCliente(@RequestBody Clientes cliente){ 
        return clientesServices.getClientesRepository().save(cliente);    
    }
}
