package ExercicosSemana2;

import javax.swing.JOptionPane;

public class CompadorDeSalario {

	public static void main(String[] args) {
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salario :"));
		if (salario > 1045) {
			JOptionPane.showMessageDialog(null, "Você ganha mais de um salário mínimo ");
		}
		else if (salario == 1045) {
			JOptionPane.showMessageDialog(null, "Você ganha um salário mínimo ");
		}
		else {
			JOptionPane.showMessageDialog(null, "Você ganha menos de um salário mínimo ");
		}

	}

}
