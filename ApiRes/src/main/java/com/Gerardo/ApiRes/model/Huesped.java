package com.Gerardo.ApiRes.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "huesped")
public class Huesped {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idHuesped;

    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private String nacionalidad;
    private String telefono;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Reserva> reservas = new ArrayList<>();
}
