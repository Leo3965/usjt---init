package ExerciciosSemana3;

import javax.swing.JOptionPane;

public class EstruturaFor {

	public static void main(String[] args) {
		for (int contador =0; contador < 5; contador++) {
			int nota1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a primeira nota :"));
			int nota2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a segunda nota :"));
			JOptionPane.showMessageDialog(null, "A m�dia do " + (contador+1) + "� aluno � de " + ((nota1 + nota2) / 2 ));
			
		}

	}

}
