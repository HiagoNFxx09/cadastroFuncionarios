package com.cadastro.cadastroDeFuncionarios.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cadastro.cadastroDeFuncionarios.Business.FuncionariosService;
import com.cadastro.cadastroDeFuncionarios.Infrastructure.Entity.Funcionarios;

import lombok.RequiredArgsConstructor;
import lombok.experimental.PackagePrivate;

@RestController
@RequestMapping ("/funcionarios")
@RequiredArgsConstructor
public class FuncionariosController {

    private final FuncionariosService funcionariosService;


    @PostMapping
    public ResponseEntity<Void> salvarFuncionario(@RequestBody Funcionarios funcionarios) {
        funcionariosService.salvarFuncionario(funcionarios);
        return ResponseEntity.ok().build();

    }
    @GetMapping("/{id}")
    public ResponseEntity<Funcionarios> buscarFuncionariosPorId(@PathVariable Long id) {
        return ResponseEntity.ok(funcionariosService.buscarFuncionariosPorId(id));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarFuncionarioPorId(@PathVariable Long id) {
        funcionariosService.deletarFuncionarioPorId(id);
        return ResponseEntity.ok().build();
    }



   
}
