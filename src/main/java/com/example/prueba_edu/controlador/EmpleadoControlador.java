package com.example.prueba_edu.controlador;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.prueba_edu.repositorio.EmpleadoRepositorio;
import com.example.prueba_edu.modelo.Empleado;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/api/v1")
public class EmpleadoControlador {

	@Autowired
	private EmpleadoRepositorio repositorio;

	@GetMapping("/empleados")
	public List<Empleado> listarTodosLosEmpleados() {
		return repositorio.findAll();
	}
}
