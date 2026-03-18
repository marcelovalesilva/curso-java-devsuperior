package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2026-01-25");
		LocalDateTime d05 = LocalDateTime.parse("2026-01-24T23:50:50");
		Instant d06 = Instant.parse("2026-01-23T01:30:50Z");

		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		//usando um dos formatos padrões da DateTimeFormatter
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		//usando um dos formatos padrões para data global (com fuso)
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
				
		//forma 1 de exibir a data segundo um padrão
		System.out.println("d04 = " + d04.format(fmt1));
		//forma 2 de exibir a data segundo um padrão
		System.out.println("d04 = " + fmt1.format(d04));
		//forma 3 de exibir a data segundo um padrão
		System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		//exibir data/hora
		System.out.println("d05 = " + d05.format(fmt1));
		System.out.println("d05 = " + d05.format(fmt2));
		System.out.println("d05 = " + d05.format(fmt4));
		
		//exibir data/hora que tem fuso (instant)
		System.out.println("d06 = " + fmt3.format(d06));
		System.out.println("d06 = " + fmt5.format(d06));
	}

}