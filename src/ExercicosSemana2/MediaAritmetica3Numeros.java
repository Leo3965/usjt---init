package ExercicosSemana2;

import javax.swing.JOptionPane;

public class MediaAritmetica3Numeros {

	public static void main(String[] args) {
		 int pn, sn, tn, soma;
		 pn = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número :"));
		 sn = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número :"));
		 tn = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número :"));
		 soma = (pn + sn + tn) / 3;
		 JOptionPane.showMessageDialog(null, "A média aritmética dos números digitados é igual a " + soma);

	}

}
