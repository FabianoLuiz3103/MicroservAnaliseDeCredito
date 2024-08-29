package br.com.FabianoLuiz3103.MsAnaliseCredito.dto.user;

import br.com.FabianoLuiz3103.MsAnaliseCredito.model.User;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;

public record DadosDetalhamentoUser(
        Long id,
        String nome,
        String sobrenome,
        String cpf,
        String telefone,
        BigDecimal renda
) {
    public DadosDetalhamentoUser(User user){
        this(
                user.getId(),
                user.getNome(),
                user.getSobrenome(),
                user.getCpf(),
                user.getTelefone(),
                user.getRenda()
        );
    }
}
