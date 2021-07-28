package com.starter.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.starter.demo.models.Team;

@Repository
public interface TeamRepository extends CrudRepository<Team, Long>{
	// Team save(Team team); CREATING, UPDATING
	// Team findById(Long id); GET ONE TEAM BY ID
	// void deleteById(Long id); DELETE ONE TEAM BY ID
	List<Team> findAll();
}
