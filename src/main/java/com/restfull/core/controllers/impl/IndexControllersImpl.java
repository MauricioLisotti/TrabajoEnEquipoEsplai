package com.restfull.core.controllers.impl;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.restfull.core.controllers.IndexControllers;

@RestController
public class IndexControllersImpl implements IndexControllers{
	
	
	@RequestMapping(value = "/propietario2", method = RequestMethod.GET)
	public String helloWorld(Model model) {
        model.addAttribute("titulo", "Hola Mundo nuevo");
		
		return "Hello World";
    }

	@GetMapping("/holamundo")  
	@Override
	public String holaMundo() {
		return "hola mundo";
	}


	
	
	
}
