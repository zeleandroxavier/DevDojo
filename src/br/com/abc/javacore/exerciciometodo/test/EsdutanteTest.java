package br.com.abc.javacore.exerciciometodo.test;

import br.com.abc.javacore.exerciciometodo.classes.Estudante;

public class EsdutanteTest {

    public static void main(String[] args) {


        Estudante aluno = new Estudante();

        aluno.setNome("João das Neves");
        aluno.setIdade(-1);
        aluno.setNotas(new float[]{5, 3, 8});

        System.out.println("---------------------------------");
        aluno.imprimirAluno();
        System.out.println("---------------------------------");

        aluno.calculoMedia();

        System.out.println("---------------------------------");

        System.out.println(aluno.getNome());


    }
}
