package exercicio.interfaces;

class Circulo extends Figura2D {
	private double raio;

	Circulo(double raio) {
		this.raio = raio;
	}


	@Override
	public double calcularArea() {
		return Math.PI * (raio * raio);
	}


	@Override
	public String toString() {
		return "[Com raio de: " + raio + ", e área de: " + calcularArea() + "]";
	}

}
