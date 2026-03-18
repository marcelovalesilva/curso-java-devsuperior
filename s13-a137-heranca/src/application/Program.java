package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.BusinessAccount;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account acc1 = new Account(1526, "CM DISTRIBUIDORA LTDA", 50000.00);
		//resumoConta(acc1);
		System.out.println(acc1);
		
		acc1.deposit(5600.00);
		System.out.println();
		System.out.println("Resumo da Conta após depósito de 5600.00:");
		System.out.println(acc1);
		
		acc1.withdraw(1000.00);
		System.out.println();
		System.out.println("Resumo da Conta após saque de 1000.00:");
		System.out.println(acc1);
		
		BusinessAccount acc2 = new BusinessAccount(5892, "Alex Green", 5.00, 2000.00);
		
		System.out.println("----------------------------------------");
		System.out.println(acc2);
		
		acc2.deposit(50.00);
		System.out.println();
		System.out.println("Resumo da Conta após depósito de 50.00:");
		System.out.println(acc2);
		
		acc2.withdraw(5.00);
		System.out.println();
		System.out.println("Resumo da Conta após saque de 5.00:");
		System.out.println(acc2);
		
		System.out.print("\nInforme o valor do empréstimo: ");
		double vlrEmprestimo = sc.nextDouble();
		
		if(acc2.getBalance() - 10.0 >= 0.0) {
			acc2.loan(vlrEmprestimo);
		}
		else{
			System.out.println("Saque não realizado, sem saldo suficiente para desconto da taxa!");
		};
		
		System.out.println();
		System.out.printf("Resumo da Conta após empréstimo de %.2f\n", vlrEmprestimo);
		System.out.println(acc2);
		
		sc.close();
		
	}

}
