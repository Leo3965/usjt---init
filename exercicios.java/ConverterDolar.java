import javax.swing.JOptionPane;

public class ConverterDolar {
	public static void main (String[] args) {
		double cotacaoDolar, quantidadeDolar, quantidadeReal;
		cotacaoDolar = Double.parseDouble(JOptionPane.showInputDialog("Digite a cotação do Dolar: "));
		quantidadeDolar = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de Dolares: "));
		quantidadeReal = cotacaoDolar * quantidadeDolar;
		JOptionPane.showInputDialog(null, "O valor em reais é = " + quantidadeReal);
	}
}