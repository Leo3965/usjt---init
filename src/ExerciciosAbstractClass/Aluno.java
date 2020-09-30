package ExerciciosAbstractClass;

class Aluno extends Pessoa{
	private String cursos;
	private String[] notas;
	
void verificaAcesso() {
	this.verifica = "OI";	
	}
	
	Aluno(String nome, String endereco, String telefone, String cursos) {
		super(nome, endereco, telefone);
		this.cursos = cursos;
		// TODO Auto-generated constructor stub
	}
	
	Aluno() {
		super();
		// TODO Auto-generated constructor stub
	}

	String getCursos() {
		return cursos;
	}
	void setCursos(String cursos) {
		this.cursos = cursos;
	}
	String[] getNotas() {
		return notas;
	}
	void setNotas(String[] notas) {
		this.notas = notas;
	}
	
	double calculaMedia() {
		return 0;
	}
	
	double verificaAprovado() {
		return 0;
	}
	
public String obterEtiquetaEndereco() {
		
		String s = "Endere�o do aluno: ";
		s += this.getEndereco();
		return s;
	}
@Override
public void imprimirEtiquetaEndereco() {
	System.out.println(this.obterEtiquetaEndereco());	
}

}