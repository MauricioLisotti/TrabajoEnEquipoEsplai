package com.restfull.core.controllers.impl;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.restfull.core.controllers.HorarioController;
import com.restfull.core.entities.Horario;
import com.restfull.core.service.HorarioService;

@RestController
public class HorarioControllerImpl implements HorarioController{

	@Autowired
	HorarioService horarioService;
	
	// http://localhost:8888/horario (GET)
	@RequestMapping(value = "/horario", method = RequestMethod.GET, produces = "application/json")
	@Override
	public List<Horario> getHorario() {
		return horarioService.findAllHorario();
	}

	// http://localhost:8888/horario/1 (GET)
	@RequestMapping(value = "/horario/{id}", method = RequestMethod.GET, produces = "application/json")
	@Override
	public Optional<Horario> getHorarioById(@PathVariable Long id) {
		return horarioService.findHorarioById(id);
	}
	
	// http://localhost:8888/horario/add (ADD)
	@RequestMapping(value = "/horario/add", method = RequestMethod.POST, produces = "application/json")
	@Override
	public Horario addHorario(Horario horario) {
		return horarioService.saveHorario(horario);
	}
	
	// http://localhost:8888/horario/delete/1 (GET)
	@RequestMapping(value = "/horario/delete/{id}", method = RequestMethod.GET, produces = "application/json")
	@Override
	public String deleteHorario(@PathVariable Long id) {
		return horarioService.deleteHorario(id);
	}

	// http://localhost:8888/horario/update (PATCH)
	@Override
	@RequestMapping(value = "/horario/update", method = RequestMethod.PATCH, produces = "application/json")
		public String updateHorario(Horario horarioNew) {
		return horarioService.updateHorario(horarioNew);
	}

	// http://localhost:8888/test (GET)
	@RequestMapping(value = "/horario/test", method = RequestMethod.GET, produces = "application/json")
	@Override
	public String testHorario() {
		return "Test done";
	}
	

}
