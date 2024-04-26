package edu.pe.idat.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Facultad {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Cod_Facultad;

    private String DescripcionF;
    
    
    
    
    
    
    

	public Facultad() {
		super();
	}

	public Facultad(Long cod_Facultad, String descripcionF) {
		super();
		Cod_Facultad = cod_Facultad;
		DescripcionF = descripcionF;
	}

	public Long getCod_Facultad() {
		return Cod_Facultad;
	}

	public void setCod_Facultad(Long cod_Facultad) {
		Cod_Facultad = cod_Facultad;
	}

	public String getDescripcionF() {
		return DescripcionF;
	}

	public void setDescripcionF(String descripcionF) {
		DescripcionF = descripcionF;
	}
    
    


}
