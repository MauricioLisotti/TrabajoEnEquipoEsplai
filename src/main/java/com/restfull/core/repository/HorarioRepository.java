package com.restfull.core.repository;

import java.util.Optional;

import com.restfull.core.entities.Horario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HorarioRepository extends JpaRepository<Horario, Long>{

	Void save(Optional<Horario> horarioToUpdate);
	
}
