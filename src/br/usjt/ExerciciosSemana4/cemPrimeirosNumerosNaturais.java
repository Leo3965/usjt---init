package ExerciciosSemana4;

import javax.swing.JOptionPane;

class cemPrimeirosNumerosNaturais {
	
	public static void main(String[] args) {
String msg = " Os primeiros cem numeros sao: \n";
		for ( int i = 0; i < 100; i++) {
			if ( i == 99){
				msg = msg + i + ".";
			}
			else {
				msg = msg + i + ", ";
			}
			
		}
		JOptionPane.showMessageDialog(null, msg);
	}

}
