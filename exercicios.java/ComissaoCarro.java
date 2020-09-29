import javax.swing.JOptionPane;

public class ComissaoCarro {
	public static void main(String[] args) {
		double carrosVendidos, totalDeVendas, salarioFixo, comissao, salarioFinal;
		carrosVendidos = Double.parseDouble(JOptionPane.showInputDialog("Digite o numero de carros vendidos :"));
		totalDeVendas = Double.parseDouble(JOptionPane.showInputDialog("Digite o total de vendas :"));
		salarioFixo = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salario :"));
		comissao = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua comissao :"));
		salarioFinal = salarioFixo + (carrosVendidos*comissao) + (totalDeVendas*5/100);
		JOptionPane.showMessageDialog(null, "O seu salario final sera de :" + salarioFinal + "reais");
		
	}
}