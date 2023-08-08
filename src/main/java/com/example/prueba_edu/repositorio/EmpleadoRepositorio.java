package com.example.prueba_edu.repositorio;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.prueba_edu.modelo.Empleado;

@Repository
public interface EmpleadoRepositorio extends JpaRepository<Empleado, Long>{
}