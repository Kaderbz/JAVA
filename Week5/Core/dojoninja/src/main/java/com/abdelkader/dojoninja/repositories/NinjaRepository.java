package com.abdelkader.dojoninja.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.abdelkader.dojoninja.models.Dojo;
import com.abdelkader.dojoninja.models.Ninja;

public interface NinjaRepository extends CrudRepository<Ninja, Long> {
	
	List<Ninja> findAll();
	List<Ninja> findAllByDojo(Dojo dojo);
}