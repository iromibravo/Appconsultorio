package com.edu.unab.model.entity;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "consulta")
public class Consulta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idconsulta")
    private Integer idConsulta;
    @Column(name = "motivo")
    private String motivoC;
    @Column(name = "diagnostico")
    private String diagnosticoC;
    @Column(name = "tratamiento")
    private String tratamientoC;
    @Column(name = "fecha")
    private Date fechaC;
    @Column(name = "hora")
    private String horaC;
    
    @ManyToOne
    @JoinColumn(name = "idcita")
    private Cita cita;
    
    @JoinTable(
            name = "consulta_medicamento",
            joinColumns = @JoinColumn(name = "idconsulta", nullable = false),
            inverseJoinColumns = @JoinColumn(name="idmedicamento", nullable = false))
    
    @ManyToMany
    private List<Medicamento> medicamentos;
    
    public Consulta() {      
    }

	public Consulta(Integer idConsulta, String motivoC, String diagnosticoC, String tratamientoC, Date fechaC,
			String horaC, Cita cita, List<Medicamento> medicamentos) {
		super();
		this.idConsulta = idConsulta;
		this.motivoC = motivoC;
		this.diagnosticoC = diagnosticoC;
		this.tratamientoC = tratamientoC;
		this.fechaC = fechaC;
		this.horaC = horaC;
		this.cita = cita;
		this.medicamentos = medicamentos;
	}

	public Integer getIdConsulta() {
		return idConsulta;
	}

	public void setIdConsulta(Integer idConsulta) {
		this.idConsulta = idConsulta;
	}

	public String getMotivoC() {
		return motivoC;
	}

	public void setMotivoC(String motivoC) {
		this.motivoC = motivoC;
	}

	public String getDiagnosticoC() {
		return diagnosticoC;
	}

	public void setDiagnosticoC(String diagnosticoC) {
		this.diagnosticoC = diagnosticoC;
	}

	public String getTratamientoC() {
		return tratamientoC;
	}

	public void setTratamientoC(String tratamientoC) {
		this.tratamientoC = tratamientoC;
	}

	public Date getFechaC() {
		return fechaC;
	}

	public void setFechaC(Date fechaC) {
		this.fechaC = fechaC;
	}

	public String getHoraC() {
		return horaC;
	}

	public void setHoraC(String horaC) {
		this.horaC = horaC;
	}

	public Cita getCita() {
		return cita;
	}

	public void setCita(Cita cita) {
		this.cita = cita;
	}

	public List<Medicamento> getMedicamentos() {
		return medicamentos;
	}

	public void setMedicamentos(List<Medicamento> medicamentos) {
		this.medicamentos = medicamentos;
	}

	@Override
	public String toString() {
		return "Consulta [idConsulta=" + idConsulta + ", motivoC=" + motivoC + ", diagnosticoC=" + diagnosticoC
				+ ", tratamientoC=" + tratamientoC + ", fechaC=" + fechaC + ", horaC=" + horaC + ", cita=" + cita
				+ ", medicamentos=" + medicamentos + "]";
	}
    
    
    
    
}
