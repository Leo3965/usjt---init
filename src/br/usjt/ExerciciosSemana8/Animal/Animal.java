package ExerciciosSemana8.Animal;

class Animal {
	private String nome;
	private int patas;
	
	public Animal() {
		
	}
	public Animal(String nome) {
		this.nome = nome;
		}
	public Animal(int patas) {
		this.patas = patas;
	}
	
	public Animal(String nome, int patas) {
		this.nome = nome;
		this.patas = patas;
	}
	@Override
	public String toString() {
		return "Animal [nome: " + nome + ", patas: " + patas + "]";
	}

}
