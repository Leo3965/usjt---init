package ExercicosSemana2;

import javax.swing.JOptionPane;

public class IdadeTernario {

	public static void main(String[] args) {
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade :"));
		String comparador = idade >= 18 ? ("Você é maior de idade") : ("Você é menor de idade");
		JOptionPane.showMessageDialog(null, comparador);
	}

}
