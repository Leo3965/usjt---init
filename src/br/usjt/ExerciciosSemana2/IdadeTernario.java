package ExerciciosSemana2;

import javax.swing.JOptionPane;

class IdadeTernario {
	
	public static void main(String[] args) {
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade :"));
		String comparador = idade >= 18 ? ("Voce e maior de idade") : ("Voce e menor de idade");
		JOptionPane.showMessageDialog(null, comparador);
	}

}
