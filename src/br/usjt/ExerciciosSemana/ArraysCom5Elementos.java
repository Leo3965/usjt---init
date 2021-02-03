package ExerciciosSemana;

import java.util.Scanner;

class ArraysCom5Elementos {

	public static void main(String[] args) {
		
		int[] a = new int[5];
		int[] b = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		
		for(int i = 0; i < a.length; i++) {
		System.out.print("Entre com o valor da " + (i+1) + "� posi��o :");
		a[i] = sc.nextInt();
		b[i] = a[i];
		}
		System.out.print("Vetor A :");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.print("Vetor B :");
		for(int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		sc.close();
	}

}
