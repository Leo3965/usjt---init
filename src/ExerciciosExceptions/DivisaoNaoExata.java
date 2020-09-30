package ExerciciosExceptions;

class DivisaoNaoExata extends Exception {
	
	private int num;
	private int den;
	

	DivisaoNaoExata(int num, int den) {
		super();
		this.num = num;
		this.den = den;
	}

	@Override
	public String toString() {
		return "A opera��o de " + num + "/" + den + " n�o � um inteiro! ";
	}
}