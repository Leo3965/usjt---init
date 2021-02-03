package ExerciciosSemana;

import javax.swing.JOptionPane;

class Quadrado {

	public static void main(String[] args) {
		 
		double pn, sn , tn, qn, resultado;
		pn = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
		sn = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
		tn = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro valor: "));
		qn = Double.parseDouble(JOptionPane.showInputDialog("Digite o quarto valor: "));
		resultado = pn*pn + sn*sn + tn*tn + qn*qn;
		JOptionPane.showInputDialog(null, "O Resultado é = ", + resultado);
	}

}
