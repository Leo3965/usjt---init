package usjt.init.classesUltilitárias.date;

import java.util.Date;

public class ClasseDate {

	public static void main(String[] args) {
		
		Date hoje = new Date();
		
		System.out.println(hoje);
		System.out.println("Milisegundos desde 1 Janeiro de 1970  " + hoje.getTime());
		
		System.out.println(hoje.getDate()); 
		System.out.println(hoje.getMonth());
		System.out.println(hoje.getYear());
		
	}

}
