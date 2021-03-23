package com.soprasteria.model;

public class Patient {
	
	private int id;
	private String lastname;
	private String firstname;
	private int age;
	public Patient() {
		super();
	}
	public Patient(int id, String lastname, String firstname, int age) {
		super();
		this.id = id;
		this.lastname = lastname;
		this.firstname = firstname;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Patient [id=" + id + ", lastname=" + lastname + ", firstname=" + firstname + ", age=" + age + "]";
	}
	

}
