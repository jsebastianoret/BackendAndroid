package edu.pe.idat.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.pe.idat.model.Autor;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Long> {

	
	

}
