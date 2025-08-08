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
// This code snippet defines a Java class named `Patient` which represents a data model for a patient
// entity. Here's a breakdown of what each part of the code is doing:
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @NotNull 
    private String name;

    @NotNull
    @Email
    @Column(unique = true) 
    private String email;

    @NotNull
    private String address; 

    @NotNull
    private LocalDate dateOfBirth;

    @NotNull
    private LocalDate registrationDate;


    // --- Getters and Setters ---

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }
    
}
