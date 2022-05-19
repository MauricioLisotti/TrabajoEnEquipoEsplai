package com.restfull.core.serviceImpl;


import com.restfull.core.entities.Bar;
import com.restfull.core.repository.BarRepository;
import com.restfull.core.service.BarService;




import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class BarServiceImpl implements BarService{

	@Autowired
	BarRepository barRepository;
	
	@Override
	public List<Bar> findAllBars() {
		return barRepository.findAll();
	}

	@Override
	public Optional<Bar> findBarById(Long id) {
		Optional<Bar> bar = barRepository.findById(id);
		return bar;
		
	}
	
	@Override
	public Bar saveBar(Bar barNew) {
		if (barNew != null) {
			return barRepository.save(barNew);
		}
		return new Bar();
	}

	@Override
	public String deleteBar(Long id) {
		if (barRepository.findById(id).isPresent()) {
			barRepository.deleteById(id);
			return "Bar eliminado correctamente.";
		}
		return "Error! El bar no existe";
	}

	@Override
	public String updateBar(Bar barUpdated) {
		Long num = barUpdated.getIdBar();
		if (barRepository.findById(num).isPresent()) {
			Bar barToUpdate = new Bar();
			barToUpdate.setIdBar(barUpdated.getIdBar());
			barToUpdate.setNombreBar(barUpdated.getNombreBar());
			barToUpdate.setTelefonoBar(barUpdated.getTelefonoBar());
			barToUpdate.setDireccionBar(barUpdated.getDireccionBar());
			barToUpdate.setCatPrecio(barUpdated.getCatPrecio());
			barToUpdate.setAreabar(barUpdated.getAreabar());
			barToUpdate.setCategoriaBar(barUpdated.getCategoriaBar());
			barToUpdate.setDescripcionBar(barUpdated.getDescripcionBar());
			barToUpdate.setEspecialidadesBar(barUpdated.getEspecialidadesBar());
			barToUpdate.setRedesSociales(barUpdated.getRedesSociales());
			barToUpdate.setIdPropietario(barUpdated.getIdPropietario());
			
			
			
			barRepository.save(barToUpdate);
			return "Bar modificado";
		}
		return "Error al modificar el bar";
	}

	
}
