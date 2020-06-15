package br.com.abc.introducao.operadores;

public class OperadoresDeAtribuicao {

    /*psvm + tab = Para criar o metodo main*/
    /*sout + tab = para criar o System.out.println */
    public static void main(String[] args) {
        /* =, -=, +=, *=, /=, %= */

        int salario = 1800;

        salario = salario + 1000;
        salario += 1000;

        //salario -= 1000;

        System.out.println("O seu salario é " + salario);
    }
}
