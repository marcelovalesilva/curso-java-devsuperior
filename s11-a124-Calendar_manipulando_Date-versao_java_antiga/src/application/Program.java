package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2026-01-29T15:42:07Z"));
		
		System.out.println(sdf.format(d));
		
		//Somar 4 horas à data/hora cal e depois passar o valor de cal para d
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		
		//Pegar somente os minutos da data/hora
		int minutes = cal.get(Calendar.MINUTE);
		
		//Pegar somente os mês da data/hora (número do mês começa com zero no Calendar
		int month = 1 + cal.get(Calendar.MONTH);
				
		System.out.println("Data d: " + sdf.format(d));
		System.out.println("Data Cal: " + sdf.format(cal.getTime()));
		System.out.println("Data d acrescida de 4 horas: " + sdf.format(cal.getTime()));
		System.out.println("Minutes de cal: " + minutes);
		System.out.println("Month de cal: " + month);
	}
	

}