import java.util.Scanner;

public class MainExercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int countIn = 0, countOut = 0;
		
		for(int i=0; i<n; i++) {
			int x = sc.nextInt();
			if(x >= 10 && x <= 20) {
				countIn++;
			}
			else {
				countOut++;
			}
		}
		
		System.out.println();
		System.out.println(countIn + " In");
		System.out.println(countOut + " Out");
		
			
		sc.close();
		
	}

}
