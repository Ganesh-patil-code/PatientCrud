package com.soprasteria.service;

import java.util.List;
import java.util.Optional;

import com.soprasteria.model.Patient;

public interface PatientService {

	public List<Patient> listAllPatient();
	
	public Optional<Patient> getOnePatient(Integer id);
	
	public Integer SaveContact(Patient patient);
	
	public Boolean UpdatePatient(Integer id);
	
	public void DeletePatient(Integer id);
	
}
