package com.github.FabianoLuiz3103.MsAnaliseCredito.controller;

import com.github.FabianoLuiz3103.MsAnaliseCredito.dto.user.DadosCadastroUser;
import com.github.FabianoLuiz3103.MsAnaliseCredito.dto.user.DadosDetalhamentoUser;
import com.github.FabianoLuiz3103.MsAnaliseCredito.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<DadosDetalhamentoUser> save(@RequestBody @Valid DadosCadastroUser userDTO, UriComponentsBuilder uriBuilder) {
        var user = userService.save(userDTO);
        var uri = uriBuilder.path("/users/{id}").buildAndExpand(user.id()).toUri();
        return ResponseEntity.created(uri).body(user);
    }

    @GetMapping
    public ResponseEntity<List<DadosDetalhamentoUser>> findAll(){
        var list = userService.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DadosDetalhamentoUser> findById(@PathVariable Long id){
        var user = userService.findById(id);
        return ResponseEntity.ok(user);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DadosDetalhamentoUser> update(@PathVariable Long id,
                                                    @RequestBody @Valid DadosCadastroUser userDTO){
        var user = userService.update(id, userDTO);
        return ResponseEntity.ok(user);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        userService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
