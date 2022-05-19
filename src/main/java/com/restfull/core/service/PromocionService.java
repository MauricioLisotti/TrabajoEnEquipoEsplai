package com.restfull.core.service;

import java.util.List;
import java.util.Optional;

import com.restfull.core.entities.Promocion;

public interface PromocionService {

	
	public List<Promocion> findAllPromocion();
	
	public Optional<Promocion> findPromocionById(Long id);

	public Promocion savePromocion(Promocion promocionNew);
	
	public String deletePromocion(Long id);
	
	public String updatePromocion(Promocion promocionNew);

	
	
}
