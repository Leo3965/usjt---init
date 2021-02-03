package ExerciciosSemana2;

import javax.swing.JOptionPane;

class SwitchCase {

	public static void main(String[] args) {
		 
		int nota = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a sua nota :"));
		switch (nota) {
		case 10:
			JOptionPane.showMessageDialog(null, "Parab�ns!");
		case 9:
			JOptionPane.showMessageDialog(null, "Voc� tirou um A");
			break;
		case 8:
			JOptionPane.showMessageDialog(null, "Voc� tirou um B");
			break;
		case 7:
			JOptionPane.showMessageDialog(null, "Voc� tirou um C");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Voc� foi reprovado!");
			break;
		}
	}

}
