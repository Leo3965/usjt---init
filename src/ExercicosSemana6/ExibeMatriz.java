package ExercicosSemana6;

class ExibeMatriz {
	
	static void exibeMatriz(int[][] matriz){
		for(int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if(i == j) {
					matriz[i][j] = 1;
				}
				
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
			
		}
	}
	
	void exibeMatriz(){
		
	}

}
