package exercicios.thread;

public class Teste7 {

	public static void main(String[] args) {

		MyThread t1 = new MyThread("#1");
		MyThread t2 = new MyThread("#2");
		t1.suspend();
		
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t2.suspend();
		
		t1.resume();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		 t2.resume();
		 
		 t2.stop();
	}
}

