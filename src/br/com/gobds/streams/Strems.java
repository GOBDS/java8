package br.com.gobds.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Strems {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		//Ordenar por numero de alunos
		cursos.sort(Comparator.comparingInt(Curso::getAlunos));
		cursos.forEach(s -> System.out.println(s.getNome()));
		
		//Filtar por numero de alunos
		cursos.stream()
			.filter(c -> c.getAlunos() >= 50)
			.map(Curso::getNome)
			.forEach(System.out::println);
			

	}

}


class Curso {
    private String nome;
    private int alunos;

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }
}