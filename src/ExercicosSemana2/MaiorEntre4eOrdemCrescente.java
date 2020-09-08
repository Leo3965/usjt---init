package ExercicosSemana2;

import java.util.Scanner;

public class MaiorEntre4eOrdemCrescente {

	public static void main(String[] args) {
		int primeiroN, segundoN, terceiroN, quartoN;
		System.out.println("Digite 3 números em ordem crescente :");
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número :");
		primeiroN = leitor.nextInt();
		System.out.println("Digite o segundo número :");
		segundoN = leitor.nextInt();
		System.out.println("Digite o terceiro número :");
		terceiroN = leitor.nextInt();
		
		System.out.println("Digite um número qualquer :");
		System.out.println("Digite o quarto número :");
		quartoN = leitor.nextInt();
		
		leitor.close();

		if (quartoN >= terceiroN) {
			System.out.println("Os números ordenados do maior ao menor : " + primeiroN + " " + segundoN + " " + terceiroN + " " + quartoN);
		}
		else if (quartoN >= segundoN) {
			System.out.println("Os números ordenados do maior ao menor : " + primeiroN + " " + segundoN + " " + quartoN + " " + terceiroN);
		}
		else if (quartoN >= primeiroN) {
			System.out.println("Os números ordenados do maior ao menor : " + primeiroN + " " + quartoN + " " + segundoN + " " + terceiroN);
		}
		else {
			System.out.println("Os números ordenados do maior ao menor : " + quartoN + " " + primeiroN + " " + segundoN + " " + terceiroN);
		}

	}

}
