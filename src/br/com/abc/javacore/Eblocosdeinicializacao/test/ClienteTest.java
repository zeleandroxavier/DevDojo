package br.com.abc.javacore.Eblocosdeinicializacao.test;

import br.com.abc.javacore.Eblocosdeinicializacao.classes.Cliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente c = new Cliente();

        System.out.println("Exibindo quantidade de parcela possiveis");

        for (int parcela : c.getParcelas()) {
            System.out.println(parcela + " ");
        }
    }
}
