package ExerciciosEnum;

public class Pessoa {
	
	private TipoDeDocumento tipoDocumento;
	private String numeroDocumento;
	
	
	public Pessoa() {
		super();
		
	}
	
	
	public Pessoa(TipoDeDocumento tipoDocumento, String numeroDocumento) {
		super();
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
	}
	
	
	public TipoDeDocumento getTipoDocumento() {
		return tipoDocumento;
	}
	
	
	public void setTipoDocumento(TipoDeDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	
	
	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	
	
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}


	@Override
	public String toString() {
		return "Pessoa [tipoDocumento=" + tipoDocumento + ", numeroDocumento=" + numeroDocumento + "]";
	}
	
	

}
