import java.util.Locale;
import java.util.Scanner;

public class MainExercicio5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codPeca1, codPeca2;
		double precoPeca1, precoPeca2;
		int qtdPeca1, qtdPeca2;
		
		
		System.out.println("Código da Peça1: ");
		codPeca1 = sc.nextInt();
		System.out.println("Qtd de Peças: ");
		qtdPeca1 = sc.nextInt();
		System.out.println("Preço da Peça1: ");
		precoPeca1 = sc.nextDouble();
		
		System.out.println("Código da Peça2: ");
		codPeca2 = sc.nextInt();
		System.out.println("Qtd de Peças: ");
		qtdPeca2 = sc.nextInt();
		System.out.println("Preço da Peça2: ");
		precoPeca2 = sc.nextDouble();
		
		double totalAPagar = (qtdPeca1 * precoPeca1) + (qtdPeca2 * precoPeca2);
		
		System.out.println();
		System.out.printf("VALOR A PAGAR: R$ %.2f", totalAPagar);
		
		sc.close();
		
	}

}
