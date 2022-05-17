package com.restfull.core.service;

import java.util.List;
import java.util.Optional;



import com.restfull.core.entities.Bar;

public interface BarService {
	
	public List<Bar> findAllBars();
	
	public Optional<Bar> findBarById(Long id);

	public Bar saveBar(Bar barNew);
	
	public String deleteBar(Long id);
	
	public String updateBar(Bar barNew);



	
}
