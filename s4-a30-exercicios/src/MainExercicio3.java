import java.util.Locale;
import java.util.Scanner;

public class MainExercicio3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int a, b, c, d;
		
		System.out.println("Informa 4 numeros inteiros: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		int diferenca = (a * b) - (c * d);
		
		System.out.printf("DIFERENCA = %d", diferenca);
		
		sc.close();
		
	}

}
