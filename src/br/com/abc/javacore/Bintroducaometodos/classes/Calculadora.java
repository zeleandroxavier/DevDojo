package br.com.abc.javacore.Bintroducaometodos.classes;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(5 + 5);
    }

    public void subtraiDoisNumeros() {
        System.out.println(5 - 5);
    }

    public void multiplicaDoisNumero(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num2 != 0) {
            return (num1 / num2);
        }
        return 0;
    }
    public void imprimeDoisNumerosDivididos(double num1, double num2){
        if (num2 != 0) {
            System.out.println(num1 / num2);
            return;
        }
            System.out.println("Não aceita 0 para a execução do metodo");

    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 30;
        num2 = 40;
        System.out.println("Altera dois numeros!");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }

    public void somaArray(int[] numeros){
        int soma = 0;

        for (int num: numeros) {
            soma += num;
        }
        System.out.println("A soma dos numeros do array é " + soma);

    }

    public void somaVarArgs(int... numeros){
        int soma = 0;

        for (int num: numeros) {
            soma += num;
        }
        System.out.println("A soma dos numeros do array é " + soma);
    }
}
