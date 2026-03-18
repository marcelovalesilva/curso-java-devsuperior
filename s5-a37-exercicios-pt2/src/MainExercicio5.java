import java.util.Locale;
import java.util.Scanner;

public class MainExercicio5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigoItem;
		int qtdItem;
		double totalContaPagar = 0.0;
		
		System.out.println("Digite o código do item: ");
		codigoItem = sc.nextInt();
		System.out.println("Digite a quantidade do item: ");
		qtdItem = sc.nextInt();
		
		if(codigoItem == 1) {
			totalContaPagar = qtdItem * 4.00;
		}
		else if(codigoItem == 2) {
			totalContaPagar = qtdItem * 4.50;
		}
		else if(codigoItem == 3) {
			totalContaPagar = qtdItem * 5.0;
		}
		else if(codigoItem == 4) {
			totalContaPagar = qtdItem * 2.0;
		}
		else if(codigoItem == 5) {
			totalContaPagar = qtdItem * 1.50;
		}
		
		System.out.printf("Total: R$ %.2f%n", totalContaPagar);
		
		sc.close();
		
	}

}
