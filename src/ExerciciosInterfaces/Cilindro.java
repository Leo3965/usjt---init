package ExerciciosInterfaces;

class Cilindro extends Figura3D {
	private double altura;
	private double raio;
	double getAltura() {
		return altura;
	}
	void setAltura(double altura) {
		this.altura = altura;
	}
	double getRaio() {
		return raio;
	}
	void setRaio(double raio) {
		this.raio = raio;
	}
	@Override
	public double calcularArea() {
		double areaBase = Math.PI * (raio * raio);
		double areaLateral = 2 * Math.PI * raio * altura;
		return (2*areaBase) + areaLateral;
	}
	@Override
	public double calcularVolume() {
		return Math.PI * (raio * raio) * altura;
	}

}
