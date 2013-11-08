package com.myguel.training.domain;

import java.io.Serializable;

public class Person implements Serializable{

	private Integer personaId;
	private String nombre;
	
	public Person() {
	
	}
	
	public Integer getPersonaId() {
		return personaId;
	}
	public void setPersonaId(Integer personaId) {
		this.personaId = personaId;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
