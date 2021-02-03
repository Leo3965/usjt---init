package exercicios.thread;

public class Teste5 {

	public static void main(String[] args) {
		
		MinhaThreadRunnable2 thread1 = new MinhaThreadRunnable2("#1", 500);
		MinhaThreadRunnable2 thread2 = new MinhaThreadRunnable2("#2", 500);
		MinhaThreadRunnable2 thread3 = new MinhaThreadRunnable2("#3", 500);

		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);
		
		t1.setPriority(10);
		t2.setPriority(3);
		t3.setPriority(1);
		
		//t1.setPriority(Thread.MAX_PRIORITY);

		t1.start();
		t2.start();
		t3.start();
		
	}

}
