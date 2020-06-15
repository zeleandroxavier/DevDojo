package br.com.abc.introducao.arrays;

public class Arrays1 {
    public static void main(String[] args) {
        /*todo o array em java é considerado um objeto*/
        /*o array em java sempre tem um tamanho */
        /*você so pode usar a palavra new quando criar um objeto*/
        int[] idades = new int[3];

        idades[0] = 50;
        idades[1] = 70;
        idades[2] = 20;

        for(int i=0;i<=2;i++){
            System.out.println(idades[i]);
        }

    }
}
