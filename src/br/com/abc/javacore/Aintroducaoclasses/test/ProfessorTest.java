package br.com.abc.javacore.Aintroducaoclasses.test;

import br.com.abc.javacore.Aintroducaoclasses.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {

        Professor professor = new Professor();

        professor.nome = "Xavier";
        professor.matricula = "707070";
        professor.rg = "80808080";
        professor.cpf = 123598789;

        System.out.println(professor.nome);
        System.out.println(professor.matricula);
        System.out.println(professor.rg);
        System.out.println(professor.cpf);
    }
}
