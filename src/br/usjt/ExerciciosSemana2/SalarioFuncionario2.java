package ExerciciosSemana2;

import javax.swing.JOptionPane;

class SalarioFuncionario2 {

	public static void main(String[] args) {

		double salario, percentual, salarioReceber;
		salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu sal�rio :"));
		percentual = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de almento do seu sal�rio :"));
		salarioReceber = salario + (salario * (percentual / 100));
		JOptionPane.showMessageDialog(null, "O sal�rio a receber ser� de " + salarioReceber);
		
	}

}
