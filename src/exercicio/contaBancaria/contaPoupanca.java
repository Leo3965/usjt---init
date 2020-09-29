package exercicio.contaBancaria;

class contaPoupanca extends ContaBancaria{
	private int diaRendimento;
	

	int getDiaRendimento() {
		return diaRendimento;
	}

	void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	@Override
	public String toString() {
	String 	s = "ContaPoupança[";
	s += "diaRendimento: " + diaRendimento;
	
	s += super.toString();
		return s;
	}
	

}
