package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {

    public static void main(String[] args) {

        Aula a1 = new Aula("Revisitando as ArraysList", 21);

        Aula a2 = new Aula("Listas de OBJ", 15);

        Aula a3 = new Aula("Relacionamento lista e obj", 13);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        Collections.sort(aulas, Comparator.comparing(Aula::getTitulo));

        System.out.println(aulas);

        aulas.sort(Comparator.comparing(Aula::getTempo));

        System.out.println(aulas);

    }

}
