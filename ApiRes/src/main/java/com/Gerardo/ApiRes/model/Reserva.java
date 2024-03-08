package com.Gerardo.ApiRes.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "reserva")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idReserva;

    private String fechaEntrada;
    private String fechaSalida;
    private double valor;
    private String formaPago;

}

