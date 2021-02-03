package exercicios.string;

import java.util.StringTokenizer;

public class StringTokenizerrr {

	public static void main(String[] args) {

		String doArquivo = "1;Antônio;30;";
		
		StringTokenizer st = new StringTokenizer(doArquivo, ";");
		
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
		System.out.println(st.toString());
		
	}

}
