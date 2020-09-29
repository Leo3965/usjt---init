package exercicio.interfaces;

class Quadrado extends Figura2D {
	private double lado;

	Quadrado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return lado * lado;
	}

	@Override
	public String toString() {
		return "[Com lado de: " + lado + ", e área de: " + calcularArea() + "]";
	}

}
