package ExercicosSemana2;

import javax.swing.JOptionPane;

public class MaiorEntre2Numeros {

	public static void main(String[] args) {
		int primeiroNumero, segundoNumero;
		primeiroNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero :"));
		segundoNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero :"));
		if (primeiroNumero < segundoNumero) {
			JOptionPane.showMessageDialog(null, "O maior n�mero � " + segundoNumero);
		}
		else {
			JOptionPane.showMessageDialog(null, "O maior n�mero � " + primeiroNumero);
		}

	}

}
