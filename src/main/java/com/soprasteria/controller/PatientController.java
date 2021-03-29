package com.soprasteria.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.soprasteria.model.Patient;
import com.soprasteria.service.impl.PatientServiceImpl;

@RestController
@RequestMapping("/rest")
public class PatientController {

	@Autowired
	private PatientServiceImpl service;
	
	@RequestMapping("/show")
	public String get() {
		return "Ganesh Patil Dhotri";
	}
	
	@RequestMapping(value = "/all",method = RequestMethod.GET)
	public ResponseEntity<?> getAllPatient()
	{
		ResponseEntity<?> resp=null;
		try {
			List<Patient> list=service.listAllPatient();
			
			if(list!=null && !list.isEmpty())
			{
				resp=new ResponseEntity<List<Patient>>(list,HttpStatus.OK);
			}
			else
			{
				resp=new ResponseEntity<String>("No Data found",HttpStatus.OK);
			}
		}catch (Exception e) {
			// TODO: handle exception
			resp=new ResponseEntity<String>("Unable to found data",HttpStatus.INTERNAL_SERVER_ERROR);
			e.printStackTrace();
		}
		return resp;
	}
	
	@RequestMapping(value = "/one/{id}",method = {RequestMethod.GET,RequestMethod.POST})
	public ResponseEntity<?> getOne(@PathVariable(name = "id")Integer id)
	{
		ResponseEntity<?> resp=null;
		try {
			//Optional<Contact> contact=service.getOneContact(id);
			Optional<Patient> opt=service.getOnePatient(id);
			//System.out.println(opt.get().getId());
			if(opt.isPresent())
				resp=new ResponseEntity<Patient>(opt.get(),HttpStatus.OK);
			
			else
				resp=new ResponseEntity<String>("No Data Found",HttpStatus.BAD_REQUEST);
		}catch (Exception e) {
			// TODO: handle exception
			resp=new ResponseEntity<String>("Unable to found Data",HttpStatus.INTERNAL_SERVER_ERROR);
			e.printStackTrace();
		}
		return resp;
	}
	
	
}
