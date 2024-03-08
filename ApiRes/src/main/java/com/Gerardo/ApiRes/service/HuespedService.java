package com.Gerardo.ApiRes.service;

import com.Gerardo.ApiRes.model.Huesped;
import com.Gerardo.ApiRes.repository.HuespedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HuespedService {

    @Autowired
    private HuespedRepository huespedRepository;

    //METODO MOSTRAR HUESPED.
    public List<Huesped> getAllHuespedes(){
        return huespedRepository.findAll();
    }

    //CREAR HUESPED.
    public Huesped createHuesped(Huesped huesped){
        return huespedRepository.save(huesped);
    }

    //ACTUALIZAR HUESPED.
    public Huesped updateHuesped(Huesped huesped){
        return huespedRepository.save(huesped);
    }

    //ELIMINAR HUESPED
    public void deleteHuespedById(long id){
        huespedRepository.deleteById(id);
    }


}
