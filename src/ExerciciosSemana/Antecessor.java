package ExerciciosSemana;

import javax.swing.JOptionPane;

class Antecessor {

	public static void main(String[] args) {
		 
		double numero, resultado;
		numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero: "));
		resultado = numero - 1;
		JOptionPane.showInputDialog(null, " O antecessor do numero digitado é =", + resultado);
	}

}
