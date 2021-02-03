package ExerciciosExceptions;

class Agenda2 {
	
	private Contato2[] contatos;
	
	Agenda2() {
		contatos = new Contato2[5];
	}
	
	void adicionarContato(Contato2 contato) throws AgendaCheiaException {
		
		boolean cheia = true;
		for(int i = 0; i < contatos.length; i++) {
			if(contatos[i] == null) {
				contatos[i] = contato;
				cheia = false;
				break;
			}	
		}
		if(cheia) {
			//lan�ar exception aqui
			throw new AgendaCheiaException();
		}
		
	}
	
	int consultaContato(String nome) throws ContatoNaoExisteException {
		
		for(int j = 0; j < contatos.length; j++) {
			if (contatos[j] != null) {
				if(contatos[j].getNome().equalsIgnoreCase(nome)) {
					return j;
					
				}
				
			}
		}
		// lan�ar exception contato n�o existe
		throw new ContatoNaoExisteException(nome);
	}

	@Override
	public String toString() {
		String s = "----------- Contatos -----------";
		for(Contato2 contato : contatos) {
			if(contato != null) {
				s += contato.toString() + "\n";				
			}
		}
		return s;
	}
	

}
