package br.com.abc.javacore.Gassociacao.classes.exercicioassociacao;

public class Seminario {

    private String titulo;
    private Aluno[] alunos;
    private Professor professor;
    private Local local;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario() {
    }

    public void print(){
        System.out.println(" ---------------  Relatório de Seminários ------------------------");
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Professor Palestrante: " + this.professor.getNome());
        System.out.println("Local : " + this.local.getRua() + "Bairro: " + this.local.getBairro());
        System.out.println("Alunos participantes ");

        for (Aluno aluno : alunos) {

            System.out.println(aluno.getNome() + " ");

        }

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
