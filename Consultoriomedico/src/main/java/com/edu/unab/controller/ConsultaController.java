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
import com.edu.unab.model.entity.Consulta;
import com.edu.unab.model.service.ConsultaService;

@RestController
@RequestMapping("/api/consulta")

public class ConsultaController {
	
	@Autowired
	private ConsultaService consultaservice;
	
	@PostMapping
	
	public Consulta guardar(@RequestBody Consulta consulta) {
		
		return consultaservice.save(consulta);
	}
	

	@GetMapping("/{id}")
	public Optional<Consulta>buscarPorId(@PathVariable Integer id){
		
		return consultaservice.findById(id);
	}
	
	@GetMapping("/listar")
	public Iterable<Consulta>listarTodos(){
		
		return consultaservice.findAll();
	}
	

	@DeleteMapping("{id}")

	public void eliminar(@PathVariable Integer id) {
		
		consultaservice.deleteById(id);
	}
	
	

}
