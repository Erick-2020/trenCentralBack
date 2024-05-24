package com.apiTren.crudJava.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "usuarios")
@Getter
@Setter
public class UsersModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private int phone;

    private Date nacDate;

    private int password;

    private LocalDateTime createdDate;



}
