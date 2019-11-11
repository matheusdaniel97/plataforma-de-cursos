package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestaCurso2 {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando Colecoes", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Aprendendo colecoes",20));
        javaColecoes.adiciona(new Aula("Desenvolvendo colecoes",15));
        javaColecoes.adiciona(new Aula("Conclusao",5));

        List <Aula> aulasImutaveis = javaColecoes.getAulas();

        System.out.println(aulasImutaveis);

        List<Aula> aulas = new ArrayList<>(aulasImutaveis);

        Collections.sort(aulas);
        System.out.println(aulas);

        System.out.println(javaColecoes.getTempoTotal());

        System.out.println(javaColecoes);

    }

}
