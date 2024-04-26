package edu.pe.idat.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name= "Autor")
public class Autor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idAutor")
	private Long idAutor;
	
	@Column(name = "nombreAutor")
	private String nombreAutor;
	
	@Column(name = "numeroTelefono")
	private String numeroTelefono;
	
	@Column(name = "correoElectronico")
	private String correoElectronico;
	
	@Column(name = "nacionalidad")
	private String nacionalidad;
	
	@Column(name = "salario")
	private double salario;

	public Autor() {
		super();
	}

	public Autor(Long idAutor, String nombreAutor, String numeroTelefono, String correoElectronico, String nacionalidad,
			double salario) {
		super();
		this.idAutor = idAutor;
		this.nombreAutor = nombreAutor;
		this.numeroTelefono = numeroTelefono;
		this.correoElectronico = correoElectronico;
		this.nacionalidad = nacionalidad;
		this.salario = salario;
	}

	public Long getIdAutor() {
		return idAutor;
	}

	public void setIdAutor(Long idAutor) {
		this.idAutor = idAutor;
	}

	public String getNombreAutor() {
		return nombreAutor;
	}

	public void setNombreAutor(String nombreAutor) {
		this.nombreAutor = nombreAutor;
	}

	public String getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}



	
	
    

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
