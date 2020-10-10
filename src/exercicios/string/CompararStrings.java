package exercicios.string;

public class CompararStrings {

	public static void main(String[] args) {

		String ola = "Olá";
		String ola2 = "OLÁ";
		String ola3 = "Olá";
		String ola4 = new String(ola);
		
		System.out.println("ola equals ola2 = " + ola.equals(ola2));
		System.out.println("ola equals ola3 = " + ola.equals(ola3));
		System.out.println("ola equals ola3 = " + ola.equalsIgnoreCase(ola2));
		
		System.out.println("ola == ola2 " + (ola == ola2));
		// true mesma referência de memória
		System.out.println("ola == ola3 " + (ola == ola3));
		// false direfentes referências de memória
		System.out.println("ola == ola4 " + (ola == ola4));
		
		String banana = "banana";
		String ban = "ban";
		String ana = "ana";
		
		System.out.println(banana.regionMatches(1, ana, 0, 3));
		System.out.println(banana.regionMatches(3, ana, 0, 3));
		System.out.println(banana.regionMatches(0, ban, 0, 3));
		
		
		System.out.println(banana.endsWith(ana));
		System.out.println(banana.startsWith(ban));
		
		String a = "a";
		String b = "b";
		String aM = "A";
		
		System.out.println(a.compareTo(b));
		System.out.println(b.compareTo(a));
		System.out.println(a.compareTo(a));
		System.out.println(a.compareTo(aM));
		// -1 quando a > b
		//0 quando a == b
		//1 ou >1 quando a < b (Diferença feita pelo valor da tabela ascii)
		
	}

}
