package com.Gerardo.ApiRes.dtos;

import lombok.Data;

@Data
public class HuespedRequest {
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private String nacionalidad;
    private String telefono;
}
