package com.github.FabianoLuiz3103.MsAnaliseCredito.controller;

import com.github.FabianoLuiz3103.MsAnaliseCredito.dto.formulario.DadosFormularioPropostaRequest;
import com.github.FabianoLuiz3103.MsAnaliseCredito.dto.formulario.DadosFormularioPropostaResponse;
import com.github.FabianoLuiz3103.MsAnaliseCredito.dto.proposta.DadosDetalhamentoProposta;
import com.github.FabianoLuiz3103.MsAnaliseCredito.service.PropostaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/propostas")
public class PropostaController {

    @Autowired
    private PropostaService propostaService;


    @PostMapping
    public ResponseEntity<DadosFormularioPropostaResponse> save(@RequestBody @Valid DadosFormularioPropostaRequest formDTO, UriComponentsBuilder uriBuilder){
        var form = propostaService.save(formDTO);
        var uri = uriBuilder.path("/propostas/{id}").buildAndExpand(form.proposta().id()).toUri();
        return ResponseEntity.created(uri).body(form);
    }

    @GetMapping
    public ResponseEntity<List<DadosDetalhamentoProposta>> findAll(){
        var list = propostaService.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DadosDetalhamentoProposta> findById(@PathVariable Long id){
        var proposta = propostaService.findById(id);
        return ResponseEntity.ok(proposta);
    }
}
