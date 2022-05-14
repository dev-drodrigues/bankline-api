package com.daniela.rodrigues.banklineapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daniela.rodrigues.banklineapi.models.Movimentacao;


public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Integer >{

}
