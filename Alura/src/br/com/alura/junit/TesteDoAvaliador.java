package br.com.alura.junit;

import org.junit.Test;
import org.junit.Assert;

public class TesteDoAvaliador {

	@Test
	public void main() {
		Usuario joao = new Usuario("Jo�o");
		Usuario jose = new Usuario("Jos�");
		Usuario maria = new Usuario("Maria");

		Leilao leilao = new Leilao("Playstation 3 Novo");

		leilao.propoe(new Lance(joao, 300.0));
		leilao.propoe(new Lance(jose, 400.0));
		leilao.propoe(new Lance(maria, 250.0));

		Avaliador leiloeiro = new Avaliador();
		leiloeiro.avalia(leilao);
		
		double maiorEsperado = 400;
		double menorEsperado = 250;

		//System.out.println( maiorEsperado == leiloeiro.getMaiorLance()); // imprime 400.0
		Assert.assertEquals(maiorEsperado, leiloeiro.getMaiorLance(), 0.00001);
		//System.out.println(menorEsperado == leiloeiro.getMenorLance()); // imprime 250.0
		Assert.assertEquals(menorEsperado, leiloeiro.getMenorLance(), 0.00001);
	}
}