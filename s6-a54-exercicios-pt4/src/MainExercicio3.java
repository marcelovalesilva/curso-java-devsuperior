import java.util.Locale;
import java.util.Scanner;

public class MainExercicio3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			double vlr1 = sc.nextDouble();
			double vlr2 = sc.nextDouble();
			double vlr3 = sc.nextDouble();
			double media = ((vlr1 * 2) + (vlr2 * 3) + (vlr3 * 5)) / 10;
			System.out.println();
			System.out.printf("%.1f%n", media);
		}

			
		sc.close();
		
	}

}
