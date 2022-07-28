package com.exercicio.thread.exercicio.thread;

import com.exercicio.thread.exercicio.services.PessoaService;

public class ThreadPessoa implements Runnable{
    
    // ATRIBUTO
    private PessoaService service;

    // Contruindo um serviço a partir de outro serviço instaciado
    public ThreadPessoa(PessoaService service) {
        this.service = service;
    }

    @Override
    public void run(){

        System.out.println("Entrou na thread!");   
        // Preenchendo o service com array de pessoas  
        service.setPessoas(service.getAll()) ; 

    }

}
