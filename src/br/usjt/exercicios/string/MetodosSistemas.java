package exercicios.string;

public class MetodosSistemas {

	public static void main(String[] args) {
		
		String teste = "Isso � um teste.";
		
		System.out.println(teste);
		System.out.println(teste.substring(10));
		System.out.println(teste.substring(10, 15));
		
		
		String ola = "ol�";
		String mundo = " mundo";
		String olaMundo = ola.concat(mundo);
		System.out.println(olaMundo);
		
		String espacos = "i s p a � o";
		String i = "i i i";
		String semEspacos = espacos.replace('i', 'e');
		String semI = i.replace('i', 'e');
		System.out.println(semEspacos);
		System.out.println(semI);
		
		semEspacos = semEspacos.replaceAll(" ","");
		System.out.println(semEspacos);
		
		String nome = " meu nome �:         ";
		System.out.println(nome);
		System.out.println(nome.trim());
		
	}

}
