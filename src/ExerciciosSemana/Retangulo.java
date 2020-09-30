package ExerciciosSemana;

import javax.swing.JOptionPane;

class Retangulo {

	public static void main(String[] args) {
		
		double base, altura, area;
		base = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base do retangulo: "));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do retangulo: "));
		area = base * altura;
		JOptionPane.showMessageDialog(null, "A area do retangulo e = " + area);
	}

}
