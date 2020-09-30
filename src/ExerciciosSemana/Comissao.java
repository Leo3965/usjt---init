package ExerciciosSemana;

import javax.swing.JOptionPane;

class Comissao {

	public static void main(String[] args) {
		 
		double precoPeca, quantidadeVendida, resultado;
		precoPeca = Double.parseDouble(JOptionPane.showInputDialog("Digite o preco da peca: "));
		quantidadeVendida = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade vendida: "));
		resultado = (precoPeca*quantidadeVendida)*0.05;
		JOptionPane.showInputDialog(null, " a sua comissao sera de ", + resultado);
	}

}
