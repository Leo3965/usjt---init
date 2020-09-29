package exercicios.exceptionsContato;

class AgendaCheiaException extends Exception{
	
	@Override
	public String getMessage() {
		return "A agenda já está cheia";
	}

}
