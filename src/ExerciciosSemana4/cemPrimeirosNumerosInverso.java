package ExerciciosSemana4;

import javax.swing.JOptionPane;

public class cemPrimeirosNumerosInverso {

	public static void main(String[] args) {
		String msg = " Os ultimos cem números são: \n";
		for ( int i = 99; i >= 0; i--) {
			if ( i == 0){
				msg = msg + i + ".";
			}
			else {
				msg = msg + i + ", ";
			}
			
		}
		JOptionPane.showMessageDialog(null, msg);
	}
}
