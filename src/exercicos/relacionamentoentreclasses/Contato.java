package exercicos.relacionamentoentreclasses;

class Contato {
	private String nome;
	private Endere�o endereco;
	private Telefone[] telefones;
	
	

	

	Telefone[] getTelefones() {
		return telefones;
	}

	void setTelefones(Telefone[] telefones) {
		this.telefones = telefones;
	}

	Endere�o getEndereco() {
		return endereco;
	}

	void setEndereco(Endere�o endereco) {
		this.endereco = endereco;
	}

	
	String getNome() {
		return nome;
	}
	
	void setNome(String nome){
		this.nome = nome;
	}
	
}


