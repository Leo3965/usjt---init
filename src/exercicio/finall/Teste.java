package exercicio.finall;

class Teste {

	public static void main(String[] args) {
		 
		Pessoa pessoa = new Pessoa();
		pessoa.setCpf("222");
		//Pessoa aluno = new Aluno();
		//Pessoa professor = new Professor();
		Aluno aluno = new Aluno();
		aluno.setCursos("Java");
		Professor professor = new Professor();
		professor.setNomeCurso("Java");
		System.out.println(Constantes.URL_BLOG);
		Number a;
		double b = 3.5;
		int c = 5;
		a = b + c;
		System.out.println(a + aluno.getCursos() + professor.getNomeCurso() + pessoa.getCpf());
		
	}

}

final class Constantes {
	
	public static final String URL_BLOG = "https://github.com/Leo3965";
	
	
}
