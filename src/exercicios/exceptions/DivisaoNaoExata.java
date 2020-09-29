package exercicios.exceptions;

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
		return "A operação de " + num + "/" + den + " não é um inteiro! ";
	}
}
