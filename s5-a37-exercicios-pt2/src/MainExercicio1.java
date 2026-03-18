import java.util.Scanner;

public class MainExercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Digite um numero inteiro: ");
		num = sc.nextInt();
		
		if(num < 0) {
			System.out.println("NEGATIVO"); 
		}
		else {
			System.out.println("NAO NEGATIVO");
		}
			
		sc.close();
		
	}

}
