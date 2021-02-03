package ExerciciosWrappers;

public class TesteWrasppers {

	public static void main(String[] args) {
		
		short num1 = 1;
		byte num2 = 10;
		int num3 = 100;
		long num4 = 10000l;
		float num5 = 3.5f;
		double num6 = 3.5555;
		boolean flag = true;
		char a = 'a';

		Short num7 = new Short((short) 1);
		Byte num8 = new Byte((byte) 10);
		Integer num9 = new Integer(100);
		Long num10 = new Long(10000);
		Float num11 = new Float(3.5f);
		Double num12 = new Double(3.55);
		Boolean flag2 = new Boolean(false);
		Character b = new Character('b');
		Integer num13 = new Integer("100");
		Double num14 = new Double("3.5");
		Integer num20 = num9;
		
		// Todas as classes wrappers é posivel fazer fazer a conversão
		// do tipo do dado por funções pre implementadas 
		// usando por exemplo num13.doubleValue()
		System.out.println(num13.intValue());
		
		Long num18 = num13.longValue();
		
		int num16 = Integer.parseInt("546");
		Integer num17 = Integer.valueOf(1354);
		System.out.println(num17);
		
		System.out.println(num9 == num13);
		System.out.println(num9 == num20);
		System.out.println(num9.equals(num13));
		
		
	}

}
