package ExerciciosRelacionamentoEntreClasses;

class Endereco {
	private String nomeRua;
	private String complemento;
	private String cidade;
	private String estado;
	private String cep;
	
	String getNomeRua() {
		return nomeRua;
	}
	void setNomeRua(String nomeRua) {
		this.nomeRua = nomeRua;
	}
	String getComplemento() {
		return complemento;
	}
	void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	String getCidade() {
		return cidade;
	}
	void setCidade(String cidade) {
		this.cidade = cidade;
	}
	String getEstado() {
		return estado;
	}
	void setEstado(String estado) {
		this.estado = estado;
	}
	String getCep() {
		return cep;
	}
	void setCep(String cep) {
		this.cep = cep;
	}
}