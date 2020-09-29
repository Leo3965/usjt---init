package exercicios.exceptionsContato;

class Contato2 {
	private static int contador = 0;
	
	private int id;
	private String nome;
	private String telefone;
	private String email;
	
	Contato2(){
		contador++;
		id = contador;
	}
	
	
	int getId() {
		return id;
	}


	String getNome() {
		return nome;
	}
	void setNome(String nome) {
		this.nome = nome;
	}
	String getTelefone() {
		return telefone;
	}
	void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	String getEmail() {
		return email;
	}
	void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		String s = "[";
		s += "ID: " + id;
		s += " Nome: " + nome;
		s += " Telefone: " + telefone;
		s += " E-mail: " + email;
		s += "]";
		return s; 
	}

}
