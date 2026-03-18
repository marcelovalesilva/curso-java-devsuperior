package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		float[] vect = new float[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextFloat();
		}

		float maiorNumero = vect[0];
		int posicaoMaiorNumero = 0;
		
		for(int i=1; i<vect.length; i++) {
			if(vect[i] > maiorNumero) {
				maiorNumero = vect[i];
				posicaoMaiorNumero = i;
			}
		}
		
		System.out.printf("\nMAIOR VALOR = %.1f", maiorNumero);
		System.out.print("\nPOSICAO DO MAIOR VALOR = " + posicaoMaiorNumero);
		
		sc.close();

	}

}
