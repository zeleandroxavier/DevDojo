package br.com.abc.introducao.controlefluxo;

public class ExercicioControleFluxo3 {
    public static void main(String[] args) {
        //Imprima todos os numeros pares de 0 até 100.000
        int valor = 10;

        /*Numeros pares*/
        for (int i = 0; i <= valor; i++) {
            int div = i % 2;
            if (div == 0) {
                System.out.println("Numero par é igual a: " + i);
            }
        }
        /*Numero ímpares*/
        for (int i = 0; i <= valor; i++) {
            int div = i % 2;
            if (div != 0) {
                System.out.println("Numero impar é igual a: " + i);
            }
        }
    }
}
