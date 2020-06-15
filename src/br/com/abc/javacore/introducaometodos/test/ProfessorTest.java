package br.com.abc.javacore.introducaometodos.test;

import br.com.abc.javacore.introducaometodos.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.cpf = "123.123.654-89";
        prof.matricula = "111222";
        prof.nome = "Marcos";
        prof.rg = "122211-5";

        Professor prof2 = new Professor();
        prof2.cpf = "523.123.654-89";
        prof2.matricula = "111222";
        prof2.nome = "Joao das coves";
        prof2.rg = "922211-5";

        System.out.println("Dentro do professor");

        prof.imprime();

        prof2.imprime();


    }
}
