package com.edu.unab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.edu.unab.model.entity.Medico;

@Repository
public interface MedicoRepository  extends JpaRepository<Medico, Integer> {

}