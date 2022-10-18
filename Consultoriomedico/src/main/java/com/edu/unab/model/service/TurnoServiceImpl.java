package com.edu.unab.model.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.edu.unab.model.entity.Turno;
import com.edu.unab.repository.TurnoRepository;

@Service

public class TurnoServiceImpl  implements TurnoService {


	@Autowired
	private TurnoRepository turnoRepository;

	@Override
	@Transactional(readOnly = true)
	public Iterable<Turno> findAll() {
		
		return turnoRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Turno> findById(Integer id) {
		
		return turnoRepository.findById(id);
	}

	@Override
	@Transactional
	public Turno save(Turno c) {
		
		return turnoRepository.save(c);
	}

	@Override
	public void deleteById(Integer id) {
		
		turnoRepository.deleteById(id);
		
	}

}