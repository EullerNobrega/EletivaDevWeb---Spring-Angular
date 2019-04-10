package com.eletiva_dev_web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.eletiva_dev_web.model.Aluno;
import com.eletiva_dev_web.repository.AlunoRepository;

@Service
public class AlunoService {

	@Autowired
	AlunoRepository alunoRepository;

	public ResponseEntity<?> cadastrarAluno(Aluno aluno) {

		Aluno alunoExist = alunoRepository.findById(aluno.getMatricula()).orElse(null);

		if (alunoExist != null) {
			return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body("Professor já cadastrado!");
		}

		alunoRepository.save(aluno);

		return ResponseEntity.ok().build();

	}

}
