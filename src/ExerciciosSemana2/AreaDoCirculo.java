package ExerciciosSemana2;

import javax.swing.JOptionPane;

class AreaDoCirculo {
	
	public static void main(String[] args) {
		double raio, area;
		raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio do circulo :"));
		area = (Math.PI * raio);
		JOptionPane.showMessageDialog(null, "A area do circulo com o raio de " + raio + " e igual a " + area);
	}

}
