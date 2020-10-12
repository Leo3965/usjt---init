package usjt.init.classesUltilitárias.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class ClasseLocale {

	public static void main(String[] args) {
		
		Date hoje = new Date();
		
		System.out.println(hoje);
		
		
		String hojeFormatado = DateFormat.getDateInstance().format(hoje);
		System.out.println(hojeFormatado);
		//10 de out. de 2020
		
		hojeFormatado = DateFormat.getInstance().format(hoje);
		System.out.println(hojeFormatado);
		//10/10/2020 18:30
		
		Locale.setDefault(new Locale("en", "United States"));
		
		hojeFormatado = DateFormat.getDateInstance().format(hoje);
		System.out.println(hojeFormatado);
		//Oct 10, 2020
		
		hojeFormatado = DateFormat.getInstance().format(hoje);
		System.out.println(hojeFormatado);
		//10/10/20, 6:30 PM
		
		hojeFormatado = DateFormat.getTimeInstance().format(hoje);
		System.out.println(hojeFormatado);
		//6:30:41 PM
		
		hojeFormatado = DateFormat.getTimeInstance(DateFormat.SHORT).format(hoje);
		System.out.println(hojeFormatado);
		//6:36 PM
		
		hojeFormatado = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(hoje);
		System.out.println(hojeFormatado);
		//6:37:29 PM
		
		hojeFormatado = DateFormat.getTimeInstance(DateFormat.LONG).format(hoje);
		System.out.println(hojeFormatado);
		//6:37:53 PM BRT
		
		hojeFormatado = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.MEDIUM).format(hoje);
		System.out.println(hojeFormatado);
		//10/10/20, 6:40:25 PM
		
		Locale.setDefault(new Locale("pt", "Brazil"));
		String data = "20 de nov. de 1998";
		
		try {
			
			Date dataDate = DateFormat.getDateInstance().parse(data);
			System.out.println(dataDate);
			
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		
	}

}
