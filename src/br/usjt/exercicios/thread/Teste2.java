package exercicios.thread;

public class Teste2 {

	public static void main(String[] args) {


		MinhaThreadRunnable2 thread1 = new MinhaThreadRunnable2("#1", 500);
		MinhaThreadRunnable2 thread2 = new MinhaThreadRunnable2("#2", 500);
		MinhaThreadRunnable2 thread3 = new MinhaThreadRunnable2("#3", 500);

		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);

		t1.start();
		t2.start();
		t3.start();

		for(int i = 0; i<15; i++) {
			try {
				Thread.sleep(200);

			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

		System.out.println("Programa finalizado");


	}

}
