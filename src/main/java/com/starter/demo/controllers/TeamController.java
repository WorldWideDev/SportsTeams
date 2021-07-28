package com.starter.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.starter.demo.models.Team;
import com.starter.demo.services.TeamService;

@RestController
public class TeamController {
	private TeamService service;
	public TeamController(TeamService service) {
		this.service = service;
	}
	// Get all teams
	@GetMapping("/")
	public List<Team> index() {
		return this.service.getAll();
	}
	@PostMapping("/create")
	public Team createTeam(Team team) {
		return this.service.create(team);
	}
	// GET localhost:8080/2
	@GetMapping("/{id}")
	public Team getOneTeam(@PathVariable Long id) {
		return this.service.getOne(id);
	}
	@DeleteMapping("/{id}/delete")
	// DELETE localhost:8080/2
	public void delete(@PathVariable Long id) {
		this.service.deleteById(id);
	}
	
	@PutMapping("/{id}/update")
	public Team update(@PathVariable Long id, Team team) {
		return this.service.update(team);
	}
}
