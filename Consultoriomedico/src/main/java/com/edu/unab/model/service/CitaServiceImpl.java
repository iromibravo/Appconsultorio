package com.edu.unab.model.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.edu.unab.model.entity.Cita;
import com.edu.unab.repository.CitaRepository;

@Service

public class CitaServiceImpl implements CitaService {


	@Autowired
	private CitaRepository citaRepository;

	@Override
	@Transactional(readOnly = true)
	public Iterable<Cita> findAll() {
		
		return citaRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Cita> findById(Integer id) {
		
		return citaRepository.findById(id);
	}

	@Override
	@Transactional
	public Cita save(Cita c) {
		
		return citaRepository.save(c);
	}

	@Override
	public void deleteById(Integer id) {
		
		citaRepository.deleteById(id);
		
	}
}
