package edu.ilp.lbedoya.service;

import edu.ilp.lbedoya.entity.Asignatura;

import java.util.List;

public interface IAsignaturaService {
    Asignatura guardarAsignatura(Asignatura asignatura);

    List<Asignatura> listarAsignatura();
}
