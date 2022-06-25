package edu.ilp.lbedoya.service.Impl;

import edu.ilp.lbedoya.dao.IAsignaturaDao;
import edu.ilp.lbedoya.entity.Asignatura;
import edu.ilp.lbedoya.service.IAsignaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AsignaturaServiceImpl implements IAsignaturaService {
    @Autowired
    IAsignaturaDao asignaturaDao;

    @Override
    public Asignatura guardarAsignatura(Asignatura asignatura) {
        return this.asignaturaDao.save(asignatura);
    }

    @Override
    public List<Asignatura> listarAsignatura() {
        return this.asignaturaDao.findAll();
    }
}
