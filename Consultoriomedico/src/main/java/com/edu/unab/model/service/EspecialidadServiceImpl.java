package com.edu.unab.model.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.edu.unab.model.entity.Especialidad;
import com.edu.unab.repository.EspecialidadRepository;

@Service

public class EspecialidadServiceImpl implements EspecialidadService {


	@Autowired
	private EspecialidadRepository especialidadRepository;

	@Override
	@Transactional(readOnly = true)
	public Iterable<Especialidad> findAll() {
		
		return especialidadRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Especialidad> findById(Integer id) {
		
		return especialidadRepository.findById(id);
	}

	@Override
	@Transactional
	public Especialidad save(Especialidad c) {
		
		return especialidadRepository.save(c);
	}

	@Override
	public void deleteById(Integer id) {
		
		especialidadRepository.deleteById(id);
		
	}
}
