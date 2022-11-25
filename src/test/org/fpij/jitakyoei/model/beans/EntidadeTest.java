package org.fpij.jitakyoei.model.beans;

import org.fpij.jitakyoei.model.TestHelper;
import org.junit.Test;

import static org.junit.Assert.*;

public class EntidadeTest {

    Entidade entidade = TestHelper.testEntidade();

    @Test
    public void attributeTest(){
        String nome = "PUC";
        entidade.setNome(nome);
        String cnpj = "123123123123123";
        entidade.setCnpj(cnpj);
        String telefone = "123123123123123";
        entidade.setTelefone1(telefone);

        assertEquals(entidade.getNome(), nome);
        assertEquals(entidade.getCnpj(), cnpj);
        assertEquals(entidade.getTelefone1(), telefone);
    }

    @Test
    public void equalsTest(){
        Entidade newEntidade = new Entidade();
        String nome = "PUC";
        newEntidade.setNome(nome);
        String cnpj = "123123123123123";
        newEntidade.setCnpj(cnpj);
        String telefone = "123123123123123";
        newEntidade.setTelefone1(telefone);

        //objects can't be the same
        assertFalse(newEntidade.equals(entidade));
    }

    @Test
    public void hashCodeTest(){
        String nome = "PUC";
        entidade.setNome(nome);
        String cnpj = "123123123123123";
        entidade.setCnpj(cnpj);
        String telefone = "123123123123123";
        entidade.setTelefone1(telefone);

        int hashcode = entidade.hashCode();

        assertNotNull(hashcode);
    }

    @Test
    public void toStringTest(){
        assertEquals(entidade.toString(), entidade.getNome());
    }

    @Test
    public void copyPropertiesTest(){
        Entidade entidadeTest = new Entidade();
        String nome = "ABACO";
        entidadeTest.setNome(nome);
        String cnpj = "2323";
        entidadeTest.setCnpj(cnpj);
        String telefone = "67674";
        entidadeTest.setTelefone1(telefone);

        entidade.copyProperties(entidadeTest);

        assertEquals(entidadeTest.getNome(), entidade.getNome());
        assertEquals(entidadeTest.getCnpj(), entidade.getCnpj());
        assertEquals(entidadeTest.getTelefone1(), entidade.getTelefone1());
    }
}
