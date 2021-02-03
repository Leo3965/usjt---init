package ExerciciosEnum.Calculadora;

public class CalculadoraEnum {
	
	enum Operacao{
		SOMA("+", "Soma") {
			@Override
			public double executarOperacao(double x, double y) {
				return x + y;
			}
		}, SUBTRAIR("-", "Subtração") {
			@Override
			public double executarOperacao(double x, double y) {
				return x - y;
			}
		}, MULTIPLICAR("*", "Multiplicação") {
			@Override
			public double executarOperacao(double x, double y) {
				return x * y;
			}
		}, DIVIDIR("/", "Divisão") {
			@Override
			public double executarOperacao(double x, double y) {
				return x / y;
			}
		};
		
		private String simbolo;
		private String nome;
		
		Operacao(String simbolo, String nome){
			this.simbolo = simbolo;
			this.nome = nome;
		}
		
		public abstract double executarOperacao(double x, double y);
		
		public String toString() {
			return this.simbolo;
			
		}
		
	}
	
	public static void main(String[] args) {
		
		double x  = 2.0;
		double y = 3.0;
		
		
		for(Operacao op : Operacao.values()) {
			System.out.print(op.nome + " " + x + " ");
			System.out.print(op.toString() + " ");
			System.out.print(y + " = ");
			System.out.print(op.executarOperacao(x, y)+ "\n");
		}
		
	}
}
