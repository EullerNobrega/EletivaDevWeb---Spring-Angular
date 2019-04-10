package com.eletiva_dev_web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.eletiva_dev_web.model.Disciplina;
import com.eletiva_dev_web.repository.DisciplinaRepository;

@Service
public class DisciplinaService {

	@Autowired
	DisciplinaRepository disciplinaRepository;

	public ResponseEntity<?> cadastrarDisciplina(Disciplina disciplina) {

		Disciplina disciplinaExist = disciplinaRepository.findById(disciplina.getCodigo()).orElse(null);

		if (disciplinaExist != null) {
			return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body("Disciplina já cadastrada!");
		}

		disciplinaRepository.save(disciplina);

		return ResponseEntity.ok().build();

	}

	public ResponseEntity<?> listarDisciplinas() {

		return ResponseEntity.ok(disciplinaRepository.findAll());

	}

	public ResponseEntity<?> consultarDisciplina(String codigo) {

		return ResponseEntity.ok(disciplinaRepository.findById(codigo));

	}

	public ResponseEntity<?> editarDisciplina(Disciplina disciplina) {

		Disciplina disciplinaExist = disciplinaRepository.findById(disciplina.getCodigo()).orElse(null);

		if (disciplinaExist == null) {
			return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).build();
		}

		return ResponseEntity.ok(disciplinaRepository.save(disciplina));
	}

	public ResponseEntity<?> removerDisciplina(String codigo) {
		Disciplina disciplinaExist = disciplinaRepository.findById(codigo).orElse(null);

		if (disciplinaExist == null) {
			return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).build();
		}
		disciplinaRepository.delete(disciplinaExist);
		return ResponseEntity.ok(disciplinaExist);
	}

}
