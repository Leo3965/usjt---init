import javax.swing.JOptionPane;

public class Retangulo {
	public static void main(String [] args) {
		double base, altura, area;
		base = Double.parseDouble(JOptionPane.ShowInputDialog("Digite o valor da base do retangulo: "));
		altura = Double.parseDouble(JOptionPane.ShowInputDialog("Digite a altura do retangulo: "));
		area = base * altura;
		JOptionPane.ShowInputDialog(null, "A area do retangulo e = ", + area);
	}
}