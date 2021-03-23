package com.soprasteria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soprasteria.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer>{

}
