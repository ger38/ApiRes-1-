package com.Gerardo.ApiRes.dtos;

import lombok.Data;

@Data
public class ReservaResponse {
    private String fechaEntrada;
    private String fechaSalida;
    private double valor;
    private String formaPago;

}
