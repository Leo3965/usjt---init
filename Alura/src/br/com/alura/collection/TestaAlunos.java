package br.com.alura.collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {

		Collection<String> alunos = new HashSet<String>();
		alunos.add("Léo");
		alunos.add("Nico");
		alunos.add("Rafa"); 
		alunos.add("Léo");
		alunos.add("Nico");
		alunos.add("Rafa"); 
		
		alunos.forEach(aluno -> System.out.println(aluno));
		
		System.out.println(alunos.size());
		
	}

}
