package edu.pe.idat.repository;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.pe.idat.model.Libro;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Long> {
	
	
	/*
    @Procedure(name = "ConsultaLibros")
    Integer ConsultaLibros(@Param("facultad_nombre") String facultadNombre, @Param("escuela_nombre") String escuelaNombre);
    
    @Procedure(name = "ContarLibrosParametro")
    Integer contarLibrosParametro(@Param("precioLimite") BigDecimal precioLimite);
    */
	
    @Procedure(name = "ConsultaLibrosFinal")
    Integer consultaLibrosFinal(@Param("Cod_Facultad") Long Cod_Facultad, @Param("Cod_Escuela") Long Cod_Escuela);

}
