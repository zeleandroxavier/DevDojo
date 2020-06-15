package br.com.abc.javacore.sobrecargametodos.test;

import br.com.abc.javacore.sobrecargametodos.classes.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Chica da Silva", "111.222.455-58",4800, "802557559");


        //funcionario.init("Chica da Silva", "111.222.455-58",4800, "802557559");

        funcionario.imprime();

    }
}

