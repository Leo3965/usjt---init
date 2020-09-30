package ExerciciosRelacionamentoEntreClasses;

class Contato {
	private String nome;
	private Endereco endereco;
	private Telefone[] telefones;
	
	

	

	Telefone[] getTelefones() {
		return telefones;
	}

	void setTelefones(Telefone[] telefones) {
		this.telefones = telefones;
	}

	Endereco getEndereco() {
		return endereco;
	}

	void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	
	String getNome() {
		return nome;
	}
	
	void setNome(String nome){
		this.nome = nome;
	}
	
}