package exercicios.string;

import java.util.Arrays;

public class charAt {

	public static void main(String[] args) {

		String java = "Java";

		for (int i=0; i<java.length(); i++) {
			System.out.println(java.charAt(i));

		}

		char[] jav = new char[3];
		java.getChars(0, 3, jav, 0);
		System.out.println(jav);

		//seria o mesmo que
		for (int i=0, j=0; i<jav.length; i++, j++) {
			jav[i] = java.charAt(j);
		}
		System.out.println(jav);
		
		byte[] javaBites = new byte[3];
		java.getBytes(0, 3, javaBites, 0);
		System.out.println(Arrays.toString(javaBites) + " J, a, e v em formato ascii");

		char[] javaChars = java.toCharArray();
		char[] javaChars2 = ("Javinha").toCharArray();
		System.out.println(javaChars);
		System.out.println(javaChars2);
	}

}
