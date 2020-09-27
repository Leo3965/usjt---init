package ExercicosSemana6;

import java.util.Scanner;

class MatrazIdentidade {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o tamanho da matriz identidade :");
		int num = sc.nextInt();
		
		int[][] matrazIdentidade = new int[num][num];
		
		ExibeMatriz.exibeMatriz(matrazIdentidade);
		
			
		sc.close();
		}
	
}




