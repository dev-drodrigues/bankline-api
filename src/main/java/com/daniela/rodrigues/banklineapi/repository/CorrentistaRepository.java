package com.daniela.rodrigues.banklineapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daniela.rodrigues.banklineapi.models.Correntista;


public interface CorrentistaRepository extends JpaRepository<Correntista, Integer> {

}
