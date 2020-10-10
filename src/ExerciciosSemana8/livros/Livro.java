package ExerciciosSemana8.livros;

public class Livro{
	private String nome;
	private String autor;
	private int ano;

	public Livro(String nome, String autor, int ano) {
		this.nome = nome;
		this.autor = autor;
		this.ano = ano;

	}
	



	public Livro() {

	}

	



	public String getNome() {
		return nome;
	}




	public String getAutor() {
		return autor;
	}




	public int getAno() {
		return ano;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	@Override
	public String toString() {
		return "Livros [nome=" + nome + ", autor=" + autor + ", ano=" + ano + "]";
	}


}
