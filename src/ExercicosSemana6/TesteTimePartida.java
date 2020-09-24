package ExercicosSemana6;

import javax.swing.JOptionPane;

class TesteTimePartida {

	public static void main(String[] args) {
	
		Time time1 = new Time();
		Time time2 = new Time();
		Partida partida = new Partida();
		
		partida.setLocal(JOptionPane.showInputDialog("Digite o local da partida :"));
		partida.setTorcida(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de torcedores :")));
		time1.setNome(JOptionPane.showInputDialog("Digite o nome do time :"));
		time1.setTecnico(JOptionPane.showInputDialog("Digite o nome do técnico :"));
		time2.setNome(JOptionPane.showInputDialog("Digite o nome do segundo time :"));
		time2.setTecnico(JOptionPane.showInputDialog("Digite o nome do técnico :"));
		
		JOptionPane.showMessageDialog(null, " A partida entre " + time1.getNome() + " que tem como tecnico atual o(a) " + time1.getTecnico() + " e " + time2.getNome() + " que tem como tecnico atual o(a)" + time2.getTecnico() + " acontecerá no local " + partida.getLocal() + " e " + partida.getTorcida() + " torcedores estão presentes");
		
	}

}
