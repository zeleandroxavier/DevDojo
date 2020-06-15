package br.com.abc.javacore.exerciciometodo.classes;

public class Estudante {
    public String nome;
    public int idade;
    public int[] notas = new int[3];

    public void imprimirAluno() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        for (int valor : notas) {
            System.out.println("Nota: " + valor);
        }
    }

    public void calculoMedia(int[] notas) {
        int soma = 0;
        int media = 0;
        for (int valor : notas) {
            soma += valor;
        }
        media = (soma / 3);

        if (media > 6) {
            System.out.println("Aluno aprovado - Media : " + media + " Soma :" + soma);
        } else {
            System.out.println("Aluno reprovado - Media: " + media + " Soma :" + soma);
        }
    }


}
