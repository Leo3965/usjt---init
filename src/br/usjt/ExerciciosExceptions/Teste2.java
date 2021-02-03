package ExerciciosExceptions;

import java.util.Scanner;

class Teste2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Agenda2 agenda = new Agenda2();
		
		int menu = 0;
		
		while(menu != 3) {
			
			menu = obterOpcaoMenu(sc);
			
			if(menu == 1) { // consultar contato
				verificaConsulta(sc, agenda);
				
			}
			else if(menu == 2) { // adicionar contato
				adicionarContato(sc, agenda);
			}
			else if(menu == 3) { // sair
				System.exit(0);
			}
			
		}
		
	}
	
	static void adicionarContato(Scanner scanner, Agenda2 agenda) {
		
		try {
			
		System.out.println("Criando um contato, entre com as informa��es");
		String nomeContato = leInformacao(scanner, "Informe o nome do contato :");
		String nomeTelefone = leInformacao(scanner, "Informe o telefone do contato :");
		String email = leInformacao(scanner, "Informe o e-mail do contato :");
		
		Contato2 contato = new Contato2();
		contato.setNome(nomeContato);
		contato.setTelefone(nomeTelefone);
		contato.setEmail(email);
		
		System.out.println("Contato a ser criado :");
		System.out.println(contato);
		
		agenda.adicionarContato(contato);
			
		} catch (AgendaCheiaException e) {
			System.out.println(e.getMessage());
			
			System.out.println("Contatos da agenda");
			System.out.println(agenda);
		}
		
	}
	
	static void verificaConsulta(Scanner scanner, Agenda2 agenda) {
		String nomeContato = leInformacao(scanner, "Entre com o nome do contato a ser pesquisado : ");
		try {
			if(agenda.consultaContato(nomeContato) >= 0) {
				System.out.println("Contato existe ");
			}
			
		} catch (ContatoNaoExisteException e) {
			System.out.println(e.getMessage());
			
		}
		
	}
	
	static String leInformacao(Scanner scanner, String msg) {
		System.out.println(msg);
		String entrada = scanner.nextLine();
		return entrada;
		
	}
	
	

	static int obterOpcaoMenu(Scanner scanner) {
		
		boolean entradaValida = false;
		int opcao = 0;
		
		while(!entradaValida) {
			
			System.out.println("1 : Consultar contato");
			System.out.println("2 : Adicionar Contato");
			System.out.println("3 : Sair");
			System.out.println("Digite a op��o desejada : ");
			
			try {
				String entrada = scanner.nextLine();
				opcao = Integer.parseInt(entrada);
				if (opcao == 1 || opcao == 2 || opcao == 3) {
					entradaValida = true;
				} else {
					throw new Exception("Entrada inv�lida");
				}
				
			}catch(Exception e) {
				
				System.out.println("Entrada inv�lida, digite novamente\n");
			}
		}
		
		return opcao;
	}
}
