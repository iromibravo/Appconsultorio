package com.edu.unab.model.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cita")
public class Cita {
    
    @Id
    @Column(name = "idcita")
    private Integer idCita;
    @Column(name = "fecha")
    private Date fechaCi;
    @Column(name = "hora")
    private String horaCi;
    @ManyToOne
    @JoinColumn(name = "medico_idmedico")
    private Medico medicoo;
    @ManyToOne
    @JoinColumn(name = "idpaciente")
    private Paciente paciente;
     
    public Cita() {
	}

	public Cita(Integer idCita, Date fechaCi, String horaCi, Medico medico, Paciente paciente) {
		super();
		this.idCita = idCita;
		this.fechaCi = fechaCi;
		this.horaCi = horaCi;
		this.medicoo = medico;
		this.paciente = paciente;
	}

	public Integer getIdCita() {
		return idCita;
	}

	public void setIdCita(Integer idCita) {
		this.idCita = idCita;
	}

	public Date getFechaCi() {
		return fechaCi;
	}

	public void setFechaCi(Date fechaCi) {
		this.fechaCi = fechaCi;
	}

	public String getHoraCi() {
		return horaCi;
	}

	public void setHoraCi(String horaCi) {
		this.horaCi = horaCi;
	}

	public Medico getMedico() {
		return medicoo;
	}

	public void setMedico(Medico medicoo) {
		this.medicoo = medicoo;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	@Override
	public String toString() {
		return "Cita [idCita=" + idCita + ", fechaCi=" + fechaCi + ", horaCi=" + horaCi + ", medicoo=" + medicoo
				+ ", paciente=" + paciente + "]";
	}

}