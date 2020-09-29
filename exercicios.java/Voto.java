import javax.swing.JOptionPane;

public class Voto {
	public static void main(String[] args) {
		double brancos, nulos, validos, soma, porBrancos, porNulos, porValidos;
		brancos = Double.parseDouble(JOptionPane.showInputDialog("Digite o numero de votos em branco :"));
		nulos = Double.parseDouble(JOptionPane.showInputDialog("Digite o numero de votos nulos :"));
		validos= Double.parseDouble(JOptionPane.showInputDialog("Digite o numero de votos validos :"));
		soma = brancos + nulos + validos;
		porBrancos = brancos*100/soma;
		porNulos = nulos*100/soma;
		porValidos = validos*100/soma;
		JOptionPane.showMessageDialog(null, "A porcentagem de votos brancos e de " + porBrancos + "%, de nulos e de " + porNulos + "% e a de votos validos e de " + porValidos + "%" );
		
	}
}