package exercicios.thread.semaforo;

public class ThreadSemaforo implements Runnable{

	private CorSemaforo cor;
	private boolean parar;
	private boolean corMudou;

	public ThreadSemaforo() {
		this.cor = CorSemaforo.VERMELHO;
		
		//this.parar = false; opcional
		//this.corMudou = false;

		new Thread(this).start();
	}

	@Override
	public void run() {

		while(!parar) {
			try {
			/*	switch(this.cor) {
				case VERMELHO:
					Thread.sleep(1000);
					break;
				case AMARELO:
					Thread.sleep(400);
					break;
				case VERDE:
					Thread.sleep(700);
					break;

				default:
					break;

				}*/
				
				Thread.sleep(this.cor.getTempoEspera());
				this.mudarCor();

			} catch(Exception e) {

				e.printStackTrace();

			}

		}

	}
	
	
	public CorSemaforo getCor() {
		return cor;
	}

	private synchronized void mudarCor() {
		switch (this.cor) {
		case VERMELHO:
		this.cor = CorSemaforo.VERDE;
		break;
		
		case AMARELO:
			this.cor = CorSemaforo.VERMELHO;
			break;
			
		case VERDE:
			this.cor = CorSemaforo.AMARELO;
			break;
		
		}
		this.corMudou = true;
		notify();
		
	}
	
	public synchronized void esperaCorMudar() {
		while(!corMudou) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.corMudou = false;
	}
	


	public synchronized void desligar() {
		this.parar = true;
	}

}



