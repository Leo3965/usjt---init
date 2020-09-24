package ExercicosSemana6;

import java.util.Scanner;

class MatrazIdentidade {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o tamanho da matriz identidade :");
		int num = sc.nextInt();
		
		int[][] matrazIdentidade = new int[num][num];
		
		for(int i = 0; i < matrazIdentidade.length; i++) {
			for (int j = 0; j < matrazIdentidade.length; j++) {
				if(i == j) {
					matrazIdentidade[i][j] = 1;
				}
				
				System.out.print(matrazIdentidade[i][j] + " ");
			}
		
		sc.close();
			
		}
	
	}
}

