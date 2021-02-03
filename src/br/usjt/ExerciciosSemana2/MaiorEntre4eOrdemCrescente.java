package ExerciciosSemana2;

import java.util.Scanner;

class MaiorEntre4eOrdemCrescente {
	
	public static void main(String[] args) {
		
		int primeiroN, segundoN, terceiroN, quartoN;
		System.out.println("Digite 3 n�meros em ordem crescente :");
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero :");
		primeiroN = leitor.nextInt();
		System.out.println("Digite o segundo n�mero :");
		segundoN = leitor.nextInt();
		System.out.println("Digite o terceiro n�mero :");
		terceiroN = leitor.nextInt();
		
		System.out.println("Digite um n�mero qualquer :");
		System.out.println("Digite o quarto n�mero :");
		quartoN = leitor.nextInt();
		
		leitor.close();
		
		if (quartoN >= terceiroN) {
			System.out.println("Os n�meros ordenados do maior ao menor : " + primeiroN + " " + segundoN + " " + terceiroN + " " + quartoN);
		}
		else if (quartoN >= segundoN) {
			System.out.println("Os n�meros ordenados do maior ao menor : " + primeiroN + " " + segundoN + " " + quartoN + " " + terceiroN);
		}
		else if (quartoN >= primeiroN) {
			System.out.println("Os n�meros ordenados do maior ao menor : " + primeiroN + " " + quartoN + " " + segundoN + " " + terceiroN);
		}
		else {
			System.out.println("Os n�meros ordenados do maior ao menor : " + quartoN + " " + primeiroN + " " + segundoN + " " + terceiroN);
		}
	}
	

}

