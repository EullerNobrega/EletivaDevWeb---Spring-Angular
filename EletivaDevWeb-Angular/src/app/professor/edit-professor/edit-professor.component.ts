import { Component, OnInit } from '@angular/core';
import { Professor } from '../shared/professor';
import { Observable, from } from 'rxjs';
import { ProfessorService } from '../shared/professor.service';
import { NgForm } from '@angular/forms';
import { DisciplinaService } from 'src/app/disciplina/shared/disciplina.service';

@Component({
  selector: 'app-edit-professor',
  templateUrl: './edit-professor.component.html',
  styleUrls: ['./edit-professor.component.css']
})
export class EditProfessorComponent implements OnInit {
  professor: Professor = new Professor();

  disciplinas: Observable<any>;

  constructor(private professorService: ProfessorService, private disciplinaService: DisciplinaService) { }

  ngOnInit() {
    this.disciplinas = this.disciplinaService.getAll();
  }

  onSubmit(form: NgForm) {
    this.professor.nome = form.value.nome;
    this.professor.email = form.value.email;
    this.professor.matricula = form.value.matricula;
    this.professor.disciplinas = form.value.disciplina;

    this.professorService.insert(this.professor);
  }

}
