package ExercicosSemana2;

import javax.swing.JOptionPane;

public class AreaTriangulo {

	public static void main(String[] args) {
		int altura, base, area;
		altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura do tri�ngulo :"));
		base = Integer.parseInt(JOptionPane.showInputDialog("Digite a base do tri�ngulo :"));
		area = (altura * base) / 2;
		JOptionPane.showMessageDialog(null, "A �rea do tri�ngulo � igual a " + area);
	}

}
