import javax.swing.JOptionPane;

public class Salario {
	public static void main(String[] args) {
		double salarioMensal, reajuste, novoSalario;
		salarioMensal = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salario :"));
		reajuste = Double.parseDouble(JOptionPane.showInputDialog("Digite o reajuste : "));
		novoSalario = salarioMensal + (salarioMensal*reajuste/100);
		JOptionPane.showMessageDialog(null, "O seu novo salario sera de " + novoSalario + " reais");
		
	}
}