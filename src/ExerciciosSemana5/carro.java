package ExerciciosSemana5;

// Atributos: Cor e Modelo
// M�todos: Acelerar e Alternar Far�is (alto, m�dio e baixo) 

public class carro {
	public void cor(){
		System.out.println("Qual � a cor do carro? ");
	}
	
	public void modelo(){
		System.out.println("Qual � o modelo do carro? ");
	}
	
	public void acelerar(String acelerador){
		System.out.println(" O carro ir� aumentar sua valocidade em " + getAcelerador() + " K/h");
		
	}
	
	public void alternarFarol(String farol){
		System.out.println("Qual � a intensidade do farol ? (a) para alta, (m) para m�dia e (b) para baixa ");
		if(farol == "a" || farol == "A"){
			farol = "Alta";
		} else if (farol == "m" || farol == "M") {
			farol = "M�dia";
		}else {
			farol = "Baixa";
		}
		getFarol();
		
	}

	public String getFarol() {
		return farol;
	}

	public void setFarol(String farol) {
		this.farol = farol;
	}


}
