package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2026-01-25");
		LocalDateTime d05 = LocalDateTime.parse("2026-01-24T23:50:50");
		Instant d06 = Instant.parse("2026-01-23T01:30:50Z");

		//converter data/hora global em data local passando o fuso da máquina
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		//converter data/hora global em data local passando o nome do fuso
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		//converter data/hora global em data/hora local passando o fuso da máquina
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		//converter data/hora global em data/hora local passando o nome do fuso
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		
		
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);
		System.out.println("r4 = " + r4);
		System.out.println("----------------------------------");
		System.out.println("d04 dia = " + d04.getDayOfMonth());
		System.out.println("d04 mês = " + d04.getMonthValue());
		System.out.println("d04 ano = " + d04.getYear());
		System.out.println("----------------------------------");		
		System.out.println("d05 hora = " + d05.getHour());
		System.out.println("d05 minutos = " + d05.getMinute());

	}
	

}