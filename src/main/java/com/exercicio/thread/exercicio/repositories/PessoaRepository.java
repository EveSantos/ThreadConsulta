package com.exercicio.thread.exercicio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exercicio.thread.exercicio.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{
    
}
