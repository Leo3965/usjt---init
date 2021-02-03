package usjt.init.classesUltilitárias.date;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;

public class DiferencaEntreDatas {

	public static void main(String[] args) {
		
		try {
			diferencaData();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		diferencaDataJava8();
		
	}
	
	

	public static void diferencaData() throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date primeiraDt = sdf.parse("01/01/2020");
		Date segundoDt = sdf.parse("01/02/2020");
		
		long diffEmMili = segundoDt.getTime() - primeiraDt.getTime();
		
		long diff = TimeUnit.DAYS.convert(diffEmMili, TimeUnit.MILLISECONDS);
		
		int dias = (int) (diffEmMili / (1000 * 60 * 60 * 24)); 
				
		System.out.println(diff);
		System.out.println(dias);
		
	}
	
	public static void diferencaDataJava8() {
		
		LocalDate data1 = LocalDate.of(2020, 01, 01);
		LocalDate data2 = LocalDate.of(2020, 02, 01);
		
		Period periodo = Period.between(data1, data2);
		int dias = periodo.getDays();
		int meses = periodo.getMonths();
		System.out.println("Dias: " + dias + " Meses: " + meses);
		
	}
	
}
