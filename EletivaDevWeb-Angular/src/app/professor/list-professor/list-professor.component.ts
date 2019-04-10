import { Component, OnInit } from '@angular/core';
import { ProfessorService } from '../shared/professor.service';
import { Professor } from '../shared/professor';

@Component({
  selector: 'app-list-professor',
  templateUrl: './list-professor.component.html',
  styleUrls: ['./list-professor.component.css']
})
export class ListProfessorComponent implements OnInit {
  professores: Professor[];

  constructor(private professorService: ProfessorService) { }

  ngOnInit() {
    this.professorService.getAll().subscribe(res => {
      this.professores = res;
    });
  }

  /*delete(key: string) {
    this.professorService.delete(key);
  }

  edit(professor: Professor, key: string) {
    this.professorDataService.changeProfessor(professor, key);
  }*/

}
