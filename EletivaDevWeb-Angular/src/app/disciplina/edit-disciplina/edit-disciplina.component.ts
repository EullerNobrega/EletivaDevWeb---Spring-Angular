import { Component, OnInit } from '@angular/core';
import { DisciplinaService } from '../shared/disciplina.service';
import { NgForm } from '@angular/forms';
import { Disciplina } from '../shared/disciplina';

@Component({
  selector: 'app-edit-disciplina',
  templateUrl: './edit-disciplina.component.html',
  styleUrls: ['./edit-disciplina.component.css']
})
export class EditDisciplinaComponent implements OnInit {
  disciplina: Disciplina = new Disciplina();

  constructor(private disciplinaService: DisciplinaService) {}

  ngOnInit() {
  }

  onSubmit(form: NgForm) {
    this.disciplina.codigo = form.value.codigo;
    this.disciplina.descricao = form.value.descricao;
    this.disciplina.qtdCreditos = form.value.qtdCreditos;

    this.disciplinaService.insert(this.disciplina);
  }

}
