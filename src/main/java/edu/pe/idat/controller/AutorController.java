package edu.pe.idat.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.pe.idat.model.Autor;
import edu.pe.idat.service.AutorService;

@RestController
@RequestMapping("/api/autor")
@CrossOrigin(origins = "*") // Puedes considerar eliminar esto si ya configuraste CORS globalmente
public class AutorController {
	
	@Autowired
	private AutorService autorServ; 
	
	
	
	//Listar
	@GetMapping("/listar")
	public List<Autor> listarAutores(){
		return autorServ.listarTodo();
	}
	
	
	
	//Grabar
	@PostMapping("/guardar")
	public Autor guardarAutores(@RequestBody Autor a) {
		return autorServ.guardarAutor(a);
	}
	
	
	
	//listarxid
	@GetMapping("listarById/{id}")
	public Optional<Autor> listarAutoresById(@PathVariable Long id){
		return autorServ.listarxid(id);
	}
	
	
	 
	//Eliminar
	@DeleteMapping("/eliminar/{id}")
	public String eliminarAutores(@PathVariable Long id) {
		autorServ.eliminarAutor(id);
		return "Eliminado correctamente";
	}
	
	
	
	//Actualizar
	@PutMapping("/actualizar")
	public String actualizarAutor(@RequestBody Autor autorActualizado) {
		
	    Optional<Autor> autorExistenteOptional = autorServ.listarxid(autorActualizado.getIdAutor());

	    if (autorExistenteOptional.isPresent()) {
	        Autor autorExistente = autorExistenteOptional.get();

	        // Actualizar campos del autor existente con los valores proporcionados
	        autorExistente.setNombreAutor(autorActualizado.getNombreAutor());
	        autorExistente.setNumeroTelefono(autorActualizado.getNumeroTelefono());
	        autorExistente.setCorreoElectronico(autorActualizado.getCorreoElectronico());
	        autorExistente.setNacionalidad(autorActualizado.getNacionalidad());
	        autorExistente.setSalario(autorActualizado.getSalario());
	        // Actualizar otros campos según sea necesario

	        // Llama al servicio para realizar la actualización
	        autorServ.actualizarAutor(autorExistente);
	        return "Actualizado correctamente";
	    } else {
	        // Manejar el caso en el que no se encuentra ningún autor con el ID proporcionado
	        return "No se pudo actualizar";
	    }
	}
	

	
	
	
	
	
	
	
	
	
	
	

}
