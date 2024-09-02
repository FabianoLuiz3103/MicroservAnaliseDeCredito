package com.github.FabianoLuiz3103.MsAnaliseCredito.service;

import com.github.FabianoLuiz3103.MsAnaliseCredito.dto.user.DadosCadastroUser;
import com.github.FabianoLuiz3103.MsAnaliseCredito.dto.user.DadosDetalhamentoUser;
import com.github.FabianoLuiz3103.MsAnaliseCredito.model.User;
import com.github.FabianoLuiz3103.MsAnaliseCredito.repository.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {


    @Autowired
    private UserRepository userRepository;

    @Transactional                    //dto
    public DadosDetalhamentoUser save(DadosCadastroUser dadosCadastro) {
        var user = new User(dadosCadastro); //user.getId() -> null
        userRepository.save(user); //user.getId() -> Id gerado
        return new DadosDetalhamentoUser(user);
    }

    @Transactional(readOnly = true)
    public List<DadosDetalhamentoUser> findAll(){
        return userRepository.findAll().stream()
                .map(DadosDetalhamentoUser::new).collect(Collectors.toList());
                     //dto
    }

    @Transactional(readOnly = true)
    public DadosDetalhamentoUser findById(Long id){
        var user = userRepository.findById(id).orElseThrow(
                () -> new RuntimeException("User não encontrado com id: " + id)
        );
        return new DadosDetalhamentoUser(user);
                   //dto
    }

    @Transactional                               //dto
    public DadosDetalhamentoUser update(Long id, DadosCadastroUser userDTO){
        try{
            var user = userRepository.getReferenceById(id);
            user.atualizaUser(userDTO);
            userRepository.save(user);
            return new DadosDetalhamentoUser(user);
        }catch (EntityNotFoundException e){
            throw new EntityNotFoundException("User não encontrado com id: " + id);
        }

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




