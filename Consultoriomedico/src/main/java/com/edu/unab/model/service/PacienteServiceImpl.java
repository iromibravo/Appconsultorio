package com.edu.unab.model.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.edu.unab.model.entity.Paciente;
import com.edu.unab.repository.PacienteRepository;

@Service
public class PacienteServiceImpl implements PacienteService {


	@Autowired
	private PacienteRepository pacienteRepository;

	@Override
	@Transactional(readOnly = true)
	public Iterable<Paciente> findAll() {
		
		return pacienteRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Paciente> findById(Integer id) {
		
		return pacienteRepository.findById(id);
	}

	@Override
	@Transactional
	public Paciente save(Paciente c) {
		
		return pacienteRepository.save(c);
	}

	@Override
	public void deleteById(Integer id) {
		
		pacienteRepository.deleteById(id);
		
	}
}
