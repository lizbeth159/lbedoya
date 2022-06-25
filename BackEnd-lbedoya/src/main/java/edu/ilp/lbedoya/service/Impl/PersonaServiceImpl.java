package edu.ilp.lbedoya.service.Impl;

import edu.ilp.lbedoya.dao.IPersonaDao;
import edu.ilp.lbedoya.entity.Persona;
import edu.ilp.lbedoya.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements IPersonaService {
    @Autowired
    private IPersonaDao personaDao;

    @Override
    public List<Persona> listarPersona() {
        return this.personaDao.findAll();
    }
}
