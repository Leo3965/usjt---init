package ExerciciosSemana2;

import javax.swing.JOptionPane;

class SucessoreAntecessor {

	public static void main(String[] args) {
		
		int numero, antecessor, sucessor;
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero :"));
		antecessor = numero - 1;
		sucessor = numero + 1;
		JOptionPane.showMessageDialog(null, "O antecessor de " + numero + " � " + antecessor + ", e seu sucessor � " + sucessor);
		
	}

}
