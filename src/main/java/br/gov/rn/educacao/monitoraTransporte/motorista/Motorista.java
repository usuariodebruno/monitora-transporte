package br.gov.rn.educacao.monitoraTransporte.motorista;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Table(name = "motoristas")  
@Entity(name = "motoristas") // Tabela no banco
@Getter // Gerar metodos de get
@NoArgsConstructor // Gerar construtor sem agumentos
@AllArgsConstructor // Gerar const com args
@EqualsAndHashCode(of = "id") // indicar que o ID é a representaão unica
public class Motorista {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;
    private String nome;
    private Integer cnh;
    private String categoriaCNH;
    private Integer telefone;
        
}


/*
for application.properties

spring.datasource.url=
spring.datasource.username=
spring.datasource.password=
 */