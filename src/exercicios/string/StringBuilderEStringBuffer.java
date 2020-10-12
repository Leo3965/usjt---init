package exercicios.string;

public class StringBuilderEStringBuffer {

	public static void main(String[] args) {

		String[] alfabeto = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K"};
		
		String letras = "";
		
		for(String l : alfabeto) {
			letras += l;
		}
		System.out.println(letras);
		
		StringBuffer sb = new StringBuffer();
		//Thread safer
		for(String l : alfabeto) {
			sb.append(l);
		}
		
		//System.out.println(sb.toString());
		letras = sb.toString();
		System.out.println(letras);
		System.out.println(sb.reverse());
		System.out.println(sb.length());
		
		StringBuilder sb_ = new StringBuilder();
		for(String l : alfabeto) {
			sb_.append(l);
		}
		System.out.println(sb_.toString());
		
	}

}
