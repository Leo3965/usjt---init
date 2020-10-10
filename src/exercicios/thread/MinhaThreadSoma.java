package exercicios.thread;

public class MinhaThreadSoma implements Runnable{
	
	private String nome;
	private int[] nums;
	private static Calculadora calc = new Calculadora();
	
	public MinhaThreadSoma(String nome, int[] nums) {
		this.nome = nome;
		this.nums = nums;
		new Thread(this, nome).start();
		
		
		
	}

	@Override
	public void run() {
		
		System.out.println(this.nome + " iniciada");
		
		int  soma = calc.somaArray(this.nums);
		
		System.out.println("O resultado da soma para a " + this.nome + " é:" + soma);
		System.out.println(this.nome + " terminada");
		
	}

}
