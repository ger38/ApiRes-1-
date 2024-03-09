package com.Gerardo.ApiRes.mappers;

import com.Gerardo.ApiRes.dtos.HuespedRequest;
import com.Gerardo.ApiRes.dtos.HuespedResponse;
import com.Gerardo.ApiRes.dtos.HuespedesResponse;
import com.Gerardo.ApiRes.model.Huesped;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HuespedMapper {
    public Huesped huespedRequestToHuesped(Huesped huesped, HuespedRequest huespedRequest) {
        huesped.setNombre(huespedRequest.getNombre());
        huespedRequest.setApellido(huespedRequest.getApellido());
        huesped.setFechaNacimiento(huespedRequest.getFechaNacimiento());
        huesped.setNacionalidad(huespedRequest.getNacionalidad());
        huesped.setTelefono(huespedRequest.getTelefono());

        return huesped;
    }

    public HuespedesResponse huespedResponseToResponse(List<Huesped> huespedes){
        List<HuespedResponse> huespedResponseList = new ArrayList<>();

        for (Huesped huesped : huespedes) {
            HuespedResponse huespedResponse = new HuespedResponse();
            huespedResponse.setNombre(huesped.getNombre());
            huespedResponse.setApellido(huesped.getApellido());
            huespedResponse.setFechaNacimiento(huesped.getFechaNacimiento());
            huespedResponse.setNacionalidad(huesped.getNacionalidad());
            huespedResponse.setTelefono(huesped.getTelefono());
        }
        HuespedesResponse huespedesResponse = new HuespedesResponse();
        huespedesResponse.setHuespedes(huespedResponseList);
        return huespedesResponse;
    }
    }

