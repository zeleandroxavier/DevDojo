package br.com.abc.javacore.Fmodificadorestatico.test;


import br.com.abc.javacore.Fmodificadorestatico.classes.Cliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente c = new Cliente();
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();

        System.out.println("Exibindo quantidade de parcela possiveis");

        for (int parcela : c.getParcelas()) {
            System.out.println(parcela + " ");
        }
    }
}
