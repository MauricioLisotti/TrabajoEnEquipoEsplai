package com.restfull.core.repository;

import java.util.Optional;

import com.restfull.core.entities.Promocion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PromocionRepository extends JpaRepository<Promocion, Long>{

	Void save(Optional<Promocion> promocionToUpdate);

}
