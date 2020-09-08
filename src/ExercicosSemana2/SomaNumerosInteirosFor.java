package ExercicosSemana2;

import javax.swing.JOptionPane;

public class SomaNumerosInteirosFor {

	public static void main(String[] args) {
		int soma = 0;
		 for (int i = 0; i < 3; i++) {
			 int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i+1) + "º número :"));
			 soma += num;
		 }
	JOptionPane.showMessageDialog(null, "A soma dos números digitados é igual a " + soma);
	}

}
