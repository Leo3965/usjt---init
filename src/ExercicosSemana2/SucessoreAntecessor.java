package ExercicosSemana2;

import javax.swing.JOptionPane;

public class SucessoreAntecessor {

	public static void main(String[] args) {
		int numero, antecessor, sucessor;
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número :"));
		antecessor = numero - 1;
		sucessor = numero + 1;
		JOptionPane.showMessageDialog(null, "O antecessor de " + numero + " é " + antecessor + ", e seu sucessor é " + sucessor);
		
	}

}
