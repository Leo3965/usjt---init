package ExerciciosInterfaces;

class Triangulo extends Figura2D {
	private double base;
	private double altura;
	
	
	Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return ((altura * base) / 2);
	}
	
	@Override
	public String toString() {
		return "[Com base de: " + base + ", e altura de: " + altura + ", e �rea de: " + calcularArea() + "]";
	}


}
