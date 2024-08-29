package br.com.FabianoLuiz3103.MsAnaliseCredito.model;



/*
@author FABIANO LUIZ - RM 96044
 */
import br.com.FabianoLuiz3103.MsAnaliseCredito.dto.proposta.DadosCadastroProposta;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = {"id"})

@Entity
@Table(name = "tbl_proposta")
public class Proposta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private BigDecimal valorSolicitado;

    @Column(nullable = false)
    private Integer prazoParaPagamento;

    @Column(nullable = false)
    private Boolean aprovado;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public Proposta(DadosCadastroProposta propostaDTO){
        this.valorSolicitado = propostaDTO.valorSolicitado();
        this.prazoParaPagamento = propostaDTO.prazoParaPagamento();
        this.aprovado = propostaDTO.aprovado();
    }

}
