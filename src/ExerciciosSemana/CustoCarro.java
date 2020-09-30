package ExerciciosSemana;

import javax.swing.JOptionPane;

class CustoCarro {

	public static void main(String[] args) {
		 
		double custoDeFabrica, valorFinal;
		custoDeFabrica = Double.parseDouble(JOptionPane.showInputDialog("Digite o custo de fabrica do carro :"));
		valorFinal = custoDeFabrica + (custoDeFabrica*28/100) + (custoDeFabrica*45/100);
		JOptionPane.showMessageDialog(null, "O preco final do carro sera de " + valorFinal + "reais");
	}

}
