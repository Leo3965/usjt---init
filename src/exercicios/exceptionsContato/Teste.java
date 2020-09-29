package exercicios.exceptionsContato;

import java.util.Scanner;

class Teste {

	public static void main(String[] args) {
		
		boolean verificador = true;
		
		Scanner sc = new Scanner(System.in);
		int j;
		
		while(verificador){
			
			System.out.println("Você deseja acessar a agenda ou adicionar um contato ?");
			System.out.println("Digite 1 para agenda ou 2 para adicionar um contato :");
			
			if(sc.nextInt() == 1) {
				Agenda.consultaContatos();
				System.out.println("Deseja voltar ao menu ? (1) para sim, (2) para não :");
				//verificador = (sc.nextInt() == 1) ? (true) : (false);
				j = sc.nextInt();
				
				if(j == 1) {
					verificador = true;
				} 
				else {
					
					verificador = false;
				}
				
			}
			Agenda.adicionarContato();
			System.out.println("Deseja voltar ao menu ? (1) para sim, (2) para não :");
			verificador = (sc.nextInt() == 1) ? (true) : (false);
			
			
		} 
		sc.close();
	}
	
}
