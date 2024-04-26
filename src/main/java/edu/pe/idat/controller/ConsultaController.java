package edu.pe.idat.controller;

import java.math.BigDecimal;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.pe.idat.service.LibroService;

@RestController
@RequestMapping("api/consultaLibro")
@CrossOrigin(origins = "*") // Puedes considerar eliminar esto si ya configuraste CORS globalmente
public class ConsultaController {
	
	
	
    @Autowired
    private LibroService libroService;

    /*
    @GetMapping("/cantidadLibros")
    public ResponseEntity<Integer> consultarCantidadLibros(@RequestParam String facultadNombre, @RequestParam String escuelaNombre) {
        int cantidadLibros = libroService.consultarCantidadLibros(facultadNombre, escuelaNombre);
        return ResponseEntity.ok(cantidadLibros);
    }
    
    
    @GetMapping("/cantidad")
    public int consultarLibros(@RequestParam BigDecimal precioLimite) {
        return libroService.contarLibrosParametro(precioLimite);
    }
	*/
    
    @GetMapping("/consultaLibrosFinal/{Cod_Facultad}/{Cod_Escuela}")
    public Integer consultaLibrosFinal(
            @PathVariable("Cod_Facultad") Long Cod_Facultad,
            @PathVariable("Cod_Escuela") Long Cod_Escuela) {

    	Integer cantidadLibros = libroService.consultaLibrosFinal(Cod_Facultad, Cod_Escuela);

        return cantidadLibros; 
    }
	

}
