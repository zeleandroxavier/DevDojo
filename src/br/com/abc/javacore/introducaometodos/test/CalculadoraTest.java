package br.com.abc.javacore.introducaometodos.test;

import br.com.abc.javacore.introducaometodos.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        calc.somaDoisNumeros();

        calc.subtraiDoisNumeros();

        calc.multiplicaDoisNumero(50,3);

        double retorno = calc.divideDoisNumeros(20,5);

        System.out.println("Divisão de dois numero é igual a: " + retorno);

        calc.imprimeDoisNumerosDivididos(10,0);

        System.out.println("Continua a execução!!!!");

        int[] numeros = new int[]{2,5,8,9,8,8};
        calc.somaArray(numeros);
        calc.somaVarArgs(2,5,8,9,8,8,12);

    }
}
