package ExerciciosSemana2;

import javax.swing.JOptionPane;

class MediaAritmetica3Numeros {
	
	public static void main(String[] args) {
		 int pn, sn, tn, soma;
		 pn = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero :"));
		 sn = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero :"));
		 tn = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro n�mero :"));
		 soma = (pn + sn + tn) / 3;
		 JOptionPane.showMessageDialog(null, "A m�dia aritm�tica dos n�meros digitados � igual a " + soma);

	}

}
