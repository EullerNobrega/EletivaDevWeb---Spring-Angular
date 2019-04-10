import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { AdminComponent } from './admin/admin.component';
import { ConvidadoComponent } from './convidado/convidado.component';
import { EditDisciplinaComponent } from './disciplina/edit-disciplina/edit-disciplina.component';
import { EditProfessorComponent } from './professor/edit-professor/edit-professor.component';
import { FormsModule } from '@angular/forms';
import { ListDisciplinaComponent } from './disciplina/list-disciplina/list-disciplina.component';
import { ListProfessorComponent } from './professor/list-professor/list-professor.component';
import { ProfessorDisciplinaComponent } from './professor/professor-disciplina/professor-disciplina.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    AdminComponent,
    ConvidadoComponent,
    EditDisciplinaComponent,
    EditProfessorComponent,
    ListDisciplinaComponent,
    ListProfessorComponent,
    ProfessorDisciplinaComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [HttpClientModule],
  bootstrap: [AppComponent]
})
export class AppModule { }
