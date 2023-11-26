package com.backend.app.microfono.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.backend.app.microfono.models.entity.Microfono;
import com.backend.app.microfono.models.service.MicrofonoService;

@RestController
public class MicrofonoController {
	
	@Autowired
	private MicrofonoService microService;
	//Definicion de endpoints
	@GetMapping("/list")
	public List <Microfono> list(){
		
		return microService.findAll();
	}
	
	@GetMapping("/microfono/{id}")
	public Microfono detail(@PathVariable Long id) {
		return microService.findById(id);
	}
	
	
	@PostMapping("/microfono")
	public Microfono create(@RequestBody Microfono microfono) {
		return microService.save(microfono);
	}
	
	
	@PutMapping("/microfono/{id}")
	public Microfono update(@PathVariable Long id, @RequestBody Microfono microfonoDetails) {
	    Microfono microfono = microService.findById(id);
	  	    
	    microfono.setName(microfonoDetails.getName());
	    microfono.setMarca(microfonoDetails.getMarca());
	    
	    return microService.save(microfono);
	}
	
	
	@DeleteMapping("/microfono/{id}")
	public void delete(@PathVariable Long id) {
		microService.delete(id);
	}
}

	//POSTMAPPING
	//UPDATEMAPPING
	//DELETE

