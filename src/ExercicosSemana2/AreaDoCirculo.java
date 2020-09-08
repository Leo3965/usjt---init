package ExercicosSemana2;

import javax.swing.JOptionPane;

public class AreaDoCirculo {

	public static void main(String[] args) {
		double raio, area;
		raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio do círculo :"));
		area = (Math.PI * raio);
		JOptionPane.showMessageDialog(null, "A área do círculo com o raio de " + raio + " é igual a " + area);
	}

}
