import java.util.Locale;
import java.util.Scanner;

public class MainExercicio6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double pi = 3.14159;
		double a, b, c;
		double areaTriangulo;
		double areaCirculo;
		double areaTrapezio;
		double areaQuadrado;
		double areaRetangulo;
		
		System.out.print("Valor de a: ");
		a = sc.nextDouble();
		System.out.print("Valor de b: ");
		b = sc.nextDouble();
		System.out.print("Valor de c: ");
		c = sc.nextDouble();
		
		areaTriangulo = (a * c)/2;
		areaCirculo = pi * Math.pow(c, 2);
		areaTrapezio = (a + b) * c / 2;
		areaQuadrado = Math.pow(b, 2);
		areaRetangulo = a * b;
		
		System.out.println();
		System.out.printf("TRIANGULO %.3f%n", areaTriangulo);
		System.out.printf("CIRCULO %.3f%n", areaCirculo);
		System.out.printf("TRAPEZIO %.3f%n", areaTrapezio);
		System.out.printf("QUADRADO %.3f%n", areaQuadrado);
		System.out.printf("RETANGULO %.3f%n", areaRetangulo);
		
		sc.close();
		
	}

}
