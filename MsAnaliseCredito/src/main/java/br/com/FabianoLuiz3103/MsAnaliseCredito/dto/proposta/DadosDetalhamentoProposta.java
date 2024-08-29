package br.com.FabianoLuiz3103.MsAnaliseCredito.dto.proposta;

import br.com.FabianoLuiz3103.MsAnaliseCredito.model.Proposta;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;

public record DadosDetalhamentoProposta(
        Long id,
        BigDecimal valorSolicitado,
        Integer prazoParaPagamento,
        Boolean aprovado,
        Long userId
) {

    public DadosDetalhamentoProposta(Proposta proposta){
        this(
                proposta.getId(),
                proposta.getValorSolicitado(),
                proposta.getPrazoParaPagamento(),
                proposta.getAprovado(),
                proposta.getUser().getId()
        );
    }
}
