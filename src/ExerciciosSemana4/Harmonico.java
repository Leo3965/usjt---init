package ExerciciosSemana4;

import javax.swing.JOptionPane;

public class Harmonico {
	//2.  Dado um natural n, determine o n�mero harm�nico Hn definido por:

	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um n�mero natural : "));
		double soma = 0;
		for(double k = 1; k <= n; k++) {
			soma += 1/k;
			
		}
		JOptionPane.showMessageDialog(null, " O harm�nico de " + n + " � " + soma);
	}

}
