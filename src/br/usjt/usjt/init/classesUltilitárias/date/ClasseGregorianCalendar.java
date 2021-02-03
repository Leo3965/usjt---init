package usjt.init.classesUltilitárias.date;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ClasseGregorianCalendar {

	public static void main(String[] args) {
		
		Calendar hoje1 = Calendar.getInstance();
		GregorianCalendar hoje = new GregorianCalendar();
		
		System.out.println(hoje.isLeapYear(2016)); // Verifica se o ano é bissexto
		System.out.println(hoje.isLeapYear(2017));
		
		imprimirData(hoje); //Como a classe Calendar extends da classe GegorianCalendar pode-se
		                    // ultilizar o polimosfismo no parametro do metodo imprimirData
		
	}
	
	private static void imprimirData(Calendar hoje){
		
		int segundos = hoje.get(Calendar.SECOND);
		int minutos = hoje.get(Calendar.MINUTE);
		int hora = hoje.get(Calendar.HOUR_OF_DAY);
		int dia = hoje.get(Calendar.DAY_OF_MONTH);
		int ano = hoje.get(Calendar.YEAR);
		int mes = hoje.get(Calendar.MONTH);
		
		System.out.printf("hoje é : %d/%02d/%d  %02d:%02d:%02d",
				dia, (mes+1), ano, hora, minutos, segundos);
		
	}

}
