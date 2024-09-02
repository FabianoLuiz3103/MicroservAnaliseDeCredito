package com.github.FabianoLuiz3103.MsAnaliseCredito.dto.formulario;

import com.github.FabianoLuiz3103.MsAnaliseCredito.dto.proposta.DadosDetalhamentoProposta;
import com.github.FabianoLuiz3103.MsAnaliseCredito.dto.user.DadosDetalhamentoUser;
import com.github.FabianoLuiz3103.MsAnaliseCredito.model.Proposta;
import com.github.FabianoLuiz3103.MsAnaliseCredito.model.User;

public record DadosFormularioPropostaResponse(

        DadosDetalhamentoUser user,
        DadosDetalhamentoProposta proposta
) {
    public DadosFormularioPropostaResponse(User user, Proposta proposta){
        this(
                new DadosDetalhamentoUser(user),
                new DadosDetalhamentoProposta(proposta)
        );
    }
}
