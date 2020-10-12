package usjt.init.classesUltilitárias.date;

import java.util.Calendar;

public class ClasseCalendar {

	public static void main(String[] args) {

		Calendar hoje = Calendar.getInstance(); // Padrão singleton
		
		
		int segundos = hoje.get(Calendar.SECOND);
		int minutos = hoje.get(Calendar.MINUTE);
		int hora = hoje.get(Calendar.HOUR_OF_DAY);
		int dia = hoje.get(Calendar.DAY_OF_MONTH);
		int ano = hoje.get(Calendar.YEAR);
		int mes = hoje.get(Calendar.MONTH);
		
		System.out.println(segundos);
		System.out.println(minutos);
		System.out.println(hora);
		System.out.println(dia);
		System.out.println(mes); // No java os meses começam do 0 então janeiro é 0
		System.out.println(ano);
		
		StringBuffer horario = new StringBuffer("Relógio " + hora
				+":" + minutos + ":" + segundos + " \nData " + dia + "/"
				+ (mes+1) + "/" + ano);
		
		System.out.println(horario);
		
		System.out.printf("hoje é : %02d/%02d/%d  %02d:%02d:%02d", dia, (mes+1), ano, hora, minutos, segundos);
		
		
		System.out.println();
		System.out.println(hoje.get(Calendar.DAY_OF_MONTH));
		hoje.add(Calendar.DAY_OF_MONTH, 3);
		System.out.println(hoje.get(Calendar.DAY_OF_MONTH));
		hoje.add(Calendar.DAY_OF_MONTH, -4);
		System.out.println(hoje.get(Calendar.DAY_OF_MONTH));
		
		
	}

}
