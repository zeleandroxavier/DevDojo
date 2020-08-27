package br.com.abc.introducao;

import java.util.Objects;

    OlaMundo M = new OlaMundo("Adriano");

public class OlaMundo {

    public String Nome;
    public Integer idade;

    public OlaMundo(String nome) {
        Nome = nome;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OlaMundo olaMundo = (OlaMundo) o;
        return Objects.equals(Nome, olaMundo.Nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Nome);
    }
}
