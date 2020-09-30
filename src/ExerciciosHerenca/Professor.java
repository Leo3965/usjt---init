package ExerciciosHerenca;

class Professor extends Pessoa{
	private String departamento;
	private String nomeCurso;
	private double salario;
	
	String getDepartamento() {
		return departamento;
	}
	void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	String getNomeCurso() {
		return nomeCurso;
	}
	void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	double getSalario() {
		return salario;
	}
	void setSalario(double salario) {
		this.salario = salario;
	}
	 
	double calculaSalarioLiquido() {
		return 0;
	}

}