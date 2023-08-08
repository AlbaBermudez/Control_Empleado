package com.example.prueba_edu.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.prueba_edu.modelo.Log;

@Repository
public interface LogRepositorio extends JpaRepository<Log, Long>{
}