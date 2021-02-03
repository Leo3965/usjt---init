package usjt.init.classesUltilitárias;

import java.util.Random;

public class ClasseRandom {

	public static void main(String[] args) {

		System.out.println(Math.floor(Math.random() * 100));

		Random aleatorio = new Random();

		System.out.println(aleatorio.nextInt());
		
		// O 100 não é considerado, ou seja vai até 99
		System.out.println(aleatorio.nextInt(100));

		// Até 5 (5+1 == 6) xD
		System.out.println(aleatorio.nextInt(5 + 1));

	}

}
