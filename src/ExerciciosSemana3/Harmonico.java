package ExerciciosSemana3;

import javax.swing.JOptionPane;

class Harmonico {
	
	//2.  Dado um natural n, determine o numero harmonico n definido por:

	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero natural : "));
		double soma = 0;
		for(double k = 1; k <= n; k++) {
			soma += 1/k;
			
		}
		JOptionPane.showMessageDialog(null, " O harmonico de " + n + " � " + soma);
	}

}
