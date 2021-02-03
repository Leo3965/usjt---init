package ExerciciosSemana;

import java.util.Scanner;

class TesteFibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um n�mero : ");
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			System.out.print(Fibonacci.calculaFibonacci(i) + " ");
			
		}
		sc.close();
	}

}