package ExerciciosExceptions;

class ContatoNaoExisteException extends Exception{
	
	private String nomeContato;
	
	ContatoNaoExisteException(String nomeContato) {
		this.nomeContato = nomeContato;
	}

	@Override
	public String getMessage() {
		return "O Contato: " + nomeContato + " n�o existe na agenda\n";
	}

}
