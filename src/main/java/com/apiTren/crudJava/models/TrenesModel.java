package com.apiTren.crudJava.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;
import java.util.Date;

@Entity
@Table(name = "trenes")
@Getter
@Setter
public class TrenesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id_vagon;

    private String nameTren;

    private int  numberVagones;

    private int capacity;

    private int numberAsientos;

    private int asientosDisponibles;

    private Date diaSaalida;

    private LocalTime horaSalida;

    private LocalTime horaLLegada;

    private String rutaOrigen;

    private String rutaDestino;

    private int distacion;


}
