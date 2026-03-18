package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		//formatação de data e data/hora
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		//setar o formato de data para usar o time-zone UTC (GMT), ou seja, não pega o fuso da máquina local
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		//duas formas de pegar a data/hora atual
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		
		//data/hora de origem que o java armazena em milisegundos: 01/01/1970 00:00:00
		Date x3 = new Date(0L);
		
		//calcularr uma data a 5 horas a mais em relação a data de origem: 01/01/1970 00:00:00
		Date x4 = new Date(1000L * 60L * 60L * 5L);
		
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 15:42:07");
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println("-----IMPRESSÃO DE DATA/HORA NO FORMATO PADRÃO DA CLASSE DATE-----");
		System.out.println("x1: " + x1);
		System.out.println("x2: " + x2);
		System.out.println("x3: " + x3);
		System.out.println("x4: " + x4);
		System.out.println("y1: " + y1);
		System.out.println("y2: " + y2);
		System.out.println("y3: " + y3);
		System.out.println("-----IMPRESSÃO DE DATA/HORA NO FORMATO PERSONALIZADO USANDO O TIME ZONE DA MAQUINA LOCAL-----");
		System.out.println("x1: " + sdf2.format(x1));
		System.out.println("x2: " + sdf2.format(x2));
		System.out.println("x3: " + sdf2.format(x3));
		System.out.println("x4: " + sdf2.format(x4));
		System.out.println("y1: " + sdf1.format(y1));
		System.out.println("y2: " + sdf2.format(y2));
		System.out.println("y3: " + sdf2.format(y3));
		System.out.println("-----IMPRESSÃO DE DATA/HORA NO FORMATO PERSONALIZADO USANDO O TIME ZONE UTC(GMT)-----");
		System.out.println("x1: " + sdf3.format(x1));
		System.out.println("x2: " + sdf3.format(x2));
		System.out.println("x3: " + sdf3.format(x3));
		System.out.println("x4: " + sdf3.format(x4));
		System.out.println("y1: " + sdf3.format(y1));
		System.out.println("y2: " + sdf3.format(y2));
		System.out.println("y3: " + sdf3.format(y3));
		
	}
	

}