package edu.ilp.lbedoya.dao;

import edu.ilp.lbedoya.entity.Asignatura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAsignaturaDao extends JpaRepository<Asignatura,Long> {
}
