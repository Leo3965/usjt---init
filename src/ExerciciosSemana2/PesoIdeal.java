package ExerciciosSemana2;

import javax.swing.JOptionPane;

class PesoIdeal {
	
	public static void main(String[] args) {
		double altura, imc;
		altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura :"));
		String sexo = new String(JOptionPane.showInputDialog("Digite o seu sexo (m) para masculino e (f) para feminino :"));
		if (sexo == "m") {
			imc = (72.7 * altura) - 58;
			JOptionPane.showMessageDialog(null, "Seu peso ideal � de " + imc);
		}
		else {
			imc = (62.1 * altura) - 44.7;
			JOptionPane.showMessageDialog(null, "Seu peso ideal � de " + imc);
		}
		
	}

}
