package ExerciciosSemana;

class Fibonacci {

	 static int calculaFibonacci(int num) {
		if(num < 2) {
			return num;
		}
		return calculaFibonacci(num-1) + calculaFibonacci(num-2);
	 
	}
}
