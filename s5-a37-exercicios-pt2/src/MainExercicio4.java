import java.util.Scanner;

public class MainExercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int horaInicio;
		int horaFim;
		int totalHorasJogo = 0;
		
		System.out.println("Digite a hora de inicio do jogo: ");
		horaInicio = sc.nextInt();
		System.out.println("Digite a hora do final do jogo: ");
		horaFim = sc.nextInt();
		
		if(horaInicio == horaFim) {
			totalHorasJogo = 24;
		}
		else if (horaInicio > horaFim){
			totalHorasJogo = (24 - horaInicio) + horaFim;
		}
		else {
			totalHorasJogo = horaFim - horaInicio;
		}
		
		System.out.printf("O JOGO DUROU %d HORA(S)", totalHorasJogo);
		
		sc.close();
		
	}

}
