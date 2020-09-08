package ExercicosSemana2;

import javax.swing.JOptionPane;

public class PodeDirigirTernario {

	public static void main(String[] args) {
		int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual é a sua idade ?"));
		String podeDirigir = idade >= 18 ? ("Você pode dirigir") : ("Você não pode dirigir, por enquanto");
		JOptionPane.showMessageDialog(null, podeDirigir);
	}
}
