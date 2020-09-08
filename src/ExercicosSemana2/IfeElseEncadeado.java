package ExercicosSemana2;

import javax.swing.JOptionPane;

public class IfeElseEncadeado {

	public static void main(String[] args) {
		double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua nota: "));
				if (nota >= 9) {
					JOptionPane.showMessageDialog(null, "Parabéns!");
					JOptionPane.showMessageDialog(null, "Você tirou um A");
				}
				else if (nota >= 8) {
					JOptionPane.showMessageDialog(null, "Você tirou um B");
				}
				else if (nota >= 7) {
					JOptionPane.showMessageDialog(null, "Você tirou um C");
				}
				else {
					JOptionPane.showMessageDialog(null, "Você foi reprovado!");
				}

	}

}
