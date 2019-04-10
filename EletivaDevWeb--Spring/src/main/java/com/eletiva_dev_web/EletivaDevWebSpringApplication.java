package com.eletiva_dev_web;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.eletiva_dev_web.model.Disciplina;
import com.eletiva_dev_web.model.Professor;
import com.eletiva_dev_web.repository.DisciplinaRepository;
import com.eletiva_dev_web.repository.ProfessorRepository;

@SpringBootApplication
public class EletivaDevWebSpringApplication implements CommandLineRunner {

	@Autowired
	private ProfessorRepository profRep;

	@Autowired
	private DisciplinaRepository discRep;

	public static void main(String[] args) {
		SpringApplication.run(EletivaDevWebSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		// ---------------------------- Disciplinas -------------------------------------

		Disciplina d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11, d12, d13, d14, d15;
		
		d1 = new Disciplina("INF1212", "SISTEMAS OPERACIONAIS I", "60");
		d2 = new Disciplina("INF1213","SISTEMAS OPERACIONAIS II", "60");
		d3 = new Disciplina("INF1223", "BANCO DE DADOS I", "60");
		d4 = new Disciplina("INF1224", "BANCO DE DADOS II", "60");
		d5 = new Disciplina("INF1209", "ESTRUTURA DE DADOS I", "60");
		d6 = new Disciplina("INF1217", "ESTRUTURA DE DADOS II", "60");
		d7 = new Disciplina("INF1616", "REDES DE COMPUTADORES I", "60");
		d8 = new Disciplina("INF1617", "REDES DE COMPUTADORES II", "60");
		d9 = new Disciplina("INF1406", "ARQ E ORG DE COMPUTADORES I", "60");
		d10 = new Disciplina("INF1407", "ARQ E ORG DE COMPUTADORES II","60" );
		d11 = new Disciplina("INF1121", "INTRODUCAO A PROGRAMACAO I","60" );
		d12 = new Disciplina("INF1122", "INTRODUCAO A PROGRAMACAO II", "60");
		d13 = new Disciplina("INF1124", "PRATICA DE PROGRAMACAO", "60");
		d14 = new Disciplina("INF1123", "PROGRAMACAO ORIENTADA A OBJETO", "60");
		d15 = new Disciplina("INF1125", "PARADIG DE LING DE PROGRAMACAO", "60");
		
		discRep.save(d1);
		discRep.save(d2);
		discRep.save(d3);
		discRep.save(d4);
		discRep.save(d5);
		discRep.save(d6);
		discRep.save(d7);
		discRep.save(d8);
		discRep.save(d9);
		discRep.save(d10);
		discRep.save(d11);
		discRep.save(d12);
		discRep.save(d13);
		discRep.save(d14);
		discRep.save(d15);
		
		// ---------------------------- Professores -------------------------------------
		
		Professor p1, p2, p3, p4, p5, p6 ,p7;
		List<Disciplina> l1, l2, l3, l4, l5, l6, l7;
		
		l1 = new ArrayList<Disciplina>() {
			{
				add(d7);
				add(d8);
			}
		};
		p1 = new Professor("Almir Pires Ferreira Neto", "almir.pires@gmail.com", "2005528075", l1);
		
		l2 = new ArrayList<Disciplina>() {
			{
				add(d4);
				add(d14);
			}
		};
		p2 = new Professor("Fernando José Araújo Wanderley", "fernando@unicap.br", "2012506469", l2);
		
		l3 = new ArrayList<Disciplina>() {
			{
				add(d1);
				add(d2);
			}
		};
		p3 = new Professor("Antônio Luiz de Oliveira Cavalcanti Júnior", "tj@unicap.br", "2001704132", l3);
		
		l4 = new ArrayList<Disciplina>() {
			{
				add(d5);
				add(d6);
			}
		};
		p4 = new Professor("Márcio Augusto Silva Bueno", "masb@unicap.br", "2013853860", l4);
		
		l5 = new ArrayList<Disciplina>() {
			{
				add(d9);
				add(d10);
			}
		};
		p5 = new Professor("Sérgio Murilo Maciel Fernandes", "sergio@c3.unicap.br", "2005072512", l5);
		
		l6 = new ArrayList<Disciplina>() {
			{
				add(d11);
				add(d12);
				add(d13);
			}
		};
		p6 = new Professor("Ana Eliza Lopes Moura", "aelm@c3.unicap.br", "2005520184", l6);
		
		l7 = new ArrayList<Disciplina>() {
			{
				add(d3);
				add(d15);
			}
		};
		p7 = new Professor("Liliane Fonseca", "lilianefonseca@gmail.com", "2003300338", l7);
		
		profRep.save(p1);
		profRep.save(p2);
		profRep.save(p3);
		profRep.save(p4);
		profRep.save(p5);
		profRep.save(p6);
		profRep.save(p7);
		
	}

}
