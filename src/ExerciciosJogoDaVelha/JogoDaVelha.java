package ExerciciosJogoDaVelha;

import java.util.Scanner;

class JogoDaVelha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome do primeiro jogador :");
		String primeiroJ = sc.next();
		System.out.println("Digite o nome do segundo jogador :");
		String segundoJ = sc.next();
		
		char[][] jogoDaVelha = new char[3][3];
		
		System.out.println("Jogador 1 (X): " + primeiroJ);
		System.out.println("Jogador 2 (O): " + segundoJ);
		
		boolean ganhou = false;
		int jogada = 1;
		char sinal;
		int linha = 0, coluna = 0;
		
		while(!ganhou) {
			
			if(jogada % 2 == 1) { //jogador1
				System.out.println("Vez do jogador " + primeiroJ +". Escolha linha e coluna (1-3).");
				sinal = 'X';
				
			} else {
				System.out.println("Vez do jogador "+ segundoJ +". Escolha linha e coluna (1-3).");
				sinal = 'O';
			}
			
			//Continua a l�gica
			
			boolean linhaValida = false;
			while(!linhaValida) {
				System.out.println("Entre com a linha (1, 2. 3) : ");
				linha = sc.nextInt();
				if(linha >= 1 && linha <= 3) {
					linhaValida = true;
				} else {
					System.out.println("Entrada inv�lida, tente novamente");
				}
			}
			
			boolean colunaValida = false;
			
			while(!colunaValida) {
				System.out.println("Entre com a coluna (1, 2. 3) : ");
				coluna = sc.nextInt();
				if(coluna >= 1 && coluna <= 3) {
					colunaValida = true;
				} else {
					System.out.println("Entrada inv�lida, tente novamente");
				}
			}
			linha--;
			coluna--;
			if(jogoDaVelha[linha][coluna] == 'X' || jogoDaVelha[linha][coluna] == 'O') {
				System.out.println("Posi��o usada, tente novamente");
			}else {// jogadavalida
				jogoDaVelha[linha][coluna] = sinal;
				jogada++;
			}
			//Imprimir o tabuleiro
			for(int i=0; i < jogoDaVelha.length; i++) {
				for(int j = 0; j <jogoDaVelha.length; j++) {
					System.out.print(jogoDaVelha[i][j] + " | ");
				}
				System.out.println();
			}
			//Verificar se existe um ganhador
			if((jogoDaVelha[0][0] == 'X' && jogoDaVelha[0][1] == 'X' && jogoDaVelha[0][2] == 'X') || //linha 1
					(jogoDaVelha[1][0] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[1][2] == 'X') ||//linha 2
					(jogoDaVelha[2][0] == 'X' && jogoDaVelha[2][1] == 'X' && jogoDaVelha[2][2] == 'X') ||//linha 3
					(jogoDaVelha[0][0] == 'X' && jogoDaVelha[1][0] == 'X' && jogoDaVelha[2][0] == 'X') ||//coluna1
					(jogoDaVelha[0][1] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[2][1] == 'X') ||//coluna2
					(jogoDaVelha[0][2] == 'X' && jogoDaVelha[1][2] == 'X' && jogoDaVelha[2][2] == 'X') ||//coluna3
					(jogoDaVelha[0][0] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[2][2] == 'X') ||//diagonal principal
					(jogoDaVelha[0][2] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[2][0] == 'X')//diagonal secund�ria
					) {
				ganhou = true;
				System.out.println("Parab�ns, " + primeiroJ + " ganhou!");
				
			}else if((jogoDaVelha[0][0] == 'O' && jogoDaVelha[0][1] == 'O' && jogoDaVelha[0][2] == 'O') || //linha 1
					(jogoDaVelha[1][0] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[1][2] == 'O') ||//linha 2
					(jogoDaVelha[2][0] == 'O' && jogoDaVelha[2][1] == 'O' && jogoDaVelha[2][2] == 'O') ||//linha 3
					(jogoDaVelha[0][0] == 'O' && jogoDaVelha[1][0] == 'O' && jogoDaVelha[2][0] == 'O') ||//coluna1
					(jogoDaVelha[0][1] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[2][1] == 'O') ||//coluna2
					(jogoDaVelha[0][2] == 'O' && jogoDaVelha[1][2] == 'O' && jogoDaVelha[2][2] == 'O') ||//coluna3
					(jogoDaVelha[0][0] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[2][2] == 'O') ||//diagonal principal
					(jogoDaVelha[0][2] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[2][0] == 'O')//diagonal secund�ria
					) {
				ganhou = true;
				System.out.println("Parab�ns, " + segundoJ + " ganhou!");
			}else if(jogada > 9) {
				ganhou = true;
				System.out.println("Ningu�m ganhou essa partida");
				
			}
			
		}
		
		sc.close();
	}

}