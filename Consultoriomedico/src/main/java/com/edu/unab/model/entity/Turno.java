package com.edu.unab.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "turno")
public class Turno {
    
    @Id

    @Column(name = "idturno")
    private Integer idTurno;
    @Column(name = "nombre")
    private String nombreT;
    @Column(name = "hora_inicio")
    private String horaInicio;
    @Column(name = "hora_fin")
    private String horaFin;
    
    public Turno() {
	}

	public Turno(Integer idTurno, String nombreT, String horaInicio, String horaFin) {
		super();
		this.idTurno = idTurno;
		this.nombreT = nombreT;
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
	}

	public Integer getIdTurno() {
		return idTurno;
	}

	public void setIdTurno(Integer idTurno) {
		this.idTurno = idTurno;
	}

	public String getNombreT() {
		return nombreT;
	}

	public void setNombreT(String nombreT) {
		this.nombreT = nombreT;
	}

	public String getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	public String getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(String horaFin) {
		this.horaFin = horaFin;
	}

	@Override
	public String toString() {
		return "Turno [idTurno=" + idTurno + ", nombreT=" + nombreT + ", horaInicio=" + horaInicio + ", horaFin="
				+ horaFin + "]";
	}

 }
 
   