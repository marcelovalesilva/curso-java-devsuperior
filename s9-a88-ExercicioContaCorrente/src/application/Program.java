package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Conta conta = null;
		
		System.out.print("Enter account number: ");
		int numConta = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String nomeTitular = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char opcao = sc.nextLine().charAt(0);
		
		double valueTemp = 0.0;
		
		if(opcao == 'y') {
			System.out.print("Enter initial deposit value: ");
			valueTemp = sc.nextDouble();
			conta = new Conta(numConta, nomeTitular, valueTemp);
		}
		else if(opcao == 'n') {
			conta = new Conta(numConta, nomeTitular);
		}
		else {
			System.out.println("Opção inválida");
		}

		System.out.println();
		System.out.println("Account data:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		valueTemp = sc.nextDouble();
		conta.deposito(valueTemp);

		System.out.println();
		System.out.println("Updated account data:");
		System.out.println(conta);

		System.out.println();
		System.out.print("Enter a withdraw value: ");
		valueTemp = sc.nextDouble();
		conta.saque(valueTemp);
		
		System.out.println();
		System.out.println("Updated account data:");
		System.out.println(conta);
		
		sc.close();
	}
}