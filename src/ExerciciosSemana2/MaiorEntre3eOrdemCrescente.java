package ExerciciosSemana2;

import javax.swing.JOptionPane;

class MaiorEntre3eOrdemCrescente {
	
	public static void main(String[] args) {
		int primeiroN, segundoN, terceiroN;
		primeiroN = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero :"));
		segundoN = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero :"));
		terceiroN = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro n�mero ;"));
		if (primeiroN >= segundoN && segundoN >= terceiroN) {
			JOptionPane.showMessageDialog(null, "Os n�meros ordenados do maior ao menor : " + primeiroN + " " + segundoN + " " + terceiroN);
		}
		else if (primeiroN >= segundoN && segundoN <= terceiroN) {
			JOptionPane.showMessageDialog(null, "Os n�meros ordenados do maior ao menor : " + terceiroN + " " + primeiroN + " " + segundoN);
		}
		else if (primeiroN <= segundoN && primeiroN >= terceiroN) {
			JOptionPane.showMessageDialog(null, "Os n�meros ordenados do maior ao menor : " + segundoN + " " + primeiroN + " " + terceiroN);
		}
		else if (segundoN >= terceiroN && terceiroN >= primeiroN) {
			JOptionPane.showMessageDialog(null, "Os n�meros ordenados do maior ao menor : " + segundoN + " " + terceiroN + " " + primeiroN);
		}
		else if (terceiroN >= primeiroN && primeiroN >= segundoN) {
			JOptionPane.showMessageDialog(null, "Os n�meros ordenados do maior ao menor : " + terceiroN + " " + primeiroN + " " + segundoN);
		}
		else {
			JOptionPane.showMessageDialog(null, "Os n�meros ordenados do maior ao menor : "
						+ terceiroN + " " + segundoN + " " + primeiroN);
		}
		
			}

}
