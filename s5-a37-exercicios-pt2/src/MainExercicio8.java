import java.util.Locale;
import java.util.Scanner;

public class MainExercicio8 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario;
		double totalImposto = 0.00;
		
		System.out.println("Digite seu salario: ");
		salario = sc.nextDouble();
		
		if(salario > 2000.00 && salario <= 3000.00) {
			totalImposto = 0.08 * 1000; 
		}
		else if(salario > 3000.00 && salario <= 4500.00) {
			totalImposto = (0.08 * 1000) + ((salario - 3000.00) * 0.18); 
		}
		else if(salario > 4500.00) {
			totalImposto = (0.08 * 1000) + (1500.00 * 0.18) + ((salario - 4500.00) * 0.28);
		}
		
		if(totalImposto <= 0.0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("Total do Imposto = R$ %.2f", totalImposto);
		}
		
		sc.close();
		
	}

}
