package com.restfull.core.service;

import java.util.List;
import java.util.Optional;
import com.restfull.core.entities.Horario;

public interface HorarioService {

	public List<Horario> findAllHorario();
	
	public Optional<Horario> findHorarioById(Long id);

	public Horario saveHorario(Horario horarioNew);
	
	public String deleteHorario(Long id);
	
	public String updateHorario(Horario horarioNew);

}
