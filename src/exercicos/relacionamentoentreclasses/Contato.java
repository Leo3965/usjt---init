package exercicos.relacionamentoentreclasses;

class Contato {
	private String nome;
	private Endereço endereco;
	private Telefone[] telefones;
	
	

	

	Telefone[] getTelefones() {
		return telefones;
	}

	void setTelefones(Telefone[] telefones) {
		this.telefones = telefones;
	}

	Endereço getEndereco() {
		return endereco;
	}

	void setEndereco(Endereço endereco) {
		this.endereco = endereco;
	}

	
	String getNome() {
		return nome;
	}
	
	void setNome(String nome){
		this.nome = nome;
	}
	
}


