import { Component, OnInit } from '@angular/core';
import { DisciplinaService } from '../shared/disciplina.service';
import { Disciplina } from '../shared/disciplina';

@Component({
  selector: 'app-list-disciplina',
  templateUrl: './list-disciplina.component.html',
  styleUrls: ['./list-disciplina.component.css']
})
export class ListDisciplinaComponent implements OnInit {
  disciplinas: Disciplina[];

  constructor(private disciplinaService: DisciplinaService) { }

  ngOnInit() {
    this.disciplinaService.getAll().subscribe(res => {
      this.disciplinas = res;
    });
  }

  /*delete(key: string) {
    this.disciplinaService.delete(key);
  }

  edit(disciplina: Disciplina, key: string) {
    this.disciplinaDataService.changeProfessor(disciplina, key);
  }*/

}
