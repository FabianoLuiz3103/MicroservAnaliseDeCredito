package com.github.FabianoLuiz3103.MsAnaliseCredito.dto.formulario;

import com.github.FabianoLuiz3103.MsAnaliseCredito.dto.proposta.DadosCadastroProposta;
import com.github.FabianoLuiz3103.MsAnaliseCredito.dto.user.DadosCadastroUser;
import com.github.FabianoLuiz3103.MsAnaliseCredito.model.Proposta;
import com.github.FabianoLuiz3103.MsAnaliseCredito.model.User;
import jakarta.validation.Valid;

public record DadosFormularioPropostaRequest(

        @Valid
        DadosCadastroUser user,
        @Valid
        DadosCadastroProposta proposta

) {

    public DadosFormularioPropostaRequest(User user, Proposta proposta){
        this(
                new DadosCadastroUser(user),
                new DadosCadastroProposta(proposta)
        );
    }
}
