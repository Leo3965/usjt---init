package br.com.alura.collection;

public class Aula implements Comparable<Aula>{

	private String nome;
	private int tempo;

	public Aula(String nome, int tempo) {
		super();
		this.nome = nome;
		this.tempo = tempo;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "[Aula: " + nome + ", tempo: " + tempo + " minutos]";
	}

	@Override
	public int compareTo(Aula outraAula) {
		return this.nome.compareTo(outraAula.nome);
	}
}
