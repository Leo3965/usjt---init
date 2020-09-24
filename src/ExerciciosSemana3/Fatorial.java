package ExerciciosSemana3;

import javax.swing.JOptionPane;

public class Fatorial {

	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número natural :"));
		int ind = num;
		
		if (num >= 0) {
			for(int fat = num - 1; fat >= 1; fat--) {
				num *= fat;
					
			}			
		}
		else {
			num = 1;
			}
		System.out.println("O fatorial de " + ind + " é " + num );
//		JOptionPane
		
		
	}

}
