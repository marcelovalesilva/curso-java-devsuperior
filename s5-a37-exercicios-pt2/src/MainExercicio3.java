import java.util.Scanner;

public class MainExercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		System.out.println("Digite um numero inteiro: ");
		a = sc.nextInt();
		System.out.println("Digite um numero inteiro: ");
		b = sc.nextInt();
		
		if(a % b == 0 || b % a == 0) {
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("Nao sao Multiplos");
		}
		
		/*
		if(a >= b) {
			if(a % b == 0) {
				System.out.println("Sao Multiplos");
			}
			else {
				System.out.println("Nao sao Multiplos");
			}
			 
		}
		else {
			if(b % a == 0) {
				System.out.println("Sao Multiplos");
			}
			else {
				System.out.println("Nao sao Multiplos");
			}
		}
		*/
			
		sc.close();
		
	}

}
