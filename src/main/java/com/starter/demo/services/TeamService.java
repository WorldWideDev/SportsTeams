package com.starter.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.starter.demo.models.Team;
import com.starter.demo.repositories.TeamRepository;

@Service
public class TeamService {
	private TeamRepository repo;
	public TeamService(TeamRepository repo) {
		this.repo = repo;
	}
	public List<Team> getAll() {
		return this.repo.findAll();
	}
	// create a team
	public Team create(Team team) {
		return this.repo.save(team);
	}
	// delete a team
	public void deleteById(Long id) {
		this.repo.deleteById(id);
	}
	// update a team
	public Team update(Team team) {
		return this.repo.save(team);
	}
	// get one team (by id)
	public Team getOne(Long id) {
		// if no teams are found with provided id, return null
		return this.repo.findById(id).orElse(null);
	}
}
