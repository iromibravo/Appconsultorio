package com.edu.unab.controller;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.edu.unab.model.entity.Turno;
import com.edu.unab.model.service.TurnoService;

@RestController
@RequestMapping("/api/turno")

public class TurnoController  {
	
	@Autowired
	private TurnoService turnoservice;
	
	@PostMapping
	
	public Turno guardar(@RequestBody Turno turno) {
		
		return turnoservice.save(turno);
	}
	

	@GetMapping("/{id}")
	public Optional<Turno>buscarPorId(@PathVariable Integer id){
		
		return turnoservice.findById(id);
	}
	
	@GetMapping("/listar")
	public Iterable<Turno>listarTodos(){
		
		return turnoservice.findAll();
	}
	

	@DeleteMapping("{id}")

	public void eliminar(@PathVariable Integer id) {
		
		turnoservice.deleteById(id);
	}
	
}


