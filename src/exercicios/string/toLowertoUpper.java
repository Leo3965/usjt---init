package exercicios.string;

public class toLowertoUpper {

	public static void main(String[] args) {
		
		String teste = "Teste";
		String teste2 = "teste";
		
		System.out.println(teste.toLowerCase());
		System.out.println(teste.toUpperCase());
		
		String f = "F";
		String g = "G";
		String alfabeto = String.join(", ", "A", "B", "C", "D", "E", f, g);
		System.out.println(alfabeto);
		
		String[] letras = alfabeto.split(", ");
		for (String l : letras) {
			System.out.println(l);
		}
		
		String arq = "1:antônio:30";
		String[] infos = arq.split(":");
		
		Pessoa pessoa = new Pessoa(Integer.parseInt(infos[0]), infos[1], Integer.parseInt(infos[2]));
		System.out.println(pessoa);
		
		for (String i : infos) {
			System.out.println(i);
		}
	}

}
