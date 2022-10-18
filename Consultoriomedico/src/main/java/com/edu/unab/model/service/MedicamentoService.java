package com.edu.unab.model.service;

import java.util.Optional;
import com.edu.unab.model.entity.Medicamento;

public interface MedicamentoService {
	public Iterable<Medicamento>findAll();
	public Optional<Medicamento>findById(Integer id);
	public Medicamento save(Medicamento c);
	public void deleteById(Integer id);

}

