package exercicios.thread;

public class TesteTicTac {

	public static void main(String[] args) {
		
		TiqueTaque tt = new TiqueTaque();
		ThreadTicTac tique = new ThreadTicTac("Tique", tt);
		ThreadTicTac taque = new ThreadTicTac("Taque", tt);
		
		try {
			tique.t.join();
			taque.t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		

	}

}
