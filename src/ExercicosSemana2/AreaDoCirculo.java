package ExercicosSemana2;

import javax.swing.JOptionPane;

public class AreaDoCirculo {

	public static void main(String[] args) {
		double raio, area;
		raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio do c�rculo :"));
		area = (Math.PI * raio);
		JOptionPane.showMessageDialog(null, "A �rea do c�rculo com o raio de " + raio + " � igual a " + area);
	}

}
