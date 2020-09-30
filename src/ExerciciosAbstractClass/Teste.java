package ExerciciosAbstractClass;

class Teste {

	public static void main(String[] args) {
		
		//Pessoa pessoa = new Pessoa();
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();
		
		//pessoa.setEndereco("Rua 1, n�mero 1");
		aluno.setEndereco("Rua 2, n�mero 2");
		professor.setEndereco("Rua 3, n�mero 3");
		
		//System.out.println(pessoa.obterEtiquetaEndereco());
		System.out.println(aluno.obterEtiquetaEndereco());
		System.out.println(professor.obterEtiquetaEndereco());
		
		aluno.imprimirEtiquetaEndereco();
		professor.imprimirEtiquetaEndereco();

	}

}