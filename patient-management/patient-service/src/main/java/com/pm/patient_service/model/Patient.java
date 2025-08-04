package com.pm.patient_service.model;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

//Data model for Patient entity
@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @NotNull 
    private String name;

    @NotNull
    @Email
    @Column(unique = true) // Ensures email is unique
    private String email;

    @NotNull
    private String address; 

    @NotNull
    private LocalDate dateOfBirth;

    @NotNull
    private LocalDate registrationDate;
    
}
