package ExercicosSemana2;

import javax.swing.JOptionPane;

public class AreaTriangulo {

	public static void main(String[] args) {
		int altura, base, area;
		altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura do triângulo :"));
		base = Integer.parseInt(JOptionPane.showInputDialog("Digite a base do triângulo :"));
		area = (altura * base) / 2;
		JOptionPane.showMessageDialog(null, "A área do triângulo é igual a " + area);
	}

}
