package ExerciciosSemana;

import javax.swing.JOptionPane;

class ConverterDolar {

	public static void main(String[] args) {

		double cotacaoDolar, quantidadeDolar, quantidadeReal;
		cotacaoDolar = Double.parseDouble(JOptionPane.showInputDialog("Digite a cota��o do Dolar: "));
		quantidadeDolar = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de Dolares: "));
		quantidadeReal = cotacaoDolar * quantidadeDolar;
		JOptionPane.showInputDialog(null, "O valor em reais � = " + quantidadeReal);
		
	}

}
