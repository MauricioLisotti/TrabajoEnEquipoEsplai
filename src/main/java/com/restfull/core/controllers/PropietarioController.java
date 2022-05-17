package com.restfull.core.controllers;


import java.util.List;
import java.util.Optional;
import com.restfull.core.entities.Propietario;

public interface PropietarioController {
	
	public List<Propietario> getPropietario();

	public Optional<Propietario> getPropietarioById(Long id);

	public Propietario addPropietario(Propietario propietario);

	public String deletePropietario(Long id);

	public String updatePropietario(Propietario propietarioNew);

	public String test();
	
}
