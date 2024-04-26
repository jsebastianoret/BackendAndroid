package edu.pe.idat.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Escuela {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Cod_Escuela;
    private String DescripcionE;

    @ManyToOne
    @JoinColumn(name = "Cod_Facultad")
    private Facultad facultad;
    private String UbicacionE;
    
    
	public Escuela(Long cod_Escuela, String descripcionE, Facultad facultad, String ubicacionE) {
		super();
		Cod_Escuela = cod_Escuela;
		DescripcionE = descripcionE;
		this.facultad = facultad;
		UbicacionE = ubicacionE;
	}


	public Long getCod_Escuela() {
		return Cod_Escuela;
	}


	public void setCod_Escuela(Long cod_Escuela) {
		Cod_Escuela = cod_Escuela;
	}


	public String getDescripcionE() {
		return DescripcionE;
	}


	public void setDescripcionE(String descripcionE) {
		DescripcionE = descripcionE;
	}


	public Facultad getFacultad() {
		return facultad;
	}


	public void setFacultad(Facultad facultad) {
		this.facultad = facultad;
	}


	public String getUbicacionE() {
		return UbicacionE;
	}


	public void setUbicacionE(String ubicacionE) {
		UbicacionE = ubicacionE;
	}
    
    
    

}
