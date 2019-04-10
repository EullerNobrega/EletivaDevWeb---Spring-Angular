import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { HomeComponent } from './home/home.component';
import { AdminComponent } from './admin/admin.component';
import { ConvidadoComponent } from './convidado/convidado.component';
import { EditProfessorComponent } from './professor/edit-professor/edit-professor.component';
import { EditDisciplinaComponent } from './disciplina/edit-disciplina/edit-disciplina.component';
import { ListDisciplinaComponent } from './disciplina/list-disciplina/list-disciplina.component';
import { ListProfessorComponent } from './professor/list-professor/list-professor.component';
import { ProfessorDisciplinaComponent } from './professor/professor-disciplina/professor-disciplina.component';

const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'admin', component: AdminComponent },
  { path: 'convidado', component: ConvidadoComponent },
  { path: 'editProfessor', component: EditProfessorComponent },
  { path: 'editDisciplina', component: EditDisciplinaComponent },
  { path: 'listDisciplina', component: ListDisciplinaComponent },
  { path: 'listProfessor', component: ListProfessorComponent},
  { path: 'listProfessor/:professor.matricula', component: ProfessorDisciplinaComponent},

  // otherwise redirect to home
  { path: '**', redirectTo: '' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
