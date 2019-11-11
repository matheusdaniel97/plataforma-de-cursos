package br.com.alura;

public class TestaBuscaAluno {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando Colecoes", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Aprendendo colecoes",20));
        javaColecoes.adiciona(new Aula("Desenvolvendo colecoes",15));
        javaColecoes.adiciona(new Aula("Conclusao",5));

        Aluno a1 = new Aluno("Rodrigo", 34672);
        Aluno a2 = new Aluno("Nico", 171253);
        Aluno a3 = new Aluno("Matheus", 17152);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        System.out.println(javaColecoes.buscaMatriculado(34672));

    }

}
