package ExerciciosSemana2;

import javax.swing.JOptionPane;

class AreaTriangulo {
	
	public static void main(String[] args) {
		int altura, base, area;
		altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura do triangulo :"));
		base = Integer.parseInt(JOptionPane.showInputDialog("Digite a base do triangulo :"));
		area = (altura * base) / 2;
		JOptionPane.showMessageDialog(null, "A area do triangulo e igual a " + area);
	}

}
