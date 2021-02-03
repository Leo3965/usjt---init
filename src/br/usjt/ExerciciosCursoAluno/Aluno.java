package ExerciciosCursoAluno;

class Aluno {
	private String nome;
	private double nota;
	private int matricula;
	private double media;

	double getMedia() {
		return media;
	}
	void setMedia(double media) {
		this.media = media;
	}
	double getNota() {
		return nota;
	}
	void setNota(double nota) {
		this.nota = nota;
	}
	String getNome() {
		return nome;
	}
	void setNome(String nome) {
		this.nome = nome;
	}

	int getMatricula() {
		return matricula;
	}
	void setMatricula(int matricula) {
		this.matricula = matricula;
	}

}