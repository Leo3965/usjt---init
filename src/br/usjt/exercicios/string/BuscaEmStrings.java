package exercicios.string;

public class BuscaEmStrings {

	public static void main(String[] args) {

		String banana = "banana";
		String ana = "ana";
		
		System.out.println(banana.indexOf("a"));
		//Retorna -1 caso não exista
		System.out.println(banana.indexOf("x"));
		System.out.println(banana.indexOf(ana));
		
		System.out.println(banana.lastIndexOf("a"));
		System.out.println(banana.lastIndexOf(ana));
		
		//retorna true ou false
		System.out.println(banana.contains(ana));
		System.out.println(banana.contains("céu"));
		
		
	}

}
