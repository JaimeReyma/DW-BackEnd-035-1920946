package com.backend.app.microfono.models.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.backend.app.microfono.models.dao.MicrofonoDao;
import com.backend.app.microfono.models.entity.Microfono;

@Service
public class MicrofonoServiceImpl implements MicrofonoService {

	@Autowired
	private MicrofonoDao dao;
	
	@Override
	@Transactional (readOnly = true)
	public List<Microfono> findAll() {
		return (List<Microfono>) dao.findAll();
	}

	@Override
	@Transactional (readOnly = true)
	public Microfono findById(Long id) {
		return dao.findById(id).orElse(null);
	}
	
	
	@Override
	@Transactional
	public Microfono save(Microfono microfono) {
	    microfono.setCreatedAt(new Date(0)); 
	    return dao.save(microfono);
	}
	
	
	@Override
	@Transactional
	public Microfono saved(Microfono microfono) {
	    return dao.save(microfono);
	}
	
	
	@Override
	@Transactional
	public void delete(Long id) {
		dao.deleteById(id);
	}


}
