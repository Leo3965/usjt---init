package ExercicosSemana2;

import javax.swing.JOptionPane;

public class ConversorMoeda {

	public static void main(String[] args) {
		double real, cotacao, dolar;
		real = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantia em reais :"));
		cotacao = Double.parseDouble(JOptionPane.showInputDialog("Digite a cotação do dolar :"));
		dolar = real / cotacao;
		JOptionPane.showMessageDialog(null, real + " reais equivale a " + dolar + "dolares");

	}

}
