package ExerciciosSemana2;

import javax.swing.JOptionPane;

class SwitchDiasDaSemana {

	public static void main(String[] args) {
		
		int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero correspondente a um dia da semana : ( Ex: 1-Seg, 2-Ter...)"));
		switch (dia) {
		case 1:
			JOptionPane.showMessageDialog(null, "Segunda-Feira");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Ter�a-Feira");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "Quarta-Feira");
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "Quinta-Feira");
			break;
		case 5:
			JOptionPane.showMessageDialog(null, "Sexta-Feira");
			break;
		case 6:
			JOptionPane.showMessageDialog(null, "S�bado-Feira");
			break;
		case 7:
			JOptionPane.showMessageDialog(null, "Domingo-Feira");
			break;
		default:
			JOptionPane.showMessageDialog(null, "O n�mero digitado n�o corresponde a nenhum dia da semana");
			break;
		
		}
	}

}
