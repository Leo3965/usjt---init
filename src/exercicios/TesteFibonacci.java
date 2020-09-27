package exercicios;

import java.util.Scanner;

class TesteFibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número : ");
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			System.out.print(Fibonacci.calculaFibonacci(i) + " ");
			
		}
		sc.close();
	}

}
