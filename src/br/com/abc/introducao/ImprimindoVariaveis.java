package br.com.abc.introducao;

public class ImprimindoVariaveis {

    //comentário
    /*
    * blocos de comentário
    *
    * */

    /***
     * comentário no padrão para documentação (exemplo)
     * @param args  paramentro de entrada do metodo main
     */

    public static void main (String[] args){

        int idadeDosPaisParaCadastro = 10;
        double salarioDouble = 3000;
        float salarioFloat = 3000;
        byte idadeByte = 12;
        short idadeShort = 32767;
        boolean verdadeiro = true;
        boolean falso = false;
        long numeroGrande = 1000L;
        char caractere = '\u0041'; //2 bytes Detalhe: Pode ser passados numero ou caracteres especiais ou codigos unicode
        // \u0041 .

        String nome = "Xavier";


        System.out.println(" Nome: " + nome +  "\n Idade: " + idadeDosPaisParaCadastro + "\n" + caractere);
    }
}
