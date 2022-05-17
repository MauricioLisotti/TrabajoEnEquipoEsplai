package com.restfull.core.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "propietario")

public class Propietario {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	Long idProp;
	
	@Column(name="NOMBRE")
	String nombreProp;

	@Column(name="APELLIDO")
	String apellidoProp;

	@Column(name="TELEFONO")
	String telefonoProp;
	
	
	public Long getIdProp() {
		return idProp;
	}

	public void setIdProp(Long id) {
		this.idProp = id;
	}

	public String getNombreProp() {
		return nombreProp;
	}

	public void setNombreProp(String nombre) {
		this.nombreProp = nombre;
	}

	public String getApellidoProp() {
		return apellidoProp;
	}

	public void setApellidoProp(String apellido) {
		this.apellidoProp = apellido;
	}

	public String getTelefonoProp() {
		return telefonoProp;
	}

	public void setTelefonoProp(String telefono) {
		this.telefonoProp = telefono;
	}
	
}