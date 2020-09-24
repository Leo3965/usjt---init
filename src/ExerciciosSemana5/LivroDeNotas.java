package ExerciciosSemana5;


public class LivroDeNotas {
	private String nomeDoCurso;
	
	public LivroDeNotas (String nomeDoCurso){
		this.nomeDoCurso = nomeDoCurso;
	}
	public void exibirMensagem (){
		System.out.println("Bem vindo ao livro de notas do curso " + getNomeDoCurso());
	}
	public String getNomeDoCurso() {
		return nomeDoCurso;
	}
	public void setNomeDoCurso(String nomeDoCurso) {
		this.nomeDoCurso = nomeDoCurso;
	}
}