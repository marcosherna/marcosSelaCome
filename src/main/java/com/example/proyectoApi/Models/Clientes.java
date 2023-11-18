package com.example.proyectoApi.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "clientes")
public class Clientes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false,  name = "id")
    private int id;

    @Column(nullable = false,  name = "nombre")
    private String nombre;

    @Column(nullable = false,  name = "apellido")
    private String apellido;

    @Column(nullable = false,  name = "direccion")
    private String direccion;

    @Column(nullable = false,  name = "telefono")
    private String telefono;

    @Column(nullable = false,  name = "email")
    private String email;

    @Column(nullable = false,  name = "password")
    private String password;

    @Column(nullable = false,  name = "fecha_nacimiento")
    private String fecha_nacimiento;

    public Clientes() {
    }

    public Clientes(String nombre, String apellido, String direccion, String telefono, String email, String password, String fecha_nacimiento, String fecha_registro, String fecha_actualizacion, int estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.password = password;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public int getId() { return id; }
    public void setId(int id) { 
        this.id = id; 
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { 
        this.nombre = nombre; 
    }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { 
        this.apellido = apellido; 
    }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { 
        this.direccion = direccion; 
    }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { 
        this.telefono = telefono; 
    }

    public String getEmail() { return email; }
    public void setEmail(String email) { 
        this.email = email; 
    }   

    public String getPassword() { return password; }
    public void setPassword(String password) { 
        this.password = password; 
    }

    public String getFecha_nacimiento() { return fecha_nacimiento; }
    public void setFecha_nacimiento(String fecha_nacimiento) { 
        this.fecha_nacimiento = fecha_nacimiento; 
    }


}
