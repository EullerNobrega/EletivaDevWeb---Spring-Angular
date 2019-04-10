import { Disciplina } from 'src/app/disciplina/shared/disciplina';


export class Professor {
    matricula: string = '';
    nome: string = '';
    email: string = '';
    disciplinas: Disciplina[] = [];
}
