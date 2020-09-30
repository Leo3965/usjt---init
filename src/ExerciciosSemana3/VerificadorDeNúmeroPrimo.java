package ExerciciosSemana3;

import javax.swing.JOptionPane;

class VerificadorDeNúmeroPrimo {
	
	public static void main(String[] args) {
		int primo = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero primo :"));
		int total = 0;
		for(int contador = primo; contador >=1; contador--) {
			if ((primo % contador) == 0) {
				System.out.println(" divisivel por : " +contador);
				total += 1;
			}
			else {
				System.out.println(contador);
			}
			
		}
		System.out.println("O numero " + primo + " foi divisivel " + total + " vezes");
		if (total == 2) {
			System.out.println("Portanto e um numero primo");
			
		}
		else {
			System.out.println("Portanto nao e um numero primo");
		}

	}

}
