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
import com.edu.unab.model.entity.Paciente;
import com.edu.unab.model.service.PacienteService;

@RestController
@RequestMapping("/api/paciente")
public class PacienteController{
	
	@Autowired
	private PacienteService pacienteservice;
	
	@PostMapping
	public Paciente guardar(@RequestBody Paciente paciente) {
		
		return pacienteservice.save(paciente);
	}
	
	@GetMapping("/{id}")
	public Optional<Paciente>buscarPorId(@PathVariable Integer id){
		
		return pacienteservice.findById(id);
	}
	
	@GetMapping("/listar")
	public Iterable<Paciente>listarTodos(){
		
		return pacienteservice.findAll();
	}
	
	@DeleteMapping("{id}")

	public void eliminar(@PathVariable Integer id) {
		
		pacienteservice.deleteById(id);
	}
	
}

