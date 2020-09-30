package ExerciciosSemana;

import javax.swing.JOptionPane;

class Anos {

	public static void main(String[] args) {
		
		double idade, dias;
		idade = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua idade :"));
		dias = idade * 365;
		JOptionPane.showMessageDialog(null, "A sua idade e de " + dias + " dias");
	}

}
