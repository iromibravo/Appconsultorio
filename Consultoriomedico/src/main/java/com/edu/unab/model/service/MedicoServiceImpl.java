package com.edu.unab.model.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.edu.unab.model.entity.Medico;
import com.edu.unab.repository.MedicoRepository;

@Service

public class MedicoServiceImpl implements MedicoService {


	@Autowired
	private MedicoRepository medicoRepository;

	@Override
	@Transactional(readOnly = true)
	public Iterable<Medico> findAll() {
		
		return medicoRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Medico> findById(Integer id) {
		
		return medicoRepository.findById(id);
	}

	@Override
	@Transactional
	public Medico save(Medico c) {
		
		return medicoRepository.save(c);
	}

	@Override
	public void deleteById(Integer id) {
		
		medicoRepository.deleteById(id);
		
	}
}
