package ExercicosSemana2;

import javax.swing.JOptionPane;

public class AnoBissexto {

	public static void main(String[] args) {
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite um ano :"));
		if (((ano % 400) == 0) || (((ano % 4) == 0) && (ano % 100) != 0) ) {
			JOptionPane.showMessageDialog(null, ano + " � um ano bissexto");
		}
		else {
			JOptionPane.showMessageDialog(null, ano + " n�o � um ano bissexto");
		}

	}

}
