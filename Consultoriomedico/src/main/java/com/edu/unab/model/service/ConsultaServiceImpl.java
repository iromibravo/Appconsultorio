package com.edu.unab.model.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.edu.unab.model.entity.Consulta;
import com.edu.unab.repository.ConsultaRepository;

@Service

public class ConsultaServiceImpl implements ConsultaService {


	@Autowired
	private ConsultaRepository consultaRepository;

	@Override
	@Transactional(readOnly = true)
	public Iterable<Consulta> findAll() {
		
		return consultaRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Consulta> findById(Integer id) {
		
		return consultaRepository.findById(id);
	}

	@Override
	@Transactional
	public Consulta save(Consulta c) {
		
		return consultaRepository.save(c);
	}

	@Override
	public void deleteById(Integer id) {
		
		consultaRepository.deleteById(id);
		
	}
}
