package com.restfull.core.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bar")

public class Bar {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="IDBAR")
	Long idBar;
	
	@Column(name="NOMBRE")
	String nombreBar;

	@Column(name="DIRECCIONBAR")
	String direccionBar;
	
	@Column(name="TELEFONOBAR")
	String telefonoBar;
	
	@Column(name="CATPRECIO")
	String catPrecio;
	
	@Column(name="HORARIOBAR")
	String horarioBar;
	
	@Column(name="AREABAR")
	String areabar;
	
	@Column(name="CATEGORIABAR")
	String categoriaBar;
	
	@Column(name="CARACTERISTICABAR")
	String caracteristicaBar;
	
	@Column(name="DESCRIPCION")
	String descripcionBar;

	

	public Long getIdBar() {
		return idBar;
	}

	public void setIdBar(Long idBar) {
		this.idBar = idBar;
	}

	public String getNombreBar() {
		return nombreBar;
	}

	public void setNombreBar(String nombreBar) {
		this.nombreBar = nombreBar;
	}

	public String getDireccionBar() {
		return direccionBar;
	}

	public void setDireccionBar(String direccionBar) {
		this.direccionBar = direccionBar;
	}

	public String getTelefonoBar() {
		return telefonoBar;
	}

	public void setTelefonoBar(String telefonoBar) {
		this.telefonoBar = telefonoBar;
	}

	public String getCatPrecio() {
		return catPrecio;
	}

	public void setCatPrecio(String catPrecio) {
		this.catPrecio = catPrecio;
	}

	public String getHorarioBar() {
		return horarioBar;
	}

	public void setHorarioBar(String horarioBar) {
		this.horarioBar = horarioBar;
	}

	public String getAreabar() {
		return areabar;
	}

	public void setAreabar(String areabar) {
		this.areabar = areabar;
	}

	public String getCategoriaBar() {
		return categoriaBar;
	}

	public void setCategoriaBar(String categoriaBar) {
		this.categoriaBar = categoriaBar;
	}

	public String getCaracteristicaBar() {
		return caracteristicaBar;
	}

	public void setCaracteristicaBar(String caracteristicaBar) {
		this.caracteristicaBar = caracteristicaBar;
	}
	
	public String getDescripcionBar() {
		return descripcionBar;
	}

	public void setDescripcionBar(String descripcionBar) {
		this.descripcionBar = descripcionBar;
	}
}
