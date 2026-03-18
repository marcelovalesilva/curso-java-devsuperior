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
		Pessoa[] pessoas = new Pessoa[n];
		
		for(int i=0; i<n; i++) {
			System.out.printf("Altura da %dª pessoa: ", (i+1));
			double altura = sc.nextDouble();
			System.out.printf("Genero da %dª pessoa: ", (i+1));
			sc.nextLine();
			char genero = sc.nextLine().charAt(0);
			
			pessoas[i] = new Pessoa(altura, genero);
		}

		double menorAltura = pessoas[0].getAltura();
		double maiorAltura = pessoas[0].getAltura();
		
		for(int i=1; i<pessoas.length; i++) {
			if(pessoas[i].getAltura() < menorAltura) {
				menorAltura = pessoas[i].getAltura();
			}
			
			if(pessoas[i].getAltura() > maiorAltura) {
				maiorAltura = pessoas[i].getAltura();
			}
		}
		
		double somaAlturaMulheres = 0.0;
		int qtdHomens = 0;
		int qtdMulheres = 0;
		for(int i=0; i<pessoas.length; i++) {
			if(pessoas[i].getGenero() == 'F') {
				somaAlturaMulheres += pessoas[i].getAltura();
				qtdMulheres++;
			}
			else if(pessoas[i].getGenero() == 'M') {
				qtdHomens++;
			}
		}
		
		double mediaAlturaMulheres = somaAlturaMulheres / qtdMulheres;
		
		System.out.printf("Menor altura = %.2f\n", menorAltura);
		System.out.printf("Maior altura = %.2f\n", maiorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f\n", mediaAlturaMulheres);
		System.out.printf("Numero de homens = %d", qtdHomens);
		
		sc.close();

	}

}
