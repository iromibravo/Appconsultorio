package com.edu.unab.model.service;

import java.util.Optional;
import com.edu.unab.model.entity.Consulta;

public interface ConsultaService {

		public Iterable<Consulta>findAll();
		public Optional<Consulta>findById(Integer id);
		public Consulta save(Consulta c);
		public void deleteById(Integer id);

}
