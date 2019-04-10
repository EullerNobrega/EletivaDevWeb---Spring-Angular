import { Injectable } from '@angular/core';
import { Disciplina } from './disciplina';
import { HttpClient } from '@angular/common/http';
import { BehaviorSubject } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class DisciplinaService {

  constructor(private http: HttpClient) { }

  insert(disciplina: Disciplina) {
    this.http.post('http://localhost:8080/disciplina', disciplina);
  }

  getAll() {
    return this.http.get<Disciplina[]>('http://localhost:8080/disciplina');
  }
}
