package com.Gerardo.ApiRes.service;

import com.Gerardo.ApiRes.model.Reserva;
import com.Gerardo.ApiRes.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;

    //METODO MOSTRAR RESERVA.
    public List<Reserva> getAllReserva(){
        return reservaRepository.findAll();
    }

    //CREAR RESERVA
    public Reserva createReserva(Reserva reserva){
        return reservaRepository.save(reserva);
    }

    //ACTUALIZAR RESERVA
    public Reserva updateReserva(Reserva reserva){
        return reservaRepository.save(reserva);
    }

    //ELIMINAR RESERVA
    public void deleteReservaById(long id){
        reservaRepository.deleteById(id);
    }
}


