package usjt.init.classesUltilit�rias;

import java.util.Random;

public class ClasseRandom {

	public static void main(String[] args) {

		System.out.println(Math.floor(Math.random() * 100));

		Random aleatorio = new Random();

		System.out.println(aleatorio.nextInt());
		
		// O 100 n�o � considerado, ou seja vai at� 99
		System.out.println(aleatorio.nextInt(100));

		// At� 5 (5+1 == 6) xD
		System.out.println(aleatorio.nextInt(5 + 1));

	}

}
