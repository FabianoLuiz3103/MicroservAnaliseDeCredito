package br.com.FabianoLuiz3103.MsAnaliseCredito.dto.formulario;

import br.com.FabianoLuiz3103.MsAnaliseCredito.dto.proposta.DadosDetalhamentoProposta;
import br.com.FabianoLuiz3103.MsAnaliseCredito.dto.user.DadosDetalhamentoUser;
import br.com.FabianoLuiz3103.MsAnaliseCredito.model.Proposta;
import br.com.FabianoLuiz3103.MsAnaliseCredito.model.User;

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
