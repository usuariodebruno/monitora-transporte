package br.gov.rn.educacao.monitoraTransporte.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.rn.educacao.monitoraTransporte.motorista.Motorista;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("motorista") // Endpoint de Get
public class MotoristaController{
    
    @GetMapping
    public void getAll () {
        Motorista motorista; 
    }
}