import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Professor } from './professor';
import { BehaviorSubject } from 'rxjs';
import { Disciplina } from 'src/app/disciplina/shared/disciplina';

@Injectable({
  providedIn: 'root'
})
export class ProfessorService {
  constructor(private http: HttpClient) { }

  insert(professor: Professor) {
    this.http.post<Professor>('http://localhost:8080/professor', professor);
  }

  get(matricula: string) {
    return this.http.get<Disciplina>('http://localhost:8080/professor/' + matricula);
  }

  getAll() {
    return this.http.get<Professor[]>('http://localhost:8080/professor');
  }
}
