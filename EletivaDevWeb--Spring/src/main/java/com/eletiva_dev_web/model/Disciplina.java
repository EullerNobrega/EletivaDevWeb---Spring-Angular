package com.eletiva_dev_web.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "table_disciplinas")
public class Disciplina {

	@Id
	private String codigo;

	private String descricao;

	private String qtdCreditos;

	public Disciplina() {
	}
	
	public Disciplina(String codigo, String descricao, String qtdCreditos) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.qtdCreditos = qtdCreditos;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getQtdCreditos() {
		return qtdCreditos;
	}

	public void setQtdCreditos(String qtdCreditos) {
		this.qtdCreditos = qtdCreditos;
	}

}
