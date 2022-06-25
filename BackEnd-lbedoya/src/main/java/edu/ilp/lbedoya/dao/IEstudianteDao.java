package edu.ilp.lbedoya.dao;

import edu.ilp.lbedoya.entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IEstudianteDao extends JpaRepository<Estudiante,Long> {
    @Query("SELECT e FROM Estudiante e WHERE e.codigo = :codigo")
    Estudiante obtenerEstudiantePorCodigo(@Param("codigo") String codigo);

}
