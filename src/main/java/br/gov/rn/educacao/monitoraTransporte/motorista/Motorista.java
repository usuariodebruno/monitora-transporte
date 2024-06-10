package br.gov.rn.educacao.monitoraTransporte.motorista;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Table(name = "motoristas")  
@Entity(name = "motoristas") // Tabela no banco
public class Motorista {
    private String nome;
    private int cnh;
    private String categoriaCNH;
    private int telefone;
        
}
