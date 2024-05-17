package com.apiTren.crudJava.services;

import com.apiTren.crudJava.models.TrenesModel;
import com.apiTren.crudJava.repositories.IdTrenesRepository;
import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

@Service
public class TrenesService {

    IdTrenesRepository trenesRepository;

    //metodo que viene jparepository el cual dentro de el trae metodos como findall
    // para buscar todos los datos y mostrarlos a traves del array list
    public ArrayList<TrenesModel> getTrenes() {
        return (ArrayList<TrenesModel>) trenesRepository.findAll();
    }

    //guardamos los ususarios
    public TrenesModel saveTrenes(TrenesModel trenes) {
        return trenesRepository.save(trenes);
    }

    /// este tipo OPTIONAL puede devolver algo espeifico o null
    public Optional<TrenesModel> getById(Long id) {
        return trenesRepository.findById(id);
    }

    public TrenesModel updateById(TrenesModel request, Long id){
        TrenesModel trenes = trenesRepository.findById(id).get();

        //seteamos
        trenes.setNameTren(request.getNameTren());
        trenes.setNumberVagones(request.getNumberVagones());
        trenes.setCapacity(request.getCapacity());
        trenes.setNumberAsientos(request.getNumberAsientos());
        trenes.setAsientosDisponibles(request.getAsientosDisponibles());
        trenes.setDiaSaalida(request.getDiaSaalida());
        trenes.setHoraSalida(request.getHoraSalida());
        trenes.setHoraSalida(request.getHoraSalida());
        trenes.setHoraLLegada(request.getHoraLLegada());
        trenes.setRutaOrigen(request.getRutaOrigen());
        trenes.setRutaDestino(request.getRutaDestino());
        trenes.setDistacion(request.getDistacion());

        //actualizamos y guardamos cambios
        trenesRepository.save(trenes);

        return trenes;
    }

    //boleano por si no se borra por algun motivo
    public Boolean deleteTrenes(Long id) {
        try {
            trenesRepository.deleteById(id);
            return true;
        }catch (Exception e) {
            return false;
        }
    }


}
