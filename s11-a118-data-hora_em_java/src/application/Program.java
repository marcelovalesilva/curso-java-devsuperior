package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
		//formato de data e data/hora personalizado
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		//instanciar data, data/hora e data/hora global a partir da data/hora do sistema
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		//instanciar data, data/hora passando uma string
		LocalDate d04 = LocalDate.parse("2026-01-23");
		LocalDateTime d05 = LocalDateTime.parse("2026-01-23T23:50:50");
		
		//instanciar data/hora global passando uma string
		Instant d06 = Instant.parse("2026-01-23T23:50:50Z");
		//instanciar data/hora global especificando o fuso passando uma string
		Instant d07 = Instant.parse("2026-01-23T23:50:50-03:00");
		
		//utilizando o formato de dada e data/hora personalizado
		LocalDate d08 = LocalDate.parse("23/01/2026", fmt1);
		//LocalDate d08 = LocalDate.parse("23/01/2026", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		LocalDateTime d09 = LocalDateTime.parse("23/01/2026 01:30", fmt2);
		
		//instanciar data e data/hora passando dia, mes e ano isoladamente
		LocalDate d10 = LocalDate.of(2026, 1, 23);
		LocalDateTime d11 = LocalDateTime.of(2026, 1, 23, 23, 50);
		
		System.out.println("d01 = " + d01.toString());
		System.out.println("d02 = " + d02.toString());
		System.out.println("d03 = " + d03.toString());
		System.out.println("d04 = " + d04.toString());
		System.out.println("d05 = " + d05.toString());
		System.out.println("d06 = " + d06.toString());
		System.out.println("d07 = " + d07.toString());
		System.out.println("d08 = " + d08.toString());
		System.out.println("d09 = " + d09.toString());
		System.out.println("d10 = " + d10.toString());
		System.out.println("d11 = " + d11.toString());

	}

}