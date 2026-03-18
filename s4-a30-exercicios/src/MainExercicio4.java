import java.util.Locale;
import java.util.Scanner;

public class MainExercicio4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numFuncionario;
		int horasTrabalhadas;
		double valorHora;
		double salario = 0.0;
		
		System.out.println("Digite o numero do funcionario: ");
		numFuncionario = sc.nextInt();
		System.out.println("Qtd de horas trabalhadas: ");
		horasTrabalhadas = sc.nextInt();
		System.out.println("Valor por hora: ");
		valorHora = sc.nextDouble();
		
		salario = horasTrabalhadas * valorHora;
	
		System.out.println("NUMBER = " + numFuncionario);
		System.out.printf("SALARY = U$ %.2f", salario);
		
		sc.close();
		
	}

}
