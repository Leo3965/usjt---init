package ExercicosSemana2;

import javax.swing.JOptionPane;

public class SalarioFuncionario2 {

	public static void main(String[] args) {
		double salario, percentual, salarioReceber;
		salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salário :"));
		percentual = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de almento do seu salário :"));
		salarioReceber = salario + (salario * (percentual / 100));
		JOptionPane.showMessageDialog(null, "O salário a receber será de " + salarioReceber);
	}

}
