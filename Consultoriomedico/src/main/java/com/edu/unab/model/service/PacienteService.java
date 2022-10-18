package com.edu.unab.model.service;

import java.util.Optional;
import com.edu.unab.model.entity.Paciente;

public interface PacienteService {

		public Iterable<Paciente>findAll();
		public Optional<Paciente>findById(Integer id);
		public Paciente save(Paciente c);
		public void deleteById(Integer id);

}