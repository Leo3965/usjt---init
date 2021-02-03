package ExerciciosEnum;

import ExerciciosEnum.Formulario.Genero;

public class TesteEnum {

	public static void main(String[] args) {


		DiaSemana2 dia = DiaSemana2.DOMINGO;
		
		System.out.println(dia.toString() + " - " + dia.getValor());
		
		Data data = new Data(20,11,1998,DiaSemana2.SEXTA);
		
		System.out.println(data);
		
		Genero genero = Formulario.Genero.MASCULINO;
		
		Formulario formulario = new Formulario("Léo", genero);
		
		System.out.println(formulario);
		
	}

}
