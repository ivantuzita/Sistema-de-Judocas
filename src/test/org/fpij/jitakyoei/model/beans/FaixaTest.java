package org.fpij.jitakyoei.model.beans;

import org.fpij.jitakyoei.util.CorFaixa;
import org.junit.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FaixaTest {

    Faixa faixa = new Faixa();

    @Test
    public void attributesTest(){
        CorFaixa corFaixa = CorFaixa.AMARELA;
        Date data = new Date();
        faixa.setCor(corFaixa);
        faixa.setDataEntrega(data);
        CorFaixa cor = faixa.getCor();
        Date testData = faixa.getDataEntrega();

        assertEquals(data, testData);
        assertEquals(corFaixa, cor);
    }

    @Test
    public void toStringTest(){
        CorFaixa corFaixa = CorFaixa.AMARELA;
        Date data = new Date();
        faixa.setCor(corFaixa);
        faixa.setDataEntrega(data);
        CorFaixa cor = faixa.getCor();
        Date testData = faixa.getDataEntrega();

        String stringEsperada = cor + " - " + testData;

        assertEquals(faixa.toString(), stringEsperada);
    }
}
