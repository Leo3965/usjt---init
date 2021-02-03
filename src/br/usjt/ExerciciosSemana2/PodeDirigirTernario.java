package ExerciciosSemana2;

import javax.swing.JOptionPane;

class PodeDirigirTernario {

	public static void main(String[] args) {

		int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual � a sua idade ?"));
		String podeDirigir = idade >= 18 ? ("Voc� pode dirigir") : ("Voc� n�o pode dirigir, por enquanto");
		JOptionPane.showMessageDialog(null, podeDirigir);
		
	}

}
