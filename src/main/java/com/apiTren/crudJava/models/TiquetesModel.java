package com.apiTren.crudJava.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "tiquetes")
@Getter
@Setter
public class TiquetesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long idTiquete;
    @Column
    private int numberAsiento;
    @Column
    private Date fechaCompra;
    @Column
    private int TotalPrice;



}
