package ExercicosSemana2;

import javax.swing.JOptionPane;

public class MaiorEntre2Numeros {

	public static void main(String[] args) {
		int primeiroNumero, segundoNumero;
		primeiroNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número :"));
		segundoNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número :"));
		if (primeiroNumero < segundoNumero) {
			JOptionPane.showMessageDialog(null, "O maior número é " + segundoNumero);
		}
		else {
			JOptionPane.showMessageDialog(null, "O maior número é " + primeiroNumero);
		}

	}

}
