package ExercicosSemana2;

import javax.swing.JOptionPane;

public class IdadeTernario {

	public static void main(String[] args) {
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade :"));
		String comparador = idade >= 18 ? ("Voc� � maior de idade") : ("Voc� � menor de idade");
		JOptionPane.showMessageDialog(null, comparador);
	}

}
