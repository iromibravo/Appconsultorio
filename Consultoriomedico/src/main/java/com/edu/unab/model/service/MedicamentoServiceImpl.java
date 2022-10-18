package com.edu.unab.model.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.edu.unab.model.entity.Medicamento;
import com.edu.unab.repository.MedicamentoRepository;

@Service
public class MedicamentoServiceImpl implements MedicamentoService {


	@Autowired
	private MedicamentoRepository medicamentoRepository;

	@Override
	@Transactional(readOnly = true)
	public Iterable<Medicamento> findAll() {
		
		return medicamentoRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Medicamento> findById(Integer id) {
		
		return medicamentoRepository.findById(id);
	}

	@Override
	@Transactional
	public Medicamento save(Medicamento c) {
		
		return medicamentoRepository.save(c);
	}

	@Override
	public void deleteById(Integer id) {
		
		medicamentoRepository.deleteById(id);
		
	}
}
