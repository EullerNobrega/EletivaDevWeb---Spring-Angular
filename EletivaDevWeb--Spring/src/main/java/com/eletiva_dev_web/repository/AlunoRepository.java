package com.eletiva_dev_web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eletiva_dev_web.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, String> {

}
