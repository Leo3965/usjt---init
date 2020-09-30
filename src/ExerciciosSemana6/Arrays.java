package ExerciciosSemana6;

class Arrays {

	public static void main(String[] args) {
		double[] temperaturas = new double[365];
		temperaturas[0] = 31.4;
		temperaturas[1] = 32;
		temperaturas[2] = 32.5;
		temperaturas[3] = 33.65;
		temperaturas[4] = 30.098;
		
		for(double temp : temperaturas) {
			System.out.println(temp);
		}
		
//		for(int i = 0; i<temperaturas.length; i++) {
//			System.out.println("O valor da temperatura do dia " + (i+1) + " � " + temperaturas[i]);
//			
//		}
//		System.out.println(temperaturas.length);
	}

}