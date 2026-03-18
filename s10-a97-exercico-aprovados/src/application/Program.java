package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serao digitadas? ");
		int n = sc.nextInt();
		Aluno[] aluno = new Aluno[n];
		
		for(int i=0; i<n; i++) {
			sc.nextLine();
			System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + "º aluno:");
			String nome = sc.nextLine();
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			aluno[i] = new Aluno(nome, nota1, nota2);
		}

		System.out.println("Alunos aprovados:");
		for(int i=0; i<aluno.length; i++) {
			if(aluno[i].calculaMedia() >= 6.0) {
				System.out.println(aluno[i].getNome());
			}
		}
		
		sc.close();

	}

}
