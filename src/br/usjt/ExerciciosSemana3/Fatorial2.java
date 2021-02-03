package ExerciciosSemana3;

class Fatorial2 {
	
	static int fatorial (int num) {
		if(num == 0) {
			return 1;
			
		}else {
			return num * fatorial(num - 1);
		}
		
	}

}
