import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//String x;
		//leitura de string (texto)
		//x = sc.next();
		//System.out.println("Você digitou: " + x);
		
		//int x;
		//leitura de inteiro
		//x = sc.nextInt();
		//System.out.println("Você digitou: " + x);
	
		//double x;
		//leitura de double
		//x = sc.nextDouble();
		//System.out.println("Você digitou: " + x);
		//System.out.printf("Você digitou: %.2f%n", x);
		
		//char x;
		//leitura de caractere
		//x = sc.next().charAt(1);
		//System.out.println("Você digitou: " + x);
		
		String x;
		int y;
		double z;
		//leitura de dados na mesma linha separados por espaço
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		sc.close();
		
	}

}
