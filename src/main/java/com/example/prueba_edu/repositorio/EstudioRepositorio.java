package com.example.prueba_edu.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.prueba_edu.modelo.Estudio;

@Repository
public interface EstudioRepositorio extends JpaRepository<Estudio, Long>{
}