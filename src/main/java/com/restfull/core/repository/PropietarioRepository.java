package com.restfull.core.repository;

import java.util.Optional;
import com.restfull.core.entities.Propietario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PropietarioRepository extends JpaRepository<Propietario, Long>{

	Void save(Optional<Propietario> propietarioToUpdate);

}

