package ExerciciosAutoboxingUnboxing;

public class TexteAutoboxing {

	public static void main(String[] args) {
		
		//AUTOBOXING -  é conversão automática de tipos de dados primitivos em seu objeto equivalente.
		//Esse recurso é conhecido como autoboxing.
		
		Integer integer = 9;
		
		Short num7 = 1;
		Byte num8 = 10;
		Integer num9 = 100;
		Long num10 = 1000l;
		Float num11 = 3.5f;
		Double num12 = 3.555;
		Boolean flag2 = true;
		Character b_ = 'b';
		
		//AUTOUNBOXING - é o processo de conversão de objetos em tipos primitivos de dados correspondentes é chamado de unboxing
		
		int i = 0;
		i = new Integer(9);
		System.out.println();
		
		int num13 = num9; //num9.intValue();

		num9++;
		
		System.out.println(num9);
		
		//auto unboxing num9 -> autounboxing num13/num9 -> num14
		Integer num14 = num13/num9;
		
		
		//mau uso
		Double a, b, c;
		a = 10.5;
		b = 5.6;
		c = 6.9;
		
		Double media = (a+b+c)/3;
		System.out.println(media);
		
	}

}
