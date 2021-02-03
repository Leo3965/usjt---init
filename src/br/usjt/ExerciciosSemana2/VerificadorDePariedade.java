package ExerciciosSemana2;

import javax.swing.JOptionPane;

class VerificadorDePariedade {

	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero :"));
		if ((numero % 2) == 0) {
			JOptionPane.showMessageDialog(null, "O n�mero digitado � par");
		}
		else {
			JOptionPane.showMessageDialog(null, "O n�mero digitado � �mpar");
		}
		
	}

}
