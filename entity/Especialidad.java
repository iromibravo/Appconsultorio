package com.edu.unab.model.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "especialidad")
public class Especialidad {
    
    @Id
    @Column(name = "idespecialidad")
    private Integer idEspecialidad;
    @Column(name = "nombre")
    private String nombreE;
  	
    
    public Especialidad() {
	}

	public Especialidad(Integer idEspecialidad, String nombreE) {
		super();
		this.idEspecialidad = idEspecialidad;
		this.nombreE = nombreE;
	}

	public Integer getIdEspecialidad() {
		return idEspecialidad;
	}

	public void setIdEspecialidad(Integer idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}

	public String getNombreE() {
		return nombreE;
	}

	public void setNombreE(String nombreE) {
		this.nombreE = nombreE;
	}

	@Override
	public String toString() {
		return "Especialidad [idEspecialidad=" + idEspecialidad + ", nombreE=" + nombreE + "]";
	}
    
}