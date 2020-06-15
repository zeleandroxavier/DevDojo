package br.com.abc.introducao.controlefluxo;

public class ControleFluxo5 {
    //dado um valor de um carro, descubra em quantas vezes ele pode ser parcelado
    //as parcelas não podem ser menores que mil


    public static void main(String[] args) {

        double valorCarro = 30000;

        for(int parcela = 1; parcela < valorCarro; parcela++){

            double valorParcela = valorCarro / parcela;
            if(valorParcela >= 1000) {
                System.out.println("Numero da parcela: " + parcela + " com valor de R$ " + valorParcela);
            }else{break;}
        }

    }
}
