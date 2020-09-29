package exercicio.interfaces;

class Piramide extends Figura3D {
	private double altura;
	private double apotema;
	private int arestaBase;
	private Figura2D base;
	private int numPoliBase;
	
	double getApotema() {
		return apotema;
	}
	void setApotema(double apotema) {
		this.apotema = apotema;
	}
	Figura2D getBase() {
		return base;
	}
	void setBase(Figura2D base) {
		this.base = base;
	}
	double getAltura() {
		return altura;
	}
	void setAltura(double altura) {
		this.altura = altura;
	}
	
	public int getNumPoliBase() {
		return numPoliBase;
	}
	public void setNumPoliBase(int numPoliBase) {
		this.numPoliBase = numPoliBase;
	}
	public int getArestaBase() {
		return arestaBase;
	}
	public void setArestaBase(int arestaBase) {
		this.arestaBase = arestaBase;
	}
	
	@Override
	public double calcularArea() {
		if(base != null) {
			return numPoliBase * (((arestaBase * apotema) / 2)) + base.calcularArea();
		}
		return 0;
	}
	@Override
	public double calcularVolume() {
		if(base != null) {
			return ((base.calcularArea() * altura) / 3);	
		}
		return 0;
	}

}
