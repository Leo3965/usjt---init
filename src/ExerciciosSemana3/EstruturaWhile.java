package ExerciciosSemana3;

import javax.swing.JOptionPane;

public class EstruturaWhile {

	public static void main(String[] args) {
		int contador = 0;
		while (contador < 5) {
			int nota1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a primeira nota :"));
			int nota2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a segunda nota :"));
			JOptionPane.showMessageDialog(null, "A m�dia do " + (contador+1) + "� aluno � de " + ((nota1 + nota2) / 2 ));
			contador += 1;
			
		}

	}

}