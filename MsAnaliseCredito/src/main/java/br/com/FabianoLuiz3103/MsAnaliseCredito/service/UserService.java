package br.com.FabianoLuiz3103.MsAnaliseCredito.service;

import br.com.FabianoLuiz3103.MsAnaliseCredito.dto.user.DadosCadastroUser;
import br.com.FabianoLuiz3103.MsAnaliseCredito.dto.user.DadosDetalhamentoUser;
import br.com.FabianoLuiz3103.MsAnaliseCredito.model.User;
import br.com.FabianoLuiz3103.MsAnaliseCredito.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {


    @Autowired
    private UserRepository userRepository;

    @Transactional
    public DadosDetalhamentoUser save(DadosCadastroUser dadosCadastro) {
        var user = new User(dadosCadastro); //user.getId() -> null
        userRepository.save(user); //user.getId() -> Id gerado
        return new DadosDetalhamentoUser(user);
    }

    @Transactional(readOnly = true)
    public List<DadosDetalhamentoUser> findAll(){
        return userRepository.findAll().stream()
                .map(DadosDetalhamentoUser::new).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public DadosDetalhamentoUser findById(Long id){
        var user = userRepository.findById(id).orElseThrow(
                () -> new RuntimeException("User não encontrado com id: " + id)
        );
        return new DadosDetalhamentoUser(user);
    }

    @Transactional
    public DadosDetalhamentoUser update(Long id, DadosCadastroUser userDTO){
        var user = userRepository.getReferenceById(id);
        user.atualizaUser(userDTO);
        userRepository.save(user);
        return new DadosDetalhamentoUser(user);
    }

    @Transactional
    public void delete(Long id){
        if(!userRepository.existsById(id)){
            throw  new IllegalArgumentException("User não encontrado para o id:" + id);
        }
        try {
            userRepository.deleteById(id);
        }catch (Exception e){
            throw  new IllegalArgumentException("User não encontrado para o id:" + id);
        }
    }

}




