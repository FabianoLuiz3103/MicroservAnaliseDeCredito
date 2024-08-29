package br.com.FabianoLuiz3103.MsAnaliseCredito.service;

import br.com.FabianoLuiz3103.MsAnaliseCredito.dto.formulario.DadosFormularioPropostaRequest;
import br.com.FabianoLuiz3103.MsAnaliseCredito.dto.formulario.DadosFormularioPropostaResponse;
import br.com.FabianoLuiz3103.MsAnaliseCredito.dto.proposta.DadosDetalhamentoProposta;
import br.com.FabianoLuiz3103.MsAnaliseCredito.model.Proposta;
import br.com.FabianoLuiz3103.MsAnaliseCredito.model.User;
import br.com.FabianoLuiz3103.MsAnaliseCredito.repository.PropostaRepository;
import br.com.FabianoLuiz3103.MsAnaliseCredito.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PropostaService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PropostaRepository propostaRepository;

    @Transactional
    public DadosFormularioPropostaResponse save(DadosFormularioPropostaRequest formDTO){
        var user = new User(formDTO.user());
        userRepository.save(user);
        var proposta = new Proposta(formDTO.proposta());
        proposta.setAprovado(false);
        proposta.setUser(user);
        propostaRepository.save(proposta);
        return new DadosFormularioPropostaResponse(user, proposta);
    }

    @Transactional(readOnly = true)
    public List<DadosDetalhamentoProposta> findAll(){
        return propostaRepository.findAll().stream()
                .map(DadosDetalhamentoProposta::new).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public DadosDetalhamentoProposta findById(Long id){
        var proposta = propostaRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Proposta não encontrada com id: " + id)
        );
        return new DadosDetalhamentoProposta(proposta);
    }
}
