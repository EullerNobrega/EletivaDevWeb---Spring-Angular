package com.eletiva_dev_web.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="tb_professor")
public class Professor {

	private String nome;
	
	private String email;
	
	@Id
	private String matricula;
	
	@OneToMany
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	public Professor() {
	}
	
	public Professor(String nome, String email, String matricula, List<Disciplina> disciplinas) {
		super();
		this.nome = nome;
		this.email = email;
		this.matricula = matricula;
		this.disciplinas = disciplinas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
}
