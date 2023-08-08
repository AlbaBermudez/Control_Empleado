package com.example.prueba_edu.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.prueba_edu.modelo.Log;
import com.example.prueba_edu.repositorio.LogRepositorio;

@RestController
@RequestMapping("/api/v1")
public class LogControlador {

	@Autowired
	private LogRepositorio repositorio;

	@GetMapping("/log")
	public List<Log> listarTodosLosLogs() {
		return repositorio.findAll();
	}
}
