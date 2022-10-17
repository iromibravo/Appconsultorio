package com.edu.unab.model.entity;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "medicamento")
public class Medicamento {

	@Id
	@Column(name = "idmedicamento")
	private Integer idMedicamento;
	@Column(name = "nombre_comercial")
	private String nombreComercial;
	@Column(name = "nombre_generico")
	private String nombreGenerico;
	@Column(name = "fecha_vencimiento")
	private Date fechaVencimiento;
	
	@ManyToMany(mappedBy= "medicamentos") 
	private List<Consulta> consultaList;
	
	public Medicamento(Integer idMedicamento, String nombreComercial, String nombreGenerico, Date fechaVencimiento) {
		super();
		this.idMedicamento = idMedicamento;
		this.nombreComercial = nombreComercial;
		this.nombreGenerico = nombreGenerico;
		this.fechaVencimiento = fechaVencimiento;
	}
	public Medicamento() {
	}
	public Integer getIdMedicamento() {
		return idMedicamento;
	}
	public void setIdMedicamento(Integer idMedicamento) {
		this.idMedicamento = idMedicamento;
	}
	public String getNombreComercial() {
		return nombreComercial;
	}
	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}
	public String getNombreGenerico() {
		return nombreGenerico;
	}
	public void setNombreGenerico(String nombreGenerico) {
		this.nombreGenerico = nombreGenerico;
	}
	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	@Override
	public String toString() {
		return "Medicamento [idMedicamento=" + idMedicamento + ", nombreComercial=" + nombreComercial
				+ ", nombreGenerico=" + nombreGenerico + ", fechaVencimiento=" + fechaVencimiento + "]";
	}
		
}