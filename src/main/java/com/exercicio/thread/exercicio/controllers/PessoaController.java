package com.exercicio.thread.exercicio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exercicio.thread.exercicio.domain.Pessoa;
import com.exercicio.thread.exercicio.services.PessoaService;
import com.exercicio.thread.exercicio.thread.ThreadPessoa;

// Ativando Schedule para permitir executar funções agendadas
@Configuration
@EnableScheduling

@RestController
@RequestMapping(value = "/pessoa")

public class PessoaController {
   
    @Autowired
    private PessoaService pessoaService;

    @Scheduled(cron = "0 0 8 * * * ")
  	public void teste(){
		ThreadPessoa threadpessoa = new ThreadPessoa(pessoaService);
        System.out.println("Entrou no teste");
        Thread thread = new Thread(threadpessoa);
        thread.run();
	}   

    @GetMapping
    private ResponseEntity<List<Pessoa>> listarTodos(){
        return ResponseEntity.ok().body(pessoaService.getPessoas());
    }
    
}
