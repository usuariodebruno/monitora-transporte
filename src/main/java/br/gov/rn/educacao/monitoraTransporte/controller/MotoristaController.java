package br.gov.rn.educacao.monitoraTransporte.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.rn.educacao.monitoraTransporte.motorista.MotoristaRepository;
import br.gov.rn.educacao.monitoraTransporte.motorista.MotoristaResponseDTO;

import java.util.List;


@RestController
@RequestMapping("motorista") // Name para endpoint de get()
public class MotoristaController{

    @Autowired
    private MotoristaRepository repository;

    @GetMapping
    public List<MotoristaResponseDTO> getAll () {

        List<MotoristaResponseDTO> motoristaList = repository.findAll().stream().map(MotoristaResponseDTO::new).toList();
        return motoristaList;

    }
}