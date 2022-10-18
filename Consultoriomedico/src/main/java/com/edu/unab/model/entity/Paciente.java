package com.edu.unab.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "paciente")
public class Paciente {
    
    @Id
    @Column(name = "idpaciente")
    private Integer idPaciente;
    @Column(name = "nombre")
    private String nombreP;
    @Column(name = "apellidos")
    private String apellidosP;
    @Column(name = "sexo")
    private String sexoP;
    @Column(name = "direccion")
    private String direccionP;
    @Column(name = "telefono")
    private String telefonoP;
    @Column(name = "correo")
    private String correoP;
    @Column(name = "contraseña")
    private String contraseñaP;
	    
    public Paciente() {
	}

	public Paciente(Integer idPaciente, String nombreP, String apellidosP, String sexoP, String direccionP,
			String telefonoP, String correoP, String contraseñaP) {
		super();
		this.idPaciente = idPaciente;
		this.nombreP = nombreP;
		this.apellidosP = apellidosP;
		this.sexoP = sexoP;
		this.direccionP = direccionP;
		this.telefonoP = telefonoP;
		this.correoP = correoP;
		this.contraseñaP = contraseñaP;
	}

	public Integer getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(Integer idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getNombreP() {
		return nombreP;
	}

	public void setNombreP(String nombreP) {
		this.nombreP = nombreP;
	}

	public String getApellidosP() {
		return apellidosP;
	}

	public void setApellidosP(String apellidosP) {
		this.apellidosP = apellidosP;
	}

	public String getSexoP() {
		return sexoP;
	}

	public void setSexoP(String sexoP) {
		this.sexoP = sexoP;
	}

	public String getDireccionP() {
		return direccionP;
	}

	public void setDireccionP(String direccionP) {
		this.direccionP = direccionP;
	}

	public String getTelefonoP() {
		return telefonoP;
	}

	public void setTelefonoP(String telefonoP) {
		this.telefonoP = telefonoP;
	}

	public String getCorreoP() {
		return correoP;
	}

	public void setCorreoP(String correoP) {
		this.correoP = correoP;
	}

	public String getContraseñaP() {
		return contraseñaP;
	}

	public void setContraseñaP(String contraseñaP) {
		this.contraseñaP = contraseñaP;
	}

	@Override
	public String toString() {
		return "Paciente [idPaciente=" + idPaciente + ", nombreP=" + nombreP + ", apellidosP=" + apellidosP + ", sexoP="
				+ sexoP + ", direccionP=" + direccionP + ", telefonoP=" + telefonoP + ", correoP=" + correoP
				+ ", contraseñaP=" + contraseñaP + "]";
	}
}