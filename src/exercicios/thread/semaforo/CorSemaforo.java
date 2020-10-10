package exercicios.thread.semaforo;

public enum CorSemaforo {
	
	VERDE(800), AMARELO(400), VERMELHO(1000);
	
	public int getTempoEspera() {
		return tempoEspera;
	}

	private int tempoEspera;
	
	CorSemaforo(int tempoEspera) {
		this.tempoEspera = tempoEspera;
	}

}
