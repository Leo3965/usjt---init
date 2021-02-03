package exercicios.thread;

public class MyThread  implements Runnable{


	private String nome;
	private boolean suspenso;
	private boolean terminada;

	public MyThread(String nome) {
		this.nome = nome;
		this.suspenso = false;
		new Thread(this).start();
	}


	public void run() {
		System.out.println("Executando " + this.nome);

		try {
			Thread.sleep(300);
			synchronized (this) {
				while (suspenso) {
					wait();
				}
				if (this.terminada) {
					System.out.close();
					
				}
			}

			for(int i=0; i<10; i++) {
				System.out.println("Thread " + nome + "," + i);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();

		}

		System.out.println("Thread" + this.nome + " terminado");

	}
	
	void suspend() {
		this.suspenso = true;
	}
	
	synchronized void resume() {
		this.suspenso = false;
		notify();
	}
	
	synchronized void stop() {
		this.terminada = true;
		notify();
	}

}
