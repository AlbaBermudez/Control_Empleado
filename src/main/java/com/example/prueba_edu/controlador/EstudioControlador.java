package com.example.prueba_edu.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.prueba_edu.modelo.Estudio;
import com.example.prueba_edu.repositorio.EstudioRepositorio;

@RestController
@RequestMapping("/api/v1")
public class EstudioControlador {

	@Autowired
	private EstudioRepositorio repositorio;

	@GetMapping("/estudio")
	public List<Estudio> listarTodosLosEstudios() {
		return repositorio.findAll();
	}
}
