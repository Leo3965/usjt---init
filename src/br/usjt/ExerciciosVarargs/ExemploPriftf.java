package ExerciciosVarargs;

public class ExemploPriftf {

	public static void main(String[] args) {

		System.out.printf("%s", "Olá, Mundo!");
		System.out.println();
		System.out.printf("%S", "Olá, Mundo!");
		System.out.println();

		System.out.printf("%c", 'c');
		System.out.println();
		System.out.printf("%C", 'c');

		System.out.printf("%n");

		int valor = 123456789;
		System.out.printf("%d", valor);

		System.out.println();

		double pontoFlutuante = 3.1456789;
		System.out.printf("%f", pontoFlutuante);

		System.out.println();

		String olaMundo = "Olá, Mundo!";
		System.out.printf("%20s", olaMundo);

		System.out.println();

		System.out.printf("%-20s", olaMundo);

		System.out.println();

		System.out.printf("%+d", valor); //+123456789

		System.out.println();

		System.out.printf("%015d", valor); //000000123456789

		System.out.println();

		System.out.printf("%,d", valor); //123.456.789
		
		System.out.println();
		
		int valor2 = -123456789;
		System.out.printf("% d", valor2); //-123456789
		System.out.println();
		System.out.printf("% d", valor); // 123456789

		System.out.println();

		System.out.printf("%.3f", pontoFlutuante); //3,146

		System.out.println();

		System.out.format("R$%10.2f", pontoFlutuante); //R$      3,15

		System.out.println();

		testeMaisCompleto();
	}
	
	private static void testeMaisCompleto(){
		
		double[] precos = {10000, 123.54, 7843.567, 1, 4.56789};
		
		for (int i=0; i<precos.length; i++){
			System.out.printf("%s %02d: total de R$%,10.2f%n", "Item", i+1, precos[i]);
		}
		
		// Java.util.Formater
		// System.out.printf || System.out.format
		// %[flags][width][.precision]conversion-character
		// % [flags] [largura] [.precisao] [caracter de conversão é opcional]
		//  %d   || número inteiro[byte, shot, int, long]
		// %u    || numero inteiro decimal sem sinal +-
		// %o    || numero inteiro octal sem sinal +-
		// %x, %X|| numero hexadecimal, low case ou uppercase
		// %f    || numero do tipo flutuante (float, double)
		// %e, %E|| numero real em notacao cientifca (low ou upper)
		// %s, %S|| string (low ou upper)
		// %c, %C|| char (low ou upper)
		// %p    || referencia de um objeto
		// %n    || pula uma linha similar ao \n
		
		// -------- FLAGs --------
		// -     || alinha á esquerda
		// +     || adiciona o sinal de mais ou menos para um numerico
		// 0     || força um valor numerico a ter 0 á esquerda
		// ,     || marca  milhares, centenas
		// " "   || " " espaço em branco, adiciona o sinal de menos caso o numero seja negativo
	}

}