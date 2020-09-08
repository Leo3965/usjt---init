package ExercicosSemana2;

import javax.swing.JOptionPane;

public class SalarioFuncionario {

	public static void main(String[] args) {
		double salario, salarioReceber;
		salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salário :"));
		salarioReceber = salario - (salario * 0.02);
		JOptionPane.showMessageDialog(null, "O salário a receber será de " + salarioReceber);
		
	}

}
