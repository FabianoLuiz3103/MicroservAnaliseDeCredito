package br.com.FabianoLuiz3103.MsAnaliseCredito.dto.user;

import br.com.FabianoLuiz3103.MsAnaliseCredito.model.User;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;

public record DadosCadastroUser(

        @NotBlank(message = "O nome é obrigatório")
        String nome,
        @NotBlank(message = "O sobrenome é obrigatório")
        String sobrenome,
        @NotBlank(message = "O cpf é obrigatório")
        @Size(min = 11, max = 11, message = "O cpf deve ter 11 caracteres" )
        String cpf,
        @NotBlank(message = "O telefone é obrigatório")
        @Size(min = 11, max = 11, message = "O telefone deve ter 11 caracteres" )
        String telefone,
        @NotNull(message = "A renda é obrigatória")
        @Positive(message = "A renda deve ser positva")
        BigDecimal renda
) {
    public DadosCadastroUser(User user){
        this(
                user.getNome(),
                user.getSobrenome(),
                user.getCpf(),
                user.getTelefone(),
                user.getRenda()
        );
    }
}
