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
import com.edu.unab.model.entity.Medicamento;
import com.edu.unab.model.service.MedicamentoService;

@RestController
@RequestMapping("/api/medicamento")

public class MedicamentoController {
	
	@Autowired
	private MedicamentoService medicamentoservice;
	
	@PostMapping
	
	public Medicamento guardar(@RequestBody Medicamento medicamento) {
		
		return medicamentoservice.save(medicamento);
	}
	

	@GetMapping("/{id}")
	public Optional<Medicamento>buscarPorId(@PathVariable Integer id){
		
		return medicamentoservice.findById(id);
	}
	
	@GetMapping("/listar")
	public Iterable<Medicamento>listarTodos(){
		
		return medicamentoservice.findAll();
	}
	

	@DeleteMapping("{id}")

	public void eliminar(@PathVariable Integer id) {
		
		medicamentoservice.deleteById(id);
	}
	
	

}
