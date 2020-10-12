package usjt.init.classesUltilitárias.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ClasseSimpleDateFormat {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy HH:mm:ss a z"); // 2 letras iguais retorna a data específica com duas casa, no mes com 3 MMM retorna o mês por escrito
		
		Calendar data = new GregorianCalendar(2010, 2, 20, 14, 32, 25);
		
		System.out.println(sdf.format(data.getTime())); // get time retorna uma instancia da classe date
		
		
		Date hoje = new Date();
		System.out.println(sdf.format(hoje));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
		String minhaData = "20/02/2000";
		String minhaData2 = "20/02/2000";
		
		try {
			Date minhaDataEmDate = sdf2.parse(minhaData);
			Date minhaDataEmDate2 = sdf2.parse(minhaData);
			
			System.out.println(minhaDataEmDate);
			System.out.println(minhaDataEmDate2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
	}

}

         // Documentação - Documentation
/*Letter	Date or Time Component	Presentation	Examples
		G	Era designator	Text	AD
		y	Year	Year	1996; 96
		Y	Week year	Year	2009; 09
		M	Month in year (context sensitive)	Month	July; Jul; 07
		L	Month in year (standalone form)	Month	July; Jul; 07
		w	Week in year	Number	27
		W	Week in month	Number	2
		D	Day in year	Number	189
		d	Day in month	Number	10
		F	Day of week in month	Number	2
		E	Day name in week	Text	Tuesday; Tue
		u	Day number of week (1 = Monday, ..., 7 = Sunday)	Number	1
		a	Am/pm marker	Text	PM
		H	Hour in day (0-23)	Number	0
		k	Hour in day (1-24)	Number	24
		K	Hour in am/pm (0-11)	Number	0
		h	Hour in am/pm (1-12)	Number	12
		m	Minute in hour	Number	30
		s	Second in minute	Number	55
		S	Millisecond	Number	978
		z	Time zone	General time zone	Pacific Standard Time; PST; GMT-08:00
		Z	Time zone	RFC 822 time zone	-0800
		X	Time zone	ISO 8601 time zone	-08; -0800; -08:00*/