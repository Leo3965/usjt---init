package ExercicosSemana2;

import javax.swing.JOptionPane;

public class CompadorDeSalario {

	public static void main(String[] args) {
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salario :"));
		if (salario > 1045) {
			JOptionPane.showMessageDialog(null, "Voc� ganha mais de um sal�rio m�nimo ");
		}
		else if (salario == 1045) {
			JOptionPane.showMessageDialog(null, "Voc� ganha um sal�rio m�nimo ");
		}
		else {
			JOptionPane.showMessageDialog(null, "Voc� ganha menos de um sal�rio m�nimo ");
		}

	}

}
