package ExerciciosSemana2;

import javax.swing.JOptionPane;

class NovoPreco {
	
	public static void main(String[] args) {
		double preco, novoPreco; 
		preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o pre�o do produto :"));
		novoPreco = preco + (preco * 0.1);
		JOptionPane.showMessageDialog(null, "O novo pre�o do produto seleciona ser� de : " + novoPreco);
		
	}

}
