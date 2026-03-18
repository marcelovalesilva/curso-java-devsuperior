package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas vai digitar? ");
		int n = sc.nextInt();
		String[] nome = new String[n];
		int[] idade = new int[n];
		
		for(int i=0; i<n; i++) {
			sc.nextLine();
			System.out.println("Dados da " + (i+1) + "ª pessoa: ");
			System.out.print("Nome: ");
			nome[i] = sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
		}
		
		int posicaoMaisVelha = 0;
		int idadeMaisVelha = idade[0];
		for(int i=1; i<idade.length; i++) {
			if(idade[i] > idadeMaisVelha) {
				idadeMaisVelha = idade[i];
				posicaoMaisVelha = i;
			}
		}

		System.out.printf("PESSOA MAIS VELHA: %s", nome[posicaoMaisVelha]);
		
		sc.close();

	}

}
