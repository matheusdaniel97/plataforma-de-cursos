package br.com.alura;

import java.util.List;

public class TestaCurso {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando Collections", "Paulo Silveira");

       // javaColecoes.getAulas().add(new Aula("Trabalhando com arraylist", 21));

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));

        System.out.println(javaColecoes.getAulas());


    }
}
