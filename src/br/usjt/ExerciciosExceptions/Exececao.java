package ExerciciosExceptions;

class Exececao {

	public static void main(String[] args) {
		try {
			
			int[] vetor = new int[4];
			
			System.out.println("Antes da exception");
			
			vetor[4] = 1;
			
			System.out.println("Esse texte n�o ser� impresso");
		}
		catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println("Exce��o ao acessar um indice de um vetor que n�o existe");
		}
		System.out.println("Esse texto ser� impresso ap�s a exception");
	}

}
