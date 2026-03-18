package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai o vetor? ");
		int n = sc.nextInt();
		int[] vetor = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
		}
		
		double soma = 0.0;
		int countPar = 0;
		for(int i=0; i<vetor.length; i++) {
			if(vetor[i] % 2 == 0) {
				soma += vetor[i];
				countPar++;
			}
		}

		if(countPar != 0) {
			double media = soma / countPar;
			System.out.printf("MEDIA DOS PARES = %.1f", media);
		}
		else {
			System.out.println("NENHUM NUMERO PAR");
		}
		
		sc.close();

	}

}
