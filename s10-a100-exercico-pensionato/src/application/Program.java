package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Estudante;
import entities.Room;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Room[] rooms = new Room[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.printf("Rent #%d\n", i+1);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int numRoom = sc.nextInt();
			rooms[numRoom] = new Room(numRoom, new Estudante(name, email));
		}

		System.out.println("\nBusy rooms:");
		for(int i=0; i<rooms.length; i++) {
			if(rooms[i] != null) {
				System.out.println(rooms[i].getNumRoom() 
						+ ": " 
						+ rooms[i].getEstudante().getNome()
						+ ", "
						+ rooms[i].getEstudante().getEmail());
			}
		}
		
		sc.close();

	}

}
