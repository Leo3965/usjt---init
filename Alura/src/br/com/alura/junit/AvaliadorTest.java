package br.com.alura.junit;

import org.junit.Assert;
import org.junit.Test;

public class AvaliadorTest {

    @Test
    public void deveEntenderLancesEmOrdemCrescente() {
      // codigo omitido
    }

    @Test
    public void deveEntenderLancesEmOrdemCrescenteComOutrosValores() {
        Usuario joao = new Usuario("João");
        Usuario jose = new Usuario("José");
        Usuario maria = new Usuario("Maria");

        Leilao leilao = new Leilao("Playstation 3 Novo");

        leilao.propoe(new Lance(joao, 1000.0));
        leilao.propoe(new Lance(jose, 2000.0));
        leilao.propoe(new Lance(maria, 3000.0));

        Avaliador leiloeiro = new Avaliador();
        leiloeiro.avalia(leilao);

        Assert.assertEquals(3000.0, leiloeiro.getMaiorLance(), 0.0001);
        Assert.assertEquals(1000.0, leiloeiro.getMenorLance(), 0.0001);
    }
}