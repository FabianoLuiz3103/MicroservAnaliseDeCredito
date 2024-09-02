package com.github.FabianoLuiz3103.MsAnaliseCredito.model;



/*
@author FABIANO LUIZ SANTOS DE SANTANA - RM 96044

 */
import com.github.FabianoLuiz3103.MsAnaliseCredito.dto.user.DadosCadastroUser;
import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import lombok.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of={"id"})

@Entity
@Table(name = "tbl_user")
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String nome;

    @Column(nullable = false, length = 100)
    private String sobrenome;

    @Column(nullable = false, length = 11)
    private String cpf;

    @Column(length = 11)
    private String telefone;

    @DecimalMin(value = "0.0", message = "A renda não pode ser negativa")
    private BigDecimal renda;

    @OneToMany(mappedBy = "user")
    private List<Proposta> propostas = new ArrayList<>();

    public User(DadosCadastroUser userDTO){
        this.nome = userDTO.nome();
        this.sobrenome = userDTO.sobrenome();
        this.cpf = userDTO.cpf();
        this.telefone = userDTO.telefone();
        this.renda = userDTO.renda();
    }

    public void atualizaUser(DadosCadastroUser userDTO){
        if(userDTO.nome() != null){
            this.nome = userDTO.nome();
        }
        if(userDTO.sobrenome() != null){
            this.sobrenome = userDTO.sobrenome();
        }
        if(userDTO.cpf() != null){
            this.cpf = userDTO.cpf();
        }
        if(userDTO.telefone() != null){
            this.telefone = userDTO.telefone();
        }
        if(userDTO.renda() != null){
            this.renda = userDTO.renda();
        }
    }
}
