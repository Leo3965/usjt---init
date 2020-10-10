package exercicios.thread.semaforo;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o tempo do faról verde : \n");
		int x = scan.nextInt();
		System.out.print("Informe o tempo do faról vermelho : ");
		int y = scan.nextInt();

		Semaforo semVerd = new Semaforo("Verde", x);
		Semaforo semAma = new Semaforo("Amarelo", 1500);
		Semaforo semVer = new Semaforo("Vermelho", y);
		
		scan.close();
		
		
	}

}
