package br.gov.rn.educacao.monitoraTransporte.motorista;

public record MotoristaResponseDTO(Long id, String nome, Integer cnh, String categoriaCNH,  Integer telefone) {
    public MotoristaResponseDTO(Motorista motorista){
        this(motorista.getId(), motorista.getNome(), motorista.getCnh(), motorista.getCategoriaCNH(), motorista.getTelefone());
    }
}
