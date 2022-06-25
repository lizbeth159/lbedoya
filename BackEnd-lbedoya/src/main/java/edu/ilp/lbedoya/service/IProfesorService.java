package edu.ilp.lbedoya.service;

import edu.ilp.lbedoya.entity.Asignatura;

import java.util.List;

public interface IProfesorService {
    List<Asignatura> obtenerCursoPorProfesor(Long id_profesor);
}
