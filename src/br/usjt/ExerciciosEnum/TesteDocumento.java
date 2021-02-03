package ExerciciosEnum;

public class TesteDocumento {

	public static void main(String[] args) {
		
		for(TipoDeDocumento doc : TipoDeDocumento.values()) {
			System.out.println(doc + " - " + doc.geraNumeroTeste() );
		}
		
		Pessoa pf = new Pessoa();
		pf.setTipoDocumento(Enum.valueOf(TipoDeDocumento.class, "CPF"));
		pf.setNumeroDocumento(pf.getTipoDocumento().geraNumeroTeste());
		System.out.println(pf);
		
		Pessoa pj = new Pessoa();
		pj.setTipoDocumento(Enum.valueOf(TipoDeDocumento.class, "CNPJ"));
		pj.setNumeroDocumento(pf.getTipoDocumento().geraNumeroTeste());
		System.out.println(pj);
		
	}

}
