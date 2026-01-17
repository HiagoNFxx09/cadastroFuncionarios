package com.cadastro.cadastroDeFuncionarios.Infrastructure.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cadastro.cadastroDeFuncionarios.Infrastructure.Entity.Funcionarios;

public interface Repository extends JpaRepository <Funcionarios,Long> {

}
