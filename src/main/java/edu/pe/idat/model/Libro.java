package edu.pe.idat.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Libro {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLibro;

    private String nombreLibro;
    private String descripcionLibro;
    private String generoLibro;
    private Double precioLibro;

    @ManyToOne
    @JoinColumn(name = "Cod_Escuela")
    private Escuela escuela;

	public Libro(Long idLibro, String nombreLibro, String descripcionLibro, String generoLibro, Double precioLibro,
			Escuela escuela) {
		super();
		this.idLibro = idLibro;
		this.nombreLibro = nombreLibro;
		this.descripcionLibro = descripcionLibro;
		this.generoLibro = generoLibro;
		this.precioLibro = precioLibro;
		this.escuela = escuela;
	}

	public Libro() {
		super();
	}

	public Long getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(Long idLibro) {
		this.idLibro = idLibro;
	}

	public String getNombreLibro() {
		return nombreLibro;
	}

	public void setNombreLibro(String nombreLibro) {
		this.nombreLibro = nombreLibro;
	}

	public String getDescripcionLibro() {
		return descripcionLibro;
	}

	public void setDescripcionLibro(String descripcionLibro) {
		this.descripcionLibro = descripcionLibro;
	}

	public String getGeneroLibro() {
		return generoLibro;
	}

	public void setGeneroLibro(String generoLibro) {
		this.generoLibro = generoLibro;
	}

	public Double getPrecioLibro() {
		return precioLibro;
	}

	public void setPrecioLibro(Double precioLibro) {
		this.precioLibro = precioLibro;
	}

	public Escuela getEscuela() {
		return escuela;
	}

	public void setEscuela(Escuela escuela) {
		this.escuela = escuela;
	}
    
    
    
    
    
    

}
