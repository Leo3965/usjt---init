package exercicios.classBbject;

import java.util.Arrays;

class Teste {
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setCursos("Java");
		double[] notas = {10, 9, 8, 7};
		System.out.println(Arrays.toString(notas));
		aluno.setNotas(notas);
		System.out.println(aluno.toString());
	}
	
}
