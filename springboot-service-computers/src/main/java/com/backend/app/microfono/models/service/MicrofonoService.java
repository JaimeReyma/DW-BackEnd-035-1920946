package com.backend.app.microfono.models.service;

import java.util.List;

import com.backend.app.microfono.models.entity.Microfono;

public interface MicrofonoService {	
	
	public List<Microfono> findAll();
	
	public Microfono findById(Long id);
}
