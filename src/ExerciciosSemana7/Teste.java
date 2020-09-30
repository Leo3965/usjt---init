package ExerciciosSemana7;

class Teste {
	
	public static void main(String[] args) {
		
		Impressora.exibir(1f);
		Impressora.exibir(3.1415f, 5);
		Impressora.exibir(5, "Leo");
		Impressora.exibir(5, 8, "USJT");
		Impressora.exibir("Python", "Dart", "Java");
		
		System.out.println(CalculadoraCientifica.raiz(4));
		System.out.println(CalculadoraCientifica.raiz(25));
		System.out.println(CalculadoraCientifica.raiz(25));
		System.out.println(CalculadoraCientifica.raiz("64"));
		System.out.println(CalculadoraCientifica.potencia(14, 45.6));
		System.out.println(CalculadoraCientifica.potencia(5, 4.6));
		int[] a = {2};
		System.out.println(CalculadoraCientifica.potencia(a, 2.3));
		System.out.println(CalculadoraCientifica.potencia("2", "4"));
		
	}

}
