package br.com.abc.introducao.controlefluxo;

public class ControleFluxo6 {
    public static void main(String[] args) {
        //dado um valor de um carro, descubra em quantas vezes ele pode ser parcelado
        //as parcelas não podem ser menores que mil

        double valorTotal = 30000;

        for(int parcela = (int) valorTotal; parcela >=1; parcela--){
            double valorParcela = valorTotal/parcela;
            if(valorParcela < 1000){
                break;
            }
            System.out.println("A parecela de numero " + parcela + " e igual ao valor de " + valorParcela );

        }

    }
}
