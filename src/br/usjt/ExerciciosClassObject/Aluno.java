package ExerciciosClassObject;

import java.util.Arrays;

class Aluno{
	private String curso;
	private double[] notas;
	
	String getCursos() {
		return curso;
	}
	void setCursos(String cursos) {
		this.curso = cursos;
	}
	double[] getNotas() {
		return notas;
	}
	void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	double calculaMedia() {
		return 0;
	}
	
	double verificaAprovado() {
		return 0;
	}
	@Override
	public String toString() {
		return "Aluno [curso=" + curso + ", notas=" + Arrays.toString(notas) + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (curso == null) {
			if (other.curso != null)
				return false;
		} else if (!curso.equals(other.curso))
			return false;
		if (!Arrays.equals(notas, other.notas))
			return false;
		return true;
	}
	
	/*public String toString() {
		String s =  curso + "\n";
		for(double nota : notas) {
			s += nota + " ";
		}
		return s;
	}*/

}