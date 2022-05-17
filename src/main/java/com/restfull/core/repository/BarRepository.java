package com.restfull.core.repository;

import java.util.Optional;
import com.restfull.core.entities.Bar;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BarRepository extends JpaRepository<Bar, Long>{
	
	Void save(Optional<Bar> barToUpdate);

}
