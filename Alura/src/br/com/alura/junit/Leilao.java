package br.com.alura.junit;

import java.util.ArrayList;
import java.util.List;

public class Leilao {

	private String descricao;
	private List<Lance> lances = new ArrayList<Lance>();

	public Leilao(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Lance> getLances() {
		return lances;
	}

	public void setLances(List<Lance> lances) {
		this.lances = lances;
	}

	public void propoe(Lance lance) {
		this.lances.add(lance);
		
	}

}
