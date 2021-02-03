package ExerciciosCursoAluno;

import java.util.Scanner;

class Teste {

	public static void main(String[] args) {
		
		Curso curso = new Curso();
		
		Professor professor = new Professor(); 
		
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno();
		Aluno aluno4 = new Aluno();
		Aluno aluno5 = new Aluno();
		Aluno[] alunos = new Aluno[5];
		alunos[0] = aluno1;
		alunos[1] = aluno2;
		alunos[2] = aluno3;
		alunos[3] = aluno4;
		alunos[4] = aluno5;
		double media = 0;
		double[] notas = new double[4];
		
		int contador = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o nome do curso :");
		curso.setNome(sc.next());
		System.out.println("Informe o hor�rio do curso :");
		curso.setHorario(sc.next());
		System.out.println("Informe o nome do professor :");
		professor.setNome(sc.next());
		professor.setDepartamento("S�o Judas");
		professor.setEmail("professor@gmail.com");
		curso.setProfessor(professor);
		
		
		for(int j = 0; j <alunos.length; j++) {
			System.out.println("Digite o nome do " + (j+1) + "� aluno :");
			alunos[j].setNome(sc.next());
			System.out.println("Digite a matricula do " + (j+1) + "� aluno :");
			alunos[j].setMatricula(sc.nextInt());
			for(int i = 0; i < alunos.length-1; i++) {
				System.out.println("Digite a " + (i+1) + "� nota:");
				notas[i] = sc.nextDouble();
				media += notas[i];
				alunos[i].setNota(notas[i]);
			}
			alunos[j].setMedia(media/4);
		}
		while(contador < 5) {
			System.out.println("O(a) " +(contador+1) + " aluno(a) : " + alunos[contador].getNome() + " teve m�dia : " + alunos[contador].getMedia() + " e foi ");
			if(alunos[contador].getMedia() >= 7) {
				System.out.print("aprovado");
			} else {
				System.out.print("reprovado");
			}
			contador += 1 ;
			System.out.println();
		}
		
		
		sc.close();
	}
}