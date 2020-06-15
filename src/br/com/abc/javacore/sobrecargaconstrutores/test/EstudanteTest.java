package br.com.abc.javacore.sobrecargaconstrutores.test;

import br.com.abc.javacore.sobrecargaconstrutores.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante est = new Estudante("12345","Carlitos", new double[]{8,5,6},"20/12/1987");
        est.imprime();
    }
}
