package org.fpij.jitakyoei.model.beans;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class RgTest {

    Rg rg = new Rg("345345345345", "sdfsdfgdfg");

    @Test
    public void attributesTest() {
        String numero = "64564";
        rg.setNumero(numero);
        String orgaoExpedidor = "abecede";
        rg.setOrgaoExpedidor(orgaoExpedidor);

        assertEquals(numero, rg.getNumero());
        assertEquals(orgaoExpedidor, rg.getOrgaoExpedidor());
    }

    @Test
    public void equalsTest() {
        Rg rgTest = new Rg();
        String numero = "64564";
        rgTest.setNumero(numero);
        String orgaoExpedidor = "abecede";
        rgTest.setOrgaoExpedidor(orgaoExpedidor);

        assertFalse(rg.equals(rgTest));
    }

    @Test
    public void hashCodeTest(){
        int expected = (int)(long) rg.numero.hashCode()+rg.orgaoExpedidor.hashCode();

        assertEquals(rg.hashCode(), expected);
    }
}
