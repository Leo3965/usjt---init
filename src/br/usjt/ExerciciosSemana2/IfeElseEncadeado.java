package ExerciciosSemana2;

import javax.swing.JOptionPane;

class IfeElseEncadeado {
	public static void main(String[] args) {
		
		double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua nota: "));
		
		if (nota >= 9) {
			JOptionPane.showMessageDialog(null, "Parabens!");
			JOptionPane.showMessageDialog(null, "Voce tirou um A");
		}
		else if (nota >= 8) {
			JOptionPane.showMessageDialog(null, "Voce tirou um B");
		}
		else if (nota >= 7) {
			JOptionPane.showMessageDialog(null, "Voce tirou um C");
		}
		else {
			JOptionPane.showMessageDialog(null, "Voce foi reprovado!");
		}
	}
	

}

