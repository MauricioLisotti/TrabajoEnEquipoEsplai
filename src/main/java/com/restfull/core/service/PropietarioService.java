package com.restfull.core.service;

import java.util.List;
import java.util.Optional;

import com.restfull.core.entities.Propietario;

public interface PropietarioService{

	public List<Propietario> findAllPropietarios();
	
	public Optional<Propietario> findPropietarioById(Long id);

	public Propietario savePropietario(Propietario propietarioNew);
	
	public String deletePropietario(Long id);
	
	public String updatePropietario(Propietario propietarioNew);

}
