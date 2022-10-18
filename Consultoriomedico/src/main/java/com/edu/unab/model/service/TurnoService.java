package com.edu.unab.model.service;

import java.util.Optional;
import com.edu.unab.model.entity.Turno;

public interface TurnoService {
		public Iterable<Turno>findAll();
		public Optional<Turno>findById(Integer id);
		public Turno save(Turno c);
		public void deleteById(Integer id);

}