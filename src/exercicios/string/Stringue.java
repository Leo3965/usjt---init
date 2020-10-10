package exercicios.string;

public class Stringue {

	public static void main(java.lang.String[] args) {

		String vazia = new String();
		String java = new String("Java");
		String java1 = new String(java);
		
		char[] charsJava = {'j','a','v','a'};
		String java2 = new String(charsJava);
		System.out.println(java2);
		
		
		char[] abc = {'a', 'b', 'c', 'd', 'e', 'f'};
		String ab = new String(abc, 0, 4);
		System.out.println(ab);
		
		byte[] ascii = {65, 66, 67, 69};
		String abc2 = new String(ascii);
		System.out.println(abc2);
		
		String bcd = new String(ascii, 1, 3);
		System.out.println(bcd);
		
		
		// Mesmo ID ---- Atribuição simples as variáveis tem o mesmo endereço de memória
		String java3 = "Java";
		String java4 = "Java";
		
		
	}

}
