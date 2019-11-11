package br.com.alura;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Aluno {

    private String nome;
    private int numeroMatricula;
    private List<Aula> aulas = new LinkedList<Aula>();
    private Set<Aluno> alunos = new HashSet<>();

    public Aluno(String nome, int numeroMatricula) {
        if (nome == null)
            throw new NullPointerException("Nome nao pode ser null");
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
    }

    @Override
    public boolean equals(Object obj) {

        Aluno a = (Aluno) obj;
        return this.nome.equals(a);
    }

    @Override
    public int hashCode() {
        return this.nome.hashCode();
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    @Override
    public String toString() {
        return "Aluno: " + this.nome + " - Matricula: " + this.numeroMatricula;
    }
}
