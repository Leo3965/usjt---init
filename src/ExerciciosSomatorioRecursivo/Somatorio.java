package ExerciciosSomatorioRecursivo;

class Somatorio {
	
	static int somaN(int n) {
		if(n == 1) {
			return 1;	
		}
		return n + somaN(n-1);
		
	}

}
