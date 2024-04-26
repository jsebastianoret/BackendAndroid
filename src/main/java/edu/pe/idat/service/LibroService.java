package edu.pe.idat.service;

import java.math.BigDecimal;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.pe.idat.repository.LibroRepository;

@Service
public class LibroService {
	
	@Autowired
    private LibroRepository libroRepository;
	
	/*
	//Metodo del procedure
    public int consultarCantidadLibros(String facultadNombre, String escuelaNombre) {
        return libroRepository.ConsultaLibros(facultadNombre, escuelaNombre);
    }
    
    public int contarLibrosParametro(BigDecimal precioLimite) {
        Integer resultado = libroRepository.contarLibrosParametro(precioLimite);
        return resultado != null ? resultado : 0;
    }
    */
    
    //Esto vale con 2 parametros
    public Integer consultaLibrosFinal(Long Cod_Facultad, Long Cod_Escuela) {
        return libroRepository.consultaLibrosFinal(Cod_Facultad, Cod_Escuela);
    }

}
