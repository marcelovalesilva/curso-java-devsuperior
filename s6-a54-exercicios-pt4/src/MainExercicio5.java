import java.util.Locale;
import java.util.Scanner;

public class MainExercicio5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		
		if(n == 0) {
			n = 1;
		}
		
		for(int i=n; i>1; i--) {
			
				n = n * (i-1);
			
		}
		
		System.out.println(n);
			
		sc.close();
		
	}

}
