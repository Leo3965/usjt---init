package ExerciciosSemana2;

import javax.swing.JOptionPane;

class RaizQuadradoCubo {

	public static void main(String[] args) {
		
		double numero ,raiz, quadrado, cubo;
		numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um n�mero inteiro e positivo :"));
		raiz = Math.pow(numero, (0.5));
		quadrado = Math.pow(numero, 2);
		cubo = Math.pow(numero, 3);
		JOptionPane.showMessageDialog(null, "A raiz de " + numero + " � igual a " +
		 raiz + ", o quadrado � igual a " + quadrado + " e o cubo � igual a " + cubo);
		
	}

}
