package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		Pessoa[] pessoa = new Pessoa[n];
		
		for(int i=0; i<n; i++) {
			sc.nextLine();
			System.out.println("Dados da " + (i+1) + "ª pessoa:");
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			pessoa[i] = new Pessoa(nome, idade, altura);
		}

		double somaAltura = 0.0;
		int countIdadeMenor16 = 0;
		
		for(int i=0; i<pessoa.length; i++) {
			somaAltura += pessoa[i].getAltura();
			
			if(pessoa[i].getIdade() < 16) {
				countIdadeMenor16++;
			}
		}
		
		double mediaAltura = somaAltura / pessoa.length;
		double percentualIdadeMenor16 = (countIdadeMenor16 * 100.0) / pessoa.length;	
		
		System.out.println();
		System.out.printf("Altura média: %.2f\n", mediaAltura);
		System.out.printf("Pessoas com menos de 16 anos: %.1f\n", percentualIdadeMenor16);
		for(int i=0; i<pessoa.length; i++) {
			if(pessoa[i].getIdade() < 16) {
				System.out.println(pessoa[i].getNome());
			}
		}
		
		sc.close();

	}

}
