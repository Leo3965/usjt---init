package ExerciciosSemana5;

class carro {
	
	// Atributos: Cor e Modelo
	// Métodos: Acelerar e Alternar Faróis (alto, médio e baixo) 

		public void cor(){
			System.out.println("Qual � a cor do carro? ");
		}
		
		public void modelo(){
			System.out.println("Qual � o modelo do carro? ");
		}
		
		public void acelerar(String acelerador){
			System.out.println(" O carro ir� aumentar sua valocidade em  K/h");
			
		}
		
		public void alternarFarol(String farol){
			System.out.println("Qual é a intensidade do farol ? (a) para alta, (m) para média e (b) para baixa ");
			if(farol == "a" || farol == "A"){
				farol = "Alta";
			} else if (farol == "m" || farol == "M") {
				farol = "Média";
			}else {
				farol = "Baixa";
			}
			getFarol();
			
		}
		String farol;
		public String getFarol() {
			return farol;
		}

		public void setFarol(String farol) {
			this.farol = farol;
		}

}
