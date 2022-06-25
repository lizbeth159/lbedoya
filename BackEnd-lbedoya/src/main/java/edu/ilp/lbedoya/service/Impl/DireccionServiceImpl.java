package edu.ilp.lbedoya.service.Impl;

import edu.ilp.lbedoya.dao.IDireccionDao;
import edu.ilp.lbedoya.entity.Direccion;
import edu.ilp.lbedoya.service.IDireccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DireccionServiceImpl implements IDireccionService {

    @Autowired
    IDireccionDao direccionDao;

    @Override
    public Direccion obtenerDireccionPorCodigo(String codigo) {
        return this.direccionDao.obtenerDireccionPorCodigo(codigo);
    }
}
