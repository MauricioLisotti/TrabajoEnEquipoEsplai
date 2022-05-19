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
	@Column(name="id")
	Long idBar;
	
	@Column(name="NOMBRE")
	String nombreBar;
	
	@Column(name="TELEFONO")
	String telefonoBar;
	
	@Column(name="DIRECCION")
	String direccionBar;
	
	@Column(name="CATPRECIO")
	String catPrecio;
	
	@Column(name="AREA")
	String areabar;
	
	@Column(name="CATEGORIA")
	String categoriaBar;
	
	@Column(name="DESCRIPCION")
	String descripcionBar;

	@Column(name="ESPECIALIDADES")
	String especialidadesBar;
	
	@Column(name="redessociales")
	String redessociales;

	
	
	
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

	public String getTelefonoBar() {
		return telefonoBar;
	}

	public void setTelefonoBar(String telefonoBar) {
		this.telefonoBar = telefonoBar;
	}

	public String getDireccionBar() {
		return direccionBar;
	}

	public void setDireccionBar(String direccionBar) {
		this.direccionBar = direccionBar;
	}

	public String getCatPrecio() {
		return catPrecio;
	}

	public void setCatPrecio(String catPrecio) {
		this.catPrecio = catPrecio;
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

	public String getDescripcionBar() {
		return descripcionBar;
	}

	public void setDescripcionBar(String descripcionBar) {
		this.descripcionBar = descripcionBar;
	}

	public String getEspecialidadesBar() {
		return especialidadesBar;
	}

	public void setEspecialidadesBar(String especialidadesBar) {
		this.especialidadesBar = especialidadesBar;
	}

	public String getRedesSociales() {
		return redessociales;
	}

	public void setRedesSociales(String redesSociales) {
		this.redessociales = redesSociales;
	}
	
	/*
	@Column(name="id_propietario_propietario")
	String idPropietarioPropietario;
	
	*/
	
	
	
	
}
