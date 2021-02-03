package ExerciciosInterfaces;

class Cubo extends Figura3D {
	
	private double lado;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return lado * lado;
		
	}

	@Override
	public double calcularVolume() {
		return Math.pow(lado, 3);
	}

}