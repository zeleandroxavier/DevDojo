package br.com.abc.javacore.exerciciometodo.classes;

public class Estudante {
    private String nome;
    private float idade;
    private float[] notas;

    public void imprimirAluno() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        if (this.notas != null) {
            for (float valor : notas) {
                System.out.println("Nota: " + valor);
            }
        }
    }

    public void calculoMedia() {
        if (this.notas == null) {
            System.out.println("Este aluno não possui notas");
            return;
        }
        float soma = 0;
        float media = 0;
        for (float valor : this.notas) {
            soma += valor;
        }
        media = (soma / this.notas.length);

        if (media > 6) {
            System.out.println("Aluno aprovado - Media : " + media + " Soma :" + soma);
        } else {
            System.out.println("Aluno reprovado - Media: " + media + " Soma :" + soma);
        }


    }
    public  void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(float idade){
        if(idade <= 0){
            System.out.println("Você não pode fazer isso!");
            return;
        }
        this.idade = idade;
    }
    public void setNotas(float[] notas){
        this.notas = notas;
    }

    public String getNome(){
        return this.nome;
    }

    public float getIdade(){
        return this.idade;
    }
    public float[] getNotas(){
        return this.notas;
    }



}
