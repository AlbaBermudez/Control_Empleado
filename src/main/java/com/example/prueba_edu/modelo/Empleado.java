package com.example.prueba_edu.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Entity
@Table(name = "empleados")
public class Empleado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nombre", length = 60, nullable = false)
	private String nombre;

	@ManyToOne
	@JoinColumn(name = "departamento_id")
	private Departamento departamento;

	@Column(name = "sueldo", nullable = false)
	private Double sueldo;

	@ManyToOne
	@JoinColumn(name = "estudio_id")
	private Estudio estudio;

	public Empleado() {

	}

	public Empleado(Long id, String nombre, Departamento departamento, Double sueldo, Estudio estudio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.departamento = departamento;
		this.sueldo = sueldo;
		this.estudio = estudio;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Double getSueldo() {
		return sueldo;
	}

	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}

	public Estudio getEstudio() {
		return estudio;
	}

	public void setEstudio(Estudio estudio) {
		this.estudio = estudio;
	}

}
