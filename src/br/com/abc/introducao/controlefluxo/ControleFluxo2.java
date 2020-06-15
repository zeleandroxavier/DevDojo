package br.com.abc.introducao.controlefluxo;

public class ControleFluxo2 {
    public static void main(String[] args) {
        int idade = 20;
        String status;
        if (idade < 18) {
            status = "Não adulto";
        } else {
            status = "adulto";
        }

        /*Operador ternário*/
        status = idade < 18 ? "Não adulto" : "adulto";

        System.out.println(status);
    }
}
