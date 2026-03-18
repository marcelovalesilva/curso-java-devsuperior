import java.util.Scanner;

public class MainExercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, soma = 0;
		
		System.out.println("Informe 2 numeros inteiros: ");
		a = sc.nextInt();
		b = sc.nextInt();
		soma = a + b;
		
		System.out.println("SOMA = " + soma);
		
		sc.close();
		
	}

}
