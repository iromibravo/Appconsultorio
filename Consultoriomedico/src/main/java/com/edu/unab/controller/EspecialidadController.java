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
import com.edu.unab.model.entity.Especialidad;
import com.edu.unab.model.service.EspecialidadService;

@RestController
@RequestMapping("/api/especialidad")

public class EspecialidadController {
	
	@Autowired
	private EspecialidadService especialidadservice;
	
	@PostMapping
	
	public Especialidad guardar(@RequestBody Especialidad especialidad) {
		
		return especialidadservice.save(especialidad);
	}
	

	@GetMapping("/{id}")
	public Optional<Especialidad>buscarPorId(@PathVariable Integer id){
		
		return especialidadservice.findById(id);
	}
	
	@GetMapping("/listar")
	public Iterable<Especialidad>listarTodos(){
		
		return especialidadservice.findAll();
	}
	

	@DeleteMapping("{id}")

	public void eliminar(@PathVariable Integer id) {
		
		especialidadservice.deleteById(id);
	}
	
}

