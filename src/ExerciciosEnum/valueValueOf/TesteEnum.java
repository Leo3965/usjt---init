package ExerciciosEnum.valueValueOf;

import ExerciciosEnum.DiaSemana2;

public class TesteEnum {
	
	public static void main(String[] args) {
		
		DiaSemana2[] dias = DiaSemana2.values();
		
		for (int i=0; i < dias.length; i++) {
			System.out.println(dias[i]);
		}
		
		for (DiaSemana2 dia : DiaSemana2.values()){
			System.out.println(dia);
		}
		
	}
	

}
