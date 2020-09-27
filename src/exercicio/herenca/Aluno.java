package exercicio.herenca;

class Aluno extends Pessoa{
	private String[] cursos;
	private String[][] notas;
	
	String[] getCursos() {
		return cursos;
	}
	void setCursos(String[] cursos) {
		this.cursos = cursos;
	}
	String[][] getNotas() {
		return notas;
	}
	void setNotas(String[][] notas) {
		this.notas = notas;
	}
	
	double calculaMedia() {
		return 0;
	}
	
	double verificaAprovado() {
		return 0;
	}

}
