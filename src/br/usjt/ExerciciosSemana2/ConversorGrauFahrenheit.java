package ExerciciosSemana2;

import javax.swing.JOptionPane;

class ConversorGrauFahrenheit {

	public static void main(String[] args) {
		double celsius = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em graus celsius :"));
		double fahrenheit = ((celsius * 1.8) + 32);
		
		JOptionPane.showMessageDialog(null, celsius + "(C) e igual a " + fahrenheit + "(F)");

	}
}
