package edu.pe.idat.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.pe.idat.model.Autor;
import edu.pe.idat.repository.AutorRepository;
import jakarta.transaction.Transactional;

@Service
public class AutorService {
	
	@Autowired
	private AutorRepository autorRepo;
	
	/*
    public List<Autor> buscarAutoresPorEstadoYNacionalidad(String estado, String nacionalidad) {
        return autorRepo.buscarAutoresPorEstadoYNacionalidad(estado, nacionalidad);
    }
    */
    
    //metodo listar todo 
    public List<Autor> listarTodo(){
    	return autorRepo.findAll();
    }
    
    //metodo listarById
    public Optional<Autor> listarxid(Long id){
    	return autorRepo.findById(id);
    }
    
    
    //metodo grabar
    @Transactional
    public Autor guardarAutor(Autor a) {
    	try {
    		return autorRepo.save(a);
		} catch (Exception e) {
			return null;
		}
    }
    
    //metodo actualizar
    public Autor actualizarAutor(Autor a) {
    	return autorRepo.save(a);
    }
    
    //metodo eliminar
    public void eliminarAutor(Long id) {
    	autorRepo.deleteById(id);
    }

	
	
	
	
	
	
	
	
	
	
	

}
