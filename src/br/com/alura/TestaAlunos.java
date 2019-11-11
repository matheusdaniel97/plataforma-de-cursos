package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {

    public static void main(String[] args) {

        Set<String> alunos = new HashSet<>();

        alunos.add("Rodrigo Turini");
        alunos.add("Joao Almeida");
        alunos.add("Matheus Daniel");

        alunos.forEach(aluno -> {
            System.out.println(aluno);
        });

    }
}
