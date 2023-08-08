package com.example.prueba_edu.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.prueba_edu.modelo.Departamento;
import com.example.prueba_edu.repositorio.DepartamentoRepositorio;


@RestController
@RequestMapping("/api/v1")
public class DepartamentoControlador {

	@Autowired
	private DepartamentoRepositorio repositorio;

	@GetMapping("/departamento")
	public List<Departamento> listarTodosLosDepartamentos() {
		return repositorio.findAll();
	}
}
