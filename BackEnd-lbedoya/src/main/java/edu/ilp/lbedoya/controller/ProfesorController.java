package edu.ilp.lbedoya.controller;

import edu.ilp.lbedoya.entity.Asignatura;
import edu.ilp.lbedoya.service.IProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("profesor")
public class ProfesorController {

    @Autowired
    private IProfesorService profesorService;

    @GetMapping( "/listarCursosPorProfesor" )
    public List<Asignatura> obtenerCursosPorProfesor(@RequestParam Long idprofesor){
        return profesorService.obtenerCursoPorProfesor (idprofesor);
    }
}
