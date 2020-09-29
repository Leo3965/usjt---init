package exercicio.interfaces;

abstract class FiguraGeometrica {
	private String nome;
	private String cor;
	
	String getNome() {
		return nome;
	}
	void setNome(String nome) {
		this.nome = nome;
	}
	String getCor() {
		return cor;
	}
	void setCor(String cor) {
		this.cor = cor;
	}

}
