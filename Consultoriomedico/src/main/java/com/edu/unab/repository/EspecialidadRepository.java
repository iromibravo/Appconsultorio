package com.edu.unab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.edu.unab.model.entity.Especialidad;

@Repository
public interface EspecialidadRepository   extends JpaRepository<Especialidad, Integer> {

}