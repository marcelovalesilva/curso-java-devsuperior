package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Informe os dados do Aluno: ");
		System.out.print("Nome: ");
		student.name = sc.nextLine();
		System.out.print("Nota1: ");
		student.nota1 = sc.nextDouble();
		System.out.print("Nota2: ");
		student.nota2 = sc.nextDouble();
		System.out.print("Nota3: ");
		student.nota3 = sc.nextDouble();
		
		if(student.calculaMedia() >= 60.00) {
			System.out.printf("FINAL GRADE = %.2f%n", student.calculaMedia());
			System.out.println("PASS");
		}
		else if(student.calculaMedia() < 60.00) {
			System.out.printf("FINAL GRADE = %.2f%n", student.calculaMedia());
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", 60.00 - student.calculaMedia());
		}
		
		
		
		sc.close();
		

	}

}
