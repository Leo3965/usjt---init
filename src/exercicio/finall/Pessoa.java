package exercicio.finall;

 final class Pessoa {
	
	private String nome;
	private String endereco;
	private String telefone;
	private String cpf;
	private String telefoneCelular;
	String verifica;
	
	Pessoa() {}
	Pessoa(String nome, String endereco, String telefone) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	String getTelefoneCelular() {
		return telefoneCelular;
	}
	void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}
	String getNome() {
		return nome;
	}
	void setNome(String nome) {
		this.nome = nome;
	}
	String getEndereco() {
		return endereco;
	}
	void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	String getTelefone() {
		return telefone;
	}
	void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	String getCpf() {
		return cpf;
	}
	void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	//public abstract String obterEtiquetaEndereco();
	//public abstract void imprimirEtiquetaEndereco();

}
