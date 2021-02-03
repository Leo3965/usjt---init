package ExerciciosSemana8.livros;

import java.util.Arrays;
import java.util.Scanner;

public class Biblioteca {

	private int numLivros;
	private Livro[] livros;

	public Biblioteca(int numLivros) {
		this.numLivros = numLivros;
		this.livros = new Livro[numLivros];
	}
	
	public void addLivro() {
		Scanner scan = new Scanner(System.in);
		
		for (int i=0; i<this.numLivros; i++) {
			String nome;
			String autor;
			int ano;
			
			System.out.println("Digite o nome do livro " + (i+1) + "º : ");
			nome = scan.nextLine();
			
			System.out.println("Digite o nome do autor " + (i+1) + "º : ");
			autor = scan.nextLine();
			
			System.out.println("Digite o ano do livro " + (i+1) + "º : ");
			ano = scan.nextInt();
			
			scan.nextLine();
			
			// se usar o contrutor do livro funciona melhor - implementar dps
			livros[i] = new Livro(nome, autor, ano);
		}
	}
	
	public void mostrarTodosLivros() {
		System.out.println("-------------------- BIBLIOTECA --------------------");
		for (Livro liv : livros) {
			System.out.println("O nome do livro é :" + liv.getNome() + " o nome do autor é :"+ liv.getAutor() + " e foi publicado em :" + liv.getAno());
		}
	}

	@Override
	public String toString() {
		return "Biblioteca [numLivros=" + numLivros + ", livros=" + Arrays.toString(livros) + ", livro=" + "]";
	}
	
	


	
}
