package com.github.FabianoLuiz3103.MsAnaliseCredito.dto.user;

import com.github.FabianoLuiz3103.MsAnaliseCredito.model.User;

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
