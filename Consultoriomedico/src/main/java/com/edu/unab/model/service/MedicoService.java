package com.edu.unab.model.service;

import java.util.Optional;
import com.edu.unab.model.entity.Medico;

public interface MedicoService {

		public Iterable<Medico>findAll();
		public Optional<Medico>findById(Integer id);
		public Medico save(Medico c);
		public void deleteById(Integer id);

}
