package exercicos.somatorioRecursivo;

import java.util.Scanner;

class TesteSomatorio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número natural :");
		int n = sc.nextInt();
		System.out.println(Somatorio.somaN(n));
		sc.close();
	}

}
