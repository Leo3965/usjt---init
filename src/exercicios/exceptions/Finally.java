package exercicios.exceptions;

class Finally {

	public static void main(String[] args) {
		
		int[] numeros = {4, 8, 16, 32, 64, 128};
		int[] demon = {2, 0, 4, 8, 0};
		
		for(int i = 0; i < numeros.length; i++) {
			try {
				System.out.println(numeros[i] + "/" + demon[i] +  " = " + (numeros[i]/demon[i]));
				
			} catch(ArithmeticException exception) {
				System.out.println("Erro ao dividir por zero");
				System.exit(0); // O exit termina a execução do programa.
				
			} catch(ArrayIndexOutOfBoundsException exception) {
				System.out.println("Posição do array inválida");
				
			} finally { // O finally sempre será executado
				System.out.println("Essa linha é impresa sempre após o try ou o catch");
			}
			
		}

	}

}
