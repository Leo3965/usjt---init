package ExerciciosSemana2;

import javax.swing.JOptionPane;

class SalarioFuncionario {

	public static void main(String[] args) {
		double salario, salarioReceber;
		salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu sal�rio :"));
		salarioReceber = salario - (salario * 0.02);
		JOptionPane.showMessageDialog(null, "O sal�rio a receber ser� de " + salarioReceber);
	}

}
