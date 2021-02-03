package ExerciciosSemana2;

import javax.swing.JOptionPane;

class CompadorDeSalario {
	
	public static void main(String[] args) {
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salario :"));
		if (salario > 1045) {
			JOptionPane.showMessageDialog(null, "Voce ganha mais de um salario minimo ");
		}
		else if (salario == 1045) {
			JOptionPane.showMessageDialog(null, "Voce ganha um salario minimo ");
		}
		else {
			JOptionPane.showMessageDialog(null, "Voce ganha menos de um salario minimo ");
		}

	}

}
