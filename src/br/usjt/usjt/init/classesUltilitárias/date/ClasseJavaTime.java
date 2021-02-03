package usjt.init.classesUltilitárias.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Set;

public class ClasseJavaTime {

	public static void main(String[] args) {
		
		// Essa biblioteca só funciona a partir do Java8
		
		// Fomato iso dd/mm/yyyy
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		System.out.println(LocalDate.parse("2019-12-01"));
		
		System.out.println(hoje.plusDays(30));
		System.out.println(hoje.getDayOfWeek());
		System.out.println(hoje.getDayOfYear());
		System.out.println(hoje.isLeapYear()); //ano bissexto
		System.out.println(hoje.minus(1, ChronoUnit.MONTHS));
		
		System.out.println("\n \n");
		
		LocalTime hora = LocalTime.now();
		System.out.println(hora);
		System.out.println(hora.parse("20:18"));
		System.out.println(hora.of(20, 30));
		System.out.println(hora.plusMinutes(60));
		System.out.println(hora.minus(20, ChronoUnit.MINUTES));
		System.out.println(hora.getHour());

		System.out.println("\n \n");

		LocalDateTime hojeCompleto = LocalDateTime.now();
		System.out.println(hojeCompleto);
		System.out.println(hojeCompleto.parse("2022-08-12T06:30:26"));
		System.out.println(hojeCompleto.of(2019, 2, 12, 6, 30, 26));
		
		System.out.println("\n \n");

		ZoneId fuso = ZoneId.systemDefault();
		System.out.println(fuso);
		
		Set<String> fusos = ZoneId.getAvailableZoneIds();
//		for (String f : fusos) {
//			System.out.println(f);
//		}
		
		ZoneId ja = ZoneId.of("Asia/Jayapura");
		ZonedDateTime zdt = ZonedDateTime.of(LocalDateTime.parse("2022-08-12T06:30:26"), ZoneId.of("America/New_York"));
		System.out.println(zdt);
		System.out.println(ZonedDateTime.parse("2030-05-07T06:30:26-04:00[America/New_York]"));
		
		ZoneOffset offset = ZoneOffset.of("+02:00");
		OffsetDateTime offsetdt = OffsetDateTime.of(hojeCompleto, offset);
		System.out.println(offsetdt);
		
	}

}
