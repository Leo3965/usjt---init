package ExercicosSemana2;

import javax.swing.JOptionPane;

public class NovoPreço {

	public static void main(String[] args) {
		double preco, novoPreco; 
		preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto :"));
		novoPreco = preco + (preco * 0.1);
		JOptionPane.showMessageDialog(null, "O novo preço do produto seleciona será de : " + novoPreco);
		
	}

}
