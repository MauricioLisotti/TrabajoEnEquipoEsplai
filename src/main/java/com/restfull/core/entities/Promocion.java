package com.restfull.core.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "promocion")
public class Promocion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	Long idPromocion;
	
	@Column(name="TITULO")
	String titulo;
	
	@Column(name="DESCRIPCION")
	String descripcion;
	
	@Column(name="URL_IMAGEN")
	String urlImagen;
	
	@Column(name="ID_BAR")
	String idBar;
	
	public Long getIdPromocion() {
		return idPromocion;
	}

	public void setIdPromocion(Long idPromocion) {
		this.idPromocion = idPromocion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getUrlImagen() {
		return urlImagen;
	}

	public void setUrlImagen(String urlImagen) {
		this.urlImagen = urlImagen;
	}

	public String getIdBar() {
		return idBar;
	}

	public void setIdBar(String idBar) {
		this.idBar = idBar;
	}

	

}
