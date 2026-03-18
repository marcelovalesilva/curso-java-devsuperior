import java.util.Scanner;

public class MainExercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num, countAlcool = 0, countGasolina = 0, countDiesel = 0;
		
		System.out.println("Escolha um produto entre 1-3, 4 para encerrar!");
		num = sc.nextInt();
		
		while(num != 4) {
			switch (num) {
			case 1: {
				countAlcool++;
				break;
			}
			case 2: {
				countGasolina++;
				break;
			}
			case 3: {
				countDiesel++;
				break;
			}
			}
			System.out.println("Escolha um produto entre 1-3, 4 para encerrar!");
			num = sc.nextInt();
			
		}
		
		System.out.println();
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + countAlcool);
		System.out.println("Gasolina: " + countGasolina);
		System.out.println("Diesel: " + countDiesel);
			
		sc.close();
		
	}

}
