package ExercicosSemana6;


public class TesteJogaresDeFutebol {

	public static void main(String[] args) {
		
		JogadoresDeFutebol primeiroJogador = new JogadoresDeFutebol("Leo", 10);
		JogadoresDeFutebol segundoJogador = new JogadoresDeFutebol("Rafinha", 9);
		System.out.println(primeiroJogador.nome);
		System.out.println(primeiroJogador.numero);
		System.out.println(segundoJogador.nome);
		System.out.println(segundoJogador.numero);
		
	}

}
