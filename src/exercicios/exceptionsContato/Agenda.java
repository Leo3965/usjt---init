package exercicios.exceptionsContato;

import java.util.Scanner;

class Agenda {
	
	
	static Contato[] contatos = new Contato[10];


	static  void adicionarContato() {
		
		boolean ver = true;
		int contador = 0;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Deseja adicionar o " + (contador+1) + "º contato ? (1) para sim, (2) para não: ");
			int verificador = scan.nextInt();
			if(verificador == 1) {
				System.out.println("Digite o nome :");
				String nome = scan.next();
				System.out.println("Digite o telefone :");
				String telefone = scan.next();
				Contato contato = new Contato(nome, telefone);
				contato.contaIdentificador();
				contatos[contador] = contato;
				System.out.println("Contato adicionado com sucesso");
			}
			else {
				System.out.println("Agenda fechada");
				ver = false;
			}
			contador += + 1;
		}while(ver);
		scan.close();
		
		
	}
	
	static void consultaContatos() {
		System.out.println("----------------------------------");
		System.out.println("    Olá seja bem vindo a agenda   ");
		System.out.println("  Aqui está a lista de contatos:  ");
		System.out.println();
		for(Contato cont : contatos) {
			System.out.println(cont);
			
		}
		
	}
	
}
