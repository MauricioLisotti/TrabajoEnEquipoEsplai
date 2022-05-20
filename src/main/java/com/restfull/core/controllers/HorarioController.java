package com.restfull.core.controllers;

import java.util.List;
import java.util.Optional;

import com.restfull.core.entities.Horario;

public interface HorarioController {

	public List<Horario> getHorario();

	public Optional<Horario> getHorarioById(Long id);

	public Horario addHorario(Horario horario);

	public String deleteHorario(Long id);

	public String updateHorario(Horario horarioNew);

	public String testHorario();

	
}
