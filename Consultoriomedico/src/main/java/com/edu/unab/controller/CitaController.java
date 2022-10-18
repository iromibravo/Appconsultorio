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
import com.edu.unab.model.entity.Cita;
import com.edu.unab.model.service.CitaService;

@RestController
@RequestMapping("/api/cita")

public class CitaController{
	
	@Autowired
	private CitaService citaservice;
	
	@PostMapping
	public Cita guardar(@RequestBody Cita cita) {
		
		return citaservice.save(cita);
	}
	
	@GetMapping("/{id}")
	public Optional<Cita>buscarPorId(@PathVariable Integer id){
		
		return citaservice.findById(id);
	}
	
	@GetMapping("/listar")
	public Iterable<Cita>listarTodos(){
		
		return citaservice.findAll();
	}
	
	@DeleteMapping("{id}")

	public void eliminar(@PathVariable Integer id) {
		
		citaservice.deleteById(id);
	}
}
