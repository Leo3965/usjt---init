package ExerciciosSemana2;

import javax.swing.JOptionPane;

class IdadeIfElse {
	
	public static void main(String[] args) {
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade :"));
		if (idade >= 18) {
			JOptionPane.showMessageDialog(null, "Voce e maior de idade");
		}
		else {
			JOptionPane.showMessageDialog(null, "Voce e menor de idade");
		}

	}

}
