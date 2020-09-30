package ExerciciosSemana2;

import javax.swing.JOptionPane;

class SomaNumerosInteirosFor {

	public static void main(String[] args) {
		
		int soma = 0;
		 for (int i = 0; i < 3; i++) {
			 int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i+1) + "� n�mero :"));
			 soma += num;
		 }
	JOptionPane.showMessageDialog(null, "A soma dos n�meros digitados � igual a " + soma);
	}

}
