package br.com.abc.javacore.modificadorestatico.test;

import br.com.abc.javacore.modificadorestatico.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Audi", 275);
        Carro c3 = new Carro("Mercedes", 290);

        c1.imprime();
        c2.imprime();
        c3.imprime();

        System.out.println("####################################");

        Carro.velocidadeLimite = 220;

        c1.imprime();
        c2.imprime();
        c3.imprime();

    }
}
