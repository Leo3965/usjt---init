package ExerciciosExceptions;

class Contato {
	
	private String nome;
	private String telefone;
	private int identificador;
	
	Contato(){
		
	}
	
	Contato(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}
	
	 int contaIdentificador() {
	     return identificador + 1;
	}

	 @Override
	 public String toString() {
		 return "nome: " + nome + ", telefone: " + telefone + ", identificador: " + identificador + "]";
	 }
}