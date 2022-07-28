package com.exercicio.thread.exercicio.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exercicio.thread.exercicio.domain.Pessoa;
import com.exercicio.thread.exercicio.repositories.PessoaRepository;

@Service
public class PessoaService {
    
    @Autowired
    private PessoaRepository repo;
    private List<Pessoa> pessoas = new ArrayList<>();


    public List<Pessoa> getPessoas() {
        return pessoas;
    }


    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }


    public List<Pessoa> getAll(){

       System.out.println("Entrou no getAll");
       
        pessoas = repo.findAll();

        return pessoas;
    }
}
