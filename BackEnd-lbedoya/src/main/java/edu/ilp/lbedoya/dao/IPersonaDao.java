package edu.ilp.lbedoya.dao;

import edu.ilp.lbedoya.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonaDao extends JpaRepository<Persona,Long> {
}
