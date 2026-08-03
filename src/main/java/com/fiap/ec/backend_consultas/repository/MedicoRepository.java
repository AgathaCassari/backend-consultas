package com.fiap.ec.backend_consultas.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.fiap.ec.backend_consultas.model.Medico;
public interface MedicoRepository extends JpaRepository<Medico, Long> {
}