package exercicios.thread;

public class Teste4 {

	public static void main(String[] args) {


		MinhaThreadRunnable2 thread1 = new MinhaThreadRunnable2("#1", 500);
		MinhaThreadRunnable2 thread2 = new MinhaThreadRunnable2("#2", 700);
		MinhaThreadRunnable2 thread3 = new MinhaThreadRunnable2("#3", 900);

		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);

		t1.start();
		/*try {
			t1.join(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/

		t2.start();

		/*try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/

		t3.start();


		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}



		System.out.println("Programa finalizado");


	}

}