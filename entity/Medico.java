package com.edu.unab.model.entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "medico")
public class Medico {
    
    @Id
    @Column(name = "idmedico")
    private Integer idMedico;
    @Column(name = "nombres")
    private String nombresM;
    @Column(name = "apellidos")
    private String apellidosM;
    @Column(name = "sexo")
    private String sexoM;
    @Column(name = "direccion")
    private String direccionM;
    @Column(name = "telefono")
    private String telefonoM;
    @Column(name = "correo")
    private String correoM;
    @Column(name = "contraseña")
    private String contraseñaM;
  
    @ManyToOne
    @JoinColumn(name = "turno_idturno")
    private Turno turno;
    @ManyToOne
    @JoinColumn(name = "especialidad_idespecialidad")
    private Especialidad especialidad;
    
    @OneToMany(mappedBy="medicoo") 
  	private List<Cita> citaList;
	
    public Medico() {
	}

	public Medico(Integer idMedico, String nombresM, String apellidosM, String sexoM, String direccionM,
			String telefonoM, String correoM, String contraseñaM, Turno turno, Especialidad especialidad) {
		super();
		this.idMedico = idMedico;
		this.nombresM = nombresM;
		this.apellidosM = apellidosM;
		this.sexoM = sexoM;
		this.direccionM = direccionM;
		this.telefonoM = telefonoM;
		this.correoM = correoM;
		this.contraseñaM = contraseñaM;
		this.turno = turno;
		this.especialidad = especialidad;
	}

	public Integer getIdMedico() {
		return idMedico;
	}

	public void setIdMedico(Integer idMedico) {
		this.idMedico = idMedico;
	}

	public String getNombresM() {
		return nombresM;
	}

	public void setNombresM(String nombresM) {
		this.nombresM = nombresM;
	}

	public String getApellidosM() {
		return apellidosM;
	}

	public void setApellidosM(String apellidosM) {
		this.apellidosM = apellidosM;
	}

	public String getSexoM() {
		return sexoM;
	}

	public void setSexoM(String sexoM) {
		this.sexoM = sexoM;
	}

	public String getDireccionM() {
		return direccionM;
	}

	public void setDireccionM(String direccionM) {
		this.direccionM = direccionM;
	}

	public String getTelefonoM() {
		return telefonoM;
	}

	public void setTelefonoM(String telefonoM) {
		this.telefonoM = telefonoM;
	}

	public String getCorreoM() {
		return correoM;
	}

	public void setCorreoM(String correoM) {
		this.correoM = correoM;
	}

	public String getContraseñaM() {
		return contraseñaM;
	}

	public void setContraseñaM(String contraseñaM) {
		this.contraseñaM = contraseñaM;
	}

	public Turno getTurno() {
		return turno;
	}

	public void setTurno(Turno turno) {
		this.turno = turno;
	}

	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}

	@Override
	public String toString() {
		return "Medico [idMedico=" + idMedico + ", nombresM=" + nombresM + ", apellidosM=" + apellidosM + ", sexoM="
				+ sexoM + ", direccionM=" + direccionM + ", telefonoM=" + telefonoM + ", correoM=" + correoM
				+ ", contraseñaM=" + contraseñaM + ", turno=" + turno + ", especialidad=" + especialidad + "]";
	}   
}