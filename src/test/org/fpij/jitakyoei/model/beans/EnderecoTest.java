package org.fpij.jitakyoei.model.beans;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EnderecoTest {

    Endereco endereco = new Endereco();

    @Test
    public void attrubitesTest(){
        String rua = "Rua Natalina";
        String numero = "333";
        String bairro = "Bairro Natalino";
        String cidade = "Cidade Natalina";
        String estado = "Polo Norte";
        String cep = "00000-000";

        endereco.setRua(rua);
        endereco.setNumero(numero);
        endereco.setBairro(bairro);
        endereco.setCidade(cidade);
        endereco.setEstado(estado);
        endereco.setCep(cep);

        assertEquals(endereco.getRua(), rua);
        assertEquals(endereco.getNumero(), numero);
        assertEquals(endereco.getBairro(), bairro);
        assertEquals(endereco.getCidade(), cidade);
        assertEquals(endereco.getEstado(), estado);
        assertEquals(endereco.getCep(), cep);
    }

    @Test
    public void toStringTest(){
        endereco.setRua("Rua Natalina");
        endereco.setNumero("333");
        endereco.setBairro("Bairro Natalino");
        endereco.setCidade("Cidade Natalina");
        endereco.setEstado("Polo Norte");
        endereco.setCep("00000-000");

        String expectedString = "\nRua: Rua Natalina" +
                "\nNumero: 333"+
                "\nBairro: Bairro Natalino"+
                "\nCidade: Cidade Natalina"+
                "\nEstado: Polo Norte"+
                "\nCep: 00000-000";

        assertEquals(endereco.toString(), expectedString);
    }

}
