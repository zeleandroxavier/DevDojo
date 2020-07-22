package br.com.abc.javacore.Hherancao.test;

import br.com.abc.javacore.Hherancao.classes.Endereco;
import br.com.abc.javacore.Hherancao.classes.Funcionario;
import br.com.abc.javacore.Hherancao.classes.Pessoa;

public class HerancaTest {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Gina");


        p.setCpf("01265456");
        Endereco end = new Endereco();

        end.setBairro("Bairro 1");
        end.setRua("Rua 25");

        p.setEndereco(end);

        p.imprime();

        System.out.println("---------------------------------------------");
        Funcionario f = new Funcionario("Augusto");

        f.setCpf("6545815");
        f.setSalario(15000);
        f.setEndereco(end);

        f.imprime();

    }
}
