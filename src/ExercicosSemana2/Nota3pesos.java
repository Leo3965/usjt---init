package ExercicosSemana2;

import javax.swing.JOptionPane;

public class Nota3pesos {

	public static void main(String[] args) {
		double trabalhoLab, avaliacaoSemestral, exameFinal, nota;
		trabalhoLab = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua nota do trabalho de laboratório :"));
		avaliacaoSemestral = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua nota da avaliação semestral : "));
		exameFinal = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua nota do exame final :"));
		nota = (trabalhoLab * 0.2) + (avaliacaoSemestral * 0.3) + (exameFinal * 0.5);
		JOptionPane.showMessageDialog(null, "A sua nota final é de " + nota);

	}

}
