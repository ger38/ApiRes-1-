package com.Gerardo.ApiRes.mappers;

import com.Gerardo.ApiRes.model.Huesped;
import com.Gerardo.ApiRes.model.Reserva;
import com.Gerardo.ApiRes.service.HuespedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReservaMapper {

    @Autowired
    private HuespedService huespedService;

    public Reserva reservaRequestToReserva(ReservaRequest reservaRequest, Reserva reserva){


        List<Huesped> huespedList = new ArrayList<>();
        for (HuespedRequest huespedRequest : reservaRequest.getHuespedes()) {

            Huesped huesped = new Huesped();
            huesped.setNombre(huespedRequest.getNombre());
            huesped.setApellido(huespedRequest.getApellido());
            huesped.setFechaNacimiento(huespedRequest.getFechaNacimiento());
            huesped.setNacionalidad(huespedRequest.getNacionalidad());
            huesped.setTelefono(huespedRequest.getTelefono());
            huesped = huespedService.setHuespedNuevaOExistente(huespedRequest, huesped);
            huespedList.add(huesped);
        }

        reserva.setHuespedes(huespedsList);
        return reserva;
    }


}
