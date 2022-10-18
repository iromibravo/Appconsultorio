package com.edu.unab.model.service;

import java.util.Optional;
import com.edu.unab.model.entity.Especialidad;

public interface EspecialidadService {

		public Iterable<Especialidad>findAll();
		public Optional<Especialidad>findById(Integer id);
		public Especialidad save(Especialidad c);
		public void deleteById(Integer id);

}
