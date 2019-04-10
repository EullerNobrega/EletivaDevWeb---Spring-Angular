import { Component, OnInit } from '@angular/core';
import { ProfessorService } from '../shared/professor.service';
import { ActivatedRoute } from '@angular/router';
import { Professor } from '../shared/professor';

@Component({
  selector: 'app-professor-disciplina',
  templateUrl: './professor-disciplina.component.html',
  styleUrls: ['./professor-disciplina.component.css']
})
export class ProfessorDisciplinaComponent implements OnInit {
  professores: Array<Professor>;
  professor: Professor;
  profMat: string;
  constructor(private professorService: ProfessorService, private route: ActivatedRoute) { }

  ngOnInit() {
    this.route.params.subscribe(params => {
      this.profMat = params['professor.matricula'];
    });

    this.professorService.getAll().subscribe(res => {
      this.professores = res;
      this.professor = this.professores.find(element => {
        console.log(element);
        return element.matricula === this.profMat;
      }
      );
    });
  }

}
