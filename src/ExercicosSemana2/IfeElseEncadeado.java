package ExercicosSemana2;

import javax.swing.JOptionPane;

public class IfeElseEncadeado {

	public static void main(String[] args) {
		double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua nota: "));
				if (nota >= 9) {
					JOptionPane.showMessageDialog(null, "Parab�ns!");
					JOptionPane.showMessageDialog(null, "Voc� tirou um A");
				}
				else if (nota >= 8) {
					JOptionPane.showMessageDialog(null, "Voc� tirou um B");
				}
				else if (nota >= 7) {
					JOptionPane.showMessageDialog(null, "Voc� tirou um C");
				}
				else {
					JOptionPane.showMessageDialog(null, "Voc� foi reprovado!");
				}

	}

}
