package application;

//import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int codAluno = 0;
		
		Set<Aluno> listaA = new TreeSet<Aluno>();
		Set<Aluno> listaB = new TreeSet<Aluno>();
		Set<Aluno> listaC = new TreeSet<Aluno>();
		
		Set<Aluno> total = new TreeSet<Aluno>();
		
		System.out.print("How many students for course A? ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			System.out.printf("Código do aluno %d: ", i);
			codAluno = sc.nextInt();
			listaA.add(new Aluno(codAluno));
			total.add(new Aluno(codAluno));
		}
		
		System.out.print("How many students for course B? ");
		n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			System.out.printf("Código do aluno %d: ", i);
			codAluno = sc.nextInt();
			listaB.add(new Aluno(codAluno));
			total.add(new Aluno(codAluno));
		}
		
		System.out.print("How many students for course C? ");
		n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			System.out.printf("Código do aluno %d: ", i);
			codAluno = sc.nextInt();
			listaC.add(new Aluno(codAluno));
			total.add(new Aluno(codAluno));
		}
		
		System.out.println("Total students: " + total.size());
		

		
		
		sc.close();
		
	}

}
