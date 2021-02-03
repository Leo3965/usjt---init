package exercicios.string;

public class StringConcatenacao {

	public static void main(String[] args) {

		String curso = "Curso";
		String java = "Java";
		
		String cursoJava = curso + java;
		System.out.println(cursoJava);
		
		String resultado2Com2 = "Resultado de 2 + 2 = " + (2+2);
		System.out.println(resultado2Com2);
		
		String resultado2Com2_ = "Resultado de 2 + 2 = " + 2 + 2;
		System.out.println(resultado2Com2_);
		
		String um = String.valueOf(1);
		System.out.println(um);
	}

}
