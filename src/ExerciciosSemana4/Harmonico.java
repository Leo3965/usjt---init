package ExerciciosSemana4;

import javax.swing.JOptionPane;

public class Harmonico {
	//2.  Dado um natural n, determine o número harmônico Hn definido por:

	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número natural : "));
		double soma = 0;
		for(double k = 1; k <= n; k++) {
			soma += 1/k;
			
		}
		JOptionPane.showMessageDialog(null, " O harmônico de " + n + " é " + soma);
	}

}
