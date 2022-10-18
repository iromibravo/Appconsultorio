package com.edu.unab.model.service;

import java.util.Optional;
import com.edu.unab.model.entity.Cita;

public interface CitaService {

		public Iterable<Cita>findAll();
		public Optional<Cita>findById(Integer id);
		public Cita save(Cita c);
		public void deleteById(Integer id);

}
