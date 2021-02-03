package ExerciciosSemana2;

import javax.swing.JOptionPane;

class MaiorEntre2Numeros {
	
	public static void main(String[] args) {
		int primeiroNumero, segundoNumero;
		primeiroNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero :"));
		segundoNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero :"));
		if (primeiroNumero < segundoNumero) {
			JOptionPane.showMessageDialog(null, "O maior numero e " + segundoNumero);
		}
		else {
			JOptionPane.showMessageDialog(null, "O maior numero e " + primeiroNumero);
		}

	}

}
