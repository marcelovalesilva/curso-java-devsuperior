import java.util.Locale;
import java.util.Scanner;

public class MainExercicio2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double area = 0.0;
		double pi = 3.14159;
		
		System.out.println("Informe o raio de um círculo: ");
		double raio = sc.nextDouble();
		area = pi * Math.pow(raio, 2);
		
		System.out.printf("A= %.4f", area);
		
		sc.close();
		
	}

}
