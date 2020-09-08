package ExerciciosSemana3;

import javax.swing.JOptionPane;

public class VerificadorDeNúmeroPrimo {

	public static void main(String[] args) {
		int primo = Integer.parseInt(JOptionPane.showInputDialog("Digite um número primo :"));
		int total = 0;
		for(int contador = primo; contador >=1; contador--) {
			if ((primo % contador) == 0) {
				System.out.println(" divisível por : " +contador);
				total += 1;
			}
			else {
				System.out.println(contador);
			}
			
		}
		System.out.println("O número " + primo + " foi divísivel " + total + " vezes");
		if (total == 2) {
			System.out.println("Portanto é um número primo");
			
		}
		else {
			System.out.println("Portanto não é um número primo");
		}

	}

}
