package ExerciciosSemana3;

import javax.swing.JOptionPane;

public class VerificadorDeN�meroPrimo {

	public static void main(String[] args) {
		int primo = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero primo :"));
		int total = 0;
		for(int contador = primo; contador >=1; contador--) {
			if ((primo % contador) == 0) {
				System.out.println(" divis�vel por : " +contador);
				total += 1;
			}
			else {
				System.out.println(contador);
			}
			
		}
		System.out.println("O n�mero " + primo + " foi div�sivel " + total + " vezes");
		if (total == 2) {
			System.out.println("Portanto � um n�mero primo");
			
		}
		else {
			System.out.println("Portanto n�o � um n�mero primo");
		}

	}

}
