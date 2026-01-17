package com.cadastro.cadastroDeFuncionarios.Business;

import org.springframework.stereotype.Service;

import com.cadastro.cadastroDeFuncionarios.Infrastructure.Entity.Funcionarios;
import com.cadastro.cadastroDeFuncionarios.Infrastructure.Repository.Repository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class FuncionariosService {
    
    private final Repository repository;

    public void salvarFuncionario(Funcionarios funcionarios) {
        repository.save(funcionarios);
    }

    public void deletarFuncionarioPorId(Long id){
        repository.deleteById(id);
    }

    public Funcionarios buscarFuncionariosPorId(Long id){
        return repository.findById(id).orElse(null);
    }

}
