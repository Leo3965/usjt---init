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
		return this.lances;
	}

	public void setLances(List<Lance> lances) {
		this.lances = lances;
	}

	public void propoe(Lance lance) {

		if (lances.isEmpty() || podeDarLance(lance.getUsuario())) {
			this.lances.add(lance);

		}

	}

	private boolean podeDarLance(Usuario usuario) {
		return !ultimoLanceDado().getUsuario().equals(usuario) && qtdDeLancesDo(usuario) > 5;
	}

	private int qtdDeLancesDo(Usuario usuario) {
		int total = 0;
		for (Lance l : lances) {
			if (l.getUsuario().equals(usuario))
				total++;
		}
		return total;
	}

	private Lance ultimoLanceDado() {
		return this.lances.get(lances.size() - 1);
	}

}
