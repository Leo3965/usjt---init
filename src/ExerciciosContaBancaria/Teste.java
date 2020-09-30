package ExerciciosContaBancaria;

import java.util.Scanner;

class Teste {

	public static void main(String[] args) {
		
		System.out.println("*** Teste ContaBanc�ria ***");
		
		ContaBancaria conta = new ContaBancaria();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o nome do cliente: ");
		conta.setNomeCliente(sc.nextLine());
		System.out.println("Informe o num�ro da conta do cliente: ");
		conta.setNumConta(sc.nextLine());
		System.out.println("Informe o valor a ser depositado: ");
		conta.depositar(sc.nextDouble());
		System.out.println("Informe o valor a ser sacado: ");
		realizarSaque(conta, sc.nextDouble());
		
		System.out.println(conta);
		sc.close();
		
	}
	
	private static void realizarSaque(ContaBancaria conta, double valor) {
		if(conta.sacar(valor)) {
			System.out.println("Saque efetuado com sucesso, novo saldo: " + conta.getSaldo());
		} else {
			System.out.println("Saldo insuficiente para saque de " + valor + "; saldo dispon�vel: " + conta.getSaldo());
		}
	}
}