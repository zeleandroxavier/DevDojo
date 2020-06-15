package br.com.abc.introducao.arrays;

public class Arrays2 {
    public static void main(String[] args) {
        //Auto preenchimento de arrays quando declarados.
        //byte, short, int, long, float, dougle = 0
        //char '\u0000' um espaço para representar um vazio
        //bollean será um falso
        //reference ou de objetos será null
        String[] nomes = new String[4];

        nomes[0] = "Naruto";
        nomes[1] = "Goku";
        nomes[2] = "luffy";
        nomes[3] = "Kurosaki";

        System.out.println(nomes.length);

        for(int i=0; i<nomes.length; i++){
            System.out.println("O nome dele é " + nomes[i]);
        }
        ;

    }
}
