package ExercicosSemana2;

import javax.swing.JOptionPane;

public class IdadeIfElse {

	public static void main(String[] args) {
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade :"));
		if (idade >= 18) {
			JOptionPane.showMessageDialog(null, "Voc� � maior de idade");
		}
		else {
			JOptionPane.showMessageDialog(null, "Voc� � menor de idade");
		}

	}

}
