package ExerciciosSemana8.livros;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o n�mero de livros : ");
		Biblioteca biblioteca = new Biblioteca(sc.nextInt());
		
		biblioteca.addLivro();
		biblioteca.mostrarTodosLivros();
		
		
		//System.out.println(biblioteca);
		
	}
	
	

}
