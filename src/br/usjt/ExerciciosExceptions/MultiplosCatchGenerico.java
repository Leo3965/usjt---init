package ExerciciosExceptions;

class MultiplosCatchGenerico {

	public static void main(String[] args) {

		int[] numeros = {4, 8, 16, 32, 64, 128};
		int[] demon = {2, 0, 4, 8, 0};
		
		for(int i = 0; i < numeros.length; i++) {
			try {
				System.out.println(numeros[i] + "/" + demon[i] +  " = " + (numeros[i]/demon[i]));
				
			} catch(ArithmeticException exception) {
				System.out.println("Erro ao dividir por zero");
				
			} catch(Throwable exception) {
				System.out.println("Ocorreu um erro");
				
			}
			
			// Modo alternativo para exceptions similares (mesma fam�lia)
			
			//catch(ArithmeticException | ArrayIndexOutOfBoundsException exception) {
				//System.out.println("Erro ao dividir por zero");
				//}
			
		}

	}

}
