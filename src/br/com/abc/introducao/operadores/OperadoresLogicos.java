package br.com.abc.introducao.operadores;

public class OperadoresLogicos {
    public static void main (String[] args){
        /*** Operadores Logicos
         * && = and
         * || = ou
         */

        int idade = 18;
        float salario = 1000f;

        System.out.println(idade >= 18 && salario >= 3000);

        System.out.println(idade >= 18 || salario >= 3000);

    }
}
