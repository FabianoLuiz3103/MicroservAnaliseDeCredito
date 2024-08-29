package br.com.FabianoLuiz3103.MsAnaliseCredito.repository;

import br.com.FabianoLuiz3103.MsAnaliseCredito.model.Proposta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PropostaRepository extends JpaRepository<Proposta, Long> {
}
