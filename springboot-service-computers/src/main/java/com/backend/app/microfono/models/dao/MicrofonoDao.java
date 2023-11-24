package com.backend.app.microfono.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.backend.app.microfono.models.entity.Microfono;

public interface MicrofonoDao extends CrudRepository<Microfono, Long>{

}
