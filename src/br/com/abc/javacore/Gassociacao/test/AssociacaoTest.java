package br.com.abc.javacore.Gassociacao.test;

import br.com.abc.javacore.Gassociacao.classes.exercicioassociacao.Aluno;
import br.com.abc.javacore.Gassociacao.classes.exercicioassociacao.Local;
import br.com.abc.javacore.Gassociacao.classes.exercicioassociacao.Professor;
import br.com.abc.javacore.Gassociacao.classes.exercicioassociacao.Seminario;

public class AssociacaoTest {

    public static void main(String[] args) {
        Aluno aluno = new Aluno("William Suane", 27);
        Aluno aluno2 = new Aluno("Joana", 20);

        Seminario sem = new Seminario("Como programar java");
        Professor prof = new Professor(" Yoda", "Usar a força para programar");
        Local local = new Local("Rua das araras", "mato");

        aluno.setSeminario(sem);
        aluno2.setSeminario(sem);

        sem.setProfessor(prof);
        sem.setLocal(local);

        sem.setAlunos(new Aluno[]{aluno,aluno2});
        Seminario[] semArray = new Seminario[1];
        semArray[0] = sem;
        prof.setSeminarios(semArray);

        sem.print();
    }
}
