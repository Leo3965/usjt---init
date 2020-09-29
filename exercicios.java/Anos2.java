import javax.swing.JOptionPane;

public class Anos2 {
	public static void main(String [] args) {
		double anos , dias, meses, resultado;
		anos = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua idade :"));
		meses = Double.parseDouble(JOptionPane.showInputDialog("Digite os seu(s) mes(es) de vida :"));
		dias = Double.parseDouble(JOptionPane.showInputDialog("Digite o(s) seu(s) dia(s) :"));
		resultado = (anos*365) + (meses*30) + dias;
		JOptionPane.showMessageDialog(null, " Voce tem " + resultado + " dias de vida");
		
	}
}