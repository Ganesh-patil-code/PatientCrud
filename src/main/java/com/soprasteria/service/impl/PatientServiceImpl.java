package com.soprasteria.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.soprasteria.model.Patient;
import com.soprasteria.repository.PatientRepository;
import com.soprasteria.service.IPatient;

@Component
public class PatientServiceImpl implements IPatient{

	@Autowired
	private PatientRepository repo;
	
	@Override
	public List<Patient> listAllPatient() {
		
		return repo.findAll();
	}

	@Override
	public Optional<Patient> getOnePatient(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	@Override
	public Integer savePatient(Patient patient) {
		// TODO Auto-generated method stub
		return repo.save(patient).getId();
	}

	@Override
	public Boolean UpdatePatient(Integer id) {
		// TODO Auto-generated method stub
		return repo.existsById(id);
	}

	@Override
	public void DeletePatient(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		
	}

}
