package br.com.FabianoLuiz3103.MsAnaliseCredito.dto.proposta;

import br.com.FabianoLuiz3103.MsAnaliseCredito.model.Proposta;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;

public record DadosCadastroProposta(
        Long id,
        @NotNull(message = "O valor solicitado é obrigatório")
        @Positive(message = "O valor solicitado deve ser positivo")
        BigDecimal valorSolicitado,
        @NotNull(message = "O prazo é obrigatório")
        @Positive(message = "O prazo não pode ser um valor negativo")
        Integer prazoParaPagamento,
        Boolean aprovado
) {

    public DadosCadastroProposta(Proposta proposta){
        this(
                proposta.getId(),
                proposta.getValorSolicitado(),
                proposta.getPrazoParaPagamento(),
                proposta.getAprovado()
        );
    }
}
