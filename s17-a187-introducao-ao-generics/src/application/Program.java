package application;

import java.util.Scanner;

import services.PrintService;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		PrintService<String> ps = new PrintService<>();
				
		System.out.print("Quantos itens? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			String name = sc.next();
			ps.addValue(name);
		}
		
		ps.addValue("Juana");
		
		ps.print();
		System.out.println("First: " + ps.first());
		
		sc.close();

	}

}
