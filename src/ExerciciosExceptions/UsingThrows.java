package ExerciciosExceptions;

import java.util.Scanner;

class UsingThrows {

	public static void main(String[] args) {
		boolean verifica = false;
		do {
			try {
				System.out.println("Entre com um n�mero decimal :");
				lerNumero();
				verifica = false;
			} 
			catch(java.util.InputMismatchException e) {
				System.out.println("Entrada inv�lida, digite novamente");
				verifica = true;
				
			}
			catch (java.lang.Exception e) {
				System.out.println("Entrada inv�lida " + e.getMessage());
				e.printStackTrace();
			}
			
		} while(verifica);
		
	}
	
	static double lerNumero() throws java.lang.Exception {
		Scanner scan = new Scanner(System.in);
		double num = scan.nextDouble();
		System.out.println("Voc� digitou " + num);
		scan.close();
		return num;
	}

}