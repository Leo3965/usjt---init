package ExerciciosSemana7;

class CalculadoraCientifica {
	
	static double raiz(int num1) {
		return Math.sqrt(num1);
	}
	
	static double raiz(double num1) {
		return Math.sqrt(num1);
	}
	
	static double raiz(String num1) {
		return Math.sqrt(Double.parseDouble(num1));
	}
	
	static double potencia(short a, short b) {
		return Math.pow(a, b);
	}
	
	static double potencia(String s1, String s2) {
		return Math.pow(Double.parseDouble(s1), Double.parseDouble(s2));
	}
	
	static double potencia(int a, double b) {
		return Math.pow(a, b);
	}
	
	static double potencia(int[] a, Double b) {
		return Math.pow(a[0], b);
	}
	

}
