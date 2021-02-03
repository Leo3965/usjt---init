package exercicios.thread.semaforo;

public class Semaforo extends Thread {

	private String cor;
	private int tempo;

	public Semaforo(String cor, int tempo) {
		this.cor = cor;
		this.tempo = tempo;
		start();
	}

	public void run() {
		System.out.println("Semáforo :" + cor);

		try {
			
			for(int i=0; i<10; i++) {
				
				Thread.sleep(tempo);
				
			}
			
		} catch(Exception e) {
			
			e.printStackTrace();

		}
		
	}
	
}
