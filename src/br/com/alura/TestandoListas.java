package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestandoListas {

    public static void main(String[] args) {

        String aula1 = "Conhecendo mais listas";
        String aula2 = "Modelando a classe Alura";
        String aula3 = "Trabalhando com Cursos e sets";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);

        for (String aula: aulas) {
        System.out.println("Aula: " + aula);
        }

        aulas.forEach(aula -> {
            System.out.println("Percorrendo: " + aula);
        });

        aulas.add("Aumentando nosso conhecimento");

        System.out.println(aulas);
        Collections.sort(aulas);
        System.out.println(aulas);

    }

}
