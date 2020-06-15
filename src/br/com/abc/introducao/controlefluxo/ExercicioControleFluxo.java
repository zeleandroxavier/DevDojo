package br.com.abc.introducao.controlefluxo;

public class ExercicioControleFluxo {
    public static void main(String[] args) {
        /*
         * Crie uma variavel salario e imprima seu imposto
         * salario < 1000 5%
         * salario >= 1000 && salario < 2000 10%
         * salario >= 2000 && salario < 4000 15%
         * salario > 5000 20%
         */
        double valorImposto;
        double salario;
        double salarioLiquido;

        salario = 5690;

        if (salario < 1000) {
            valorImposto = (salario * 0.05);
        } else if (salario >= 1000 && salario < 2000) {
            valorImposto = (salario * 0.1);
        } else if (salario >= 2000 && salario < 4000) {
            valorImposto = (salario * 0.15);
        } else {
            valorImposto = (salario * 0.2);
        }

        System.out.println("O valor do imposto é " + valorImposto + " e o salario é " + salario + " sendo assim " +
                "seu salario liquido é ---> " + (salario - valorImposto)) ;
    }
}
