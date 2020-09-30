package ExerciciosInterfaces;

class Teste {

	public static void main(String[] args) {
		
		Quadrado quadrado = new Quadrado(4);
		quadrado.setNome("Quadrado");
		
		Circulo circulo = new Circulo(3);
		circulo.setNome("Circulo");
		
		Triangulo triangulo = new Triangulo(3.0,4.0);
		triangulo.setNome("Triangulo");
		
		Cubo cubo = new Cubo();
		cubo.setNome("Cubo");
		cubo.setLado(4);
		
		Cilindro cilindro = new Cilindro();
		cilindro.setNome("Cilindro");
		cilindro.setAltura(5);
		cilindro.setRaio(2.5);
		
		Piramide piramide = new Piramide();
		piramide.setNome("Piramide");
		piramide.setAltura(10);
		piramide.setApotema(4);
		piramide.setArestaBase(4);
		piramide.setNumPoliBase(4);
		piramide.setBase(quadrado);
		
		FiguraGeometrica[] listaFig = {quadrado, circulo, triangulo, cubo, cilindro, piramide};
		
		for(FiguraGeometrica figura : listaFig) { 
			
			System.out.println("----------------------------------");
			System.out.println(figura.getNome());
			
			if(figura instanceof Figura2D) {
				System.out.println(figura);
			}
			
			if(figura instanceof Figura3D) {
				Figura3D Fig = (Figura3D) figura;
				System.out.print("[Com �rea de: " + Fig.calcularArea());
				System.out.println(", e volume de: " + Fig.calcularVolume()+ "]");
	
			}
		
			
		}
	}

}