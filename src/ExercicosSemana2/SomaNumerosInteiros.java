package ExercicosSemana2;

import javax.swing.JOptionPane;

public class SomaNumerosInteiros {

	public static void main(String[] args) {
		 int pn, sn, tn, soma;
		 pn = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número :"));
		 sn = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número :"));
		 tn = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número :"));
		 soma = pn + sn + tn;
		 JOptionPane.showMessageDialog(null, "A soma dos números digitados é igual a " + soma);
	}

}
