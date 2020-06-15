package br.com.abc.javacore.exerciciometodo.test;

import br.com.abc.javacore.exerciciometodo.classes.Estudante;

public class EsdutanteTest {

    public static void main(String[] args) {

        int[] valorNotas = new int[]{6,8,8};

        Estudante aluno = new Estudante();

        aluno.nome = "João das Neves";
        aluno.idade = 35;

        aluno.notas = valorNotas;

        System.out.println("---------------------------------");
        aluno.imprimirAluno();
        System.out.println("---------------------------------");

        aluno.calculoMedia(valorNotas);


    }
}
