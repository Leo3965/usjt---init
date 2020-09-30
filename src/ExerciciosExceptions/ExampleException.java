package ExerciciosExceptions;

class ExampleException { // O animal colocou o nome da classe com o mesmo nome da classe de tratamento de erro do Java, por esse motivo
	  // tive que especificar que era do java lang na linha 18.	

public static void main(String[] args) {
// M�todos:           || Descri��es:
// getMessage()       || retorna a descri��o do erro
// printStrackTrace() || imprime o strack trace do erro

int[] numeros = {4, 8, 16, 32, 64, 128};
int[] demon = {2, 0, 4, 8, 0};

for(int i = 0; i < numeros.length; i++) {
try {
	System.out.println(numeros[i] + "/" + demon[i] +  " = " + (numeros[i]/demon[i]));
	
} catch(java.lang.Exception error) {
	System.out.println(error.getMessage());
	error.printStackTrace();
	
}
	
}

}

}