package ExerciciosEnum;

public class Formulario {
	
	enum Genero{
		FEMININO('F'), MASCULINO('M');
		
		private char valor;
		
		Genero(char valor){
			this.valor = valor;
			
		
		}

		public char getValor() {
			return valor;
		}
		
	}
	
	private String nome;
	private Genero genero;
	
	public Formulario(String nome, Genero genero) {
		super();
		this.nome = nome;
		this.genero = genero;
	}
	
	public Formulario() {
		
	}

	public String getNome() {
		return nome;
	}

	public Genero getGenero() {
		return genero;
	}
	
	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Formulario [nome: " + nome + ", genero: " + genero + "]";
	}
	
	
}
