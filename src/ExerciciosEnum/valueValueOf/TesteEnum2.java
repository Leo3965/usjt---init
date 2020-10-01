package ExerciciosEnum.valueValueOf;

import ExerciciosEnum.DiaSemana2;

public class TesteEnum2 {

	public static void main(String[] args) {
		
		DiaSemana2 dia;
		
		System.out.println(Enum.valueOf(DiaSemana2.class, "DOMINGO"));
		
		dia = Enum.valueOf(DiaSemana2.class, "DOMINGO");
		System.out.println(dia);
	}

}
