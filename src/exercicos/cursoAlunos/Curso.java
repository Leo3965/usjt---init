package exercicos.cursoAlunos;

class Curso {
	private String nome;
	private String horario;
	private Professor professor;
	private Aluno alunos;
	


	Aluno getAlunos() {
		return alunos;
	}
	void setAlunos(Aluno alunos) {
		this.alunos = alunos;
	}
	Professor getProfessor() {
		return professor;
	}
	void setProfessor(Professor professor) {
		this.professor = professor;
	}
	String getNome() {
		return nome;
	}
	void setNome(String nome) {
		this.nome = nome;
	}
	String getHorario() {
		return horario;
	}
	void setHorario(String horario) {
		this.horario = horario;
	}

}
