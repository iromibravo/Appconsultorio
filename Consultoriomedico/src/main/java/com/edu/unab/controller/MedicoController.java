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
import com.edu.unab.model.entity.Medico;
import com.edu.unab.model.service.MedicoService;

@RestController
@RequestMapping("/api/medico")

public class MedicoController{
	
	@Autowired
	private MedicoService medicoservice;
	
	@PostMapping
	
	public Medico guardar(@RequestBody Medico medico) {
		
		return medicoservice.save(medico);
	}
	

	@GetMapping("/{id}")
	public Optional<Medico>buscarPorId(@PathVariable Integer id){
		
		return medicoservice.findById(id);
	}
	
	@GetMapping("/listar")
	public Iterable<Medico>listarTodos(){
		
		return medicoservice.findAll();
	}
	

	@DeleteMapping("{id}")

	public void eliminar(@PathVariable Integer id) {
		
		medicoservice.deleteById(id);
	}
	
}
