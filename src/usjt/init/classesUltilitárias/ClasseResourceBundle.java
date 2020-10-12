package usjt.init.classesUltilit�rias;

import java.util.Locale;
import java.util.ResourceBundle;

public class ClasseResourceBundle {

	public static void main(String[] args) {
		
		System.out.println("Locale atual: " + Locale.getDefault());
		
		ResourceBundle rb = ResourceBundle.getBundle("meu-texto");
		
		System.out.println("Ol�: " + rb.getString("hello"));
		System.out.println("Mundo: " + rb.getString("world"));
		
		Locale.setDefault(new Locale("pt_BR", "pt_BR"));
		rb = ResourceBundle.getBundle("meu-texto_pt_BR");
		System.out.println("Hello BR: " + rb.getString("hello"));
		System.out.println("World BR: " + rb.getString("world"));
		
		
	}

}
