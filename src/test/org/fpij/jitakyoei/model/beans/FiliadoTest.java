package org.fpij.jitakyoei.model.beans;

import org.fpij.jitakyoei.model.TestHelper;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FiliadoTest {

    Filiado filiado = TestHelper.testFiliado();

    @Test
    public void attributesTest(){
        Long id = 7L;
        filiado.setId(id);
        String nome = "Paulo Coelho";
        filiado.setNome(nome);
        String registroCbj = "test";
        filiado.setRegistroCbj(registroCbj);
        Date dataNascimento = new Date();
        filiado.setDataNascimento(dataNascimento);
        Date dataCadastro = new Date();
        filiado.setDataCadastro(dataCadastro);
        String telefone1 = "123412312312";
        filiado.setTelefone1(telefone1);
        String telefone2 = "2346464567";
        filiado.setTelefone2(telefone2);
        String email = "test@test.com";
        filiado.setEmail(email);
        String cpf = "435345645645";
        filiado.setCpf(cpf);
        String observacoes = "este é um teste";
        filiado.setObservacoes(observacoes);
        Rg rg = new Rg("teste", "teste");
        filiado.setRg(rg);
        Endereco endereco = new Endereco();
        filiado.setEndereco(endereco);
        List<Faixa> faixas = new ArrayList<Faixa>();
        filiado.setFaixas(faixas);

        assertEquals(filiado.getId(), id);
        assertEquals(filiado.getNome(), nome);
        assertEquals(filiado.getRegistroCbj(), registroCbj);
        assertEquals(filiado.getDataNascimento(), dataNascimento);
        assertEquals(filiado.getDataCadastro(), dataCadastro);
        assertEquals(filiado.getTelefone1(), telefone1);
        assertEquals(filiado.getTelefone2(), telefone2);
        assertEquals(filiado.getEmail(), email);
        assertEquals(filiado.getCpf(), cpf);
        assertEquals(filiado.getObservacoes(), observacoes);
        assertEquals(filiado.getEndereco(), endereco);
        assertEquals(filiado.getRg(), rg);
        assertEquals(filiado.getFaixas(), faixas);
    }

    @Test
    public void equalsTest(){
        Filiado newFiliado = TestHelper.testFiliado();

        //objects can't be the same
        assertFalse(filiado.equals(newFiliado));
    }

    @Test
    public void copyPropertiesTest(){
        Filiado filiadoTest = new Filiado();
        Long id = 7L;
        filiadoTest.setId(id);
        String nome = "Paulo João";
        filiadoTest.setNome(nome);
        String registroCbj = "tset";
        filiadoTest.setRegistroCbj(registroCbj);
        Date dataNascimento = new Date();
        filiadoTest.setDataNascimento(dataNascimento);
        Date dataCadastro = new Date();
        filiadoTest.setDataCadastro(dataCadastro);
        String telefone1 = "444";
        filiadoTest.setTelefone1(telefone1);
        String telefone2 = "2";
        filiadoTest.setTelefone2(telefone2);
        String email = "tset@tset.com";
        filiadoTest.setEmail(email);
        String cpf = "0000";
        filiadoTest.setCpf(cpf);
        String observacoes = "este é um teste diferente";
        filiadoTest.setObservacoes(observacoes);
        Rg rg = new Rg("teste diferente", "teste diferente");
        filiadoTest.setRg(rg);
        Endereco endereco = new Endereco();
        filiadoTest.setEndereco(endereco);
        List<Faixa> faixas = new ArrayList<Faixa>();
        filiadoTest.setFaixas(faixas);

        filiado.copyProperties(filiadoTest);

        assertEquals(filiado.getId(), filiadoTest.getId());
        assertEquals(filiado.getNome(), filiadoTest.getNome());
        assertEquals(filiado.getRegistroCbj(), filiadoTest.getRegistroCbj());
        assertEquals(filiado.getDataNascimento(), filiadoTest.getDataNascimento());
        assertEquals(filiado.getDataCadastro(), filiadoTest.getDataCadastro());
        assertEquals(filiado.getTelefone1(), filiadoTest.getTelefone1());
        assertEquals(filiado.getTelefone2(), filiadoTest.getTelefone2());
        assertEquals(filiado.getEmail(), filiadoTest.getEmail());
        assertEquals(filiado.getCpf(), filiadoTest.getCpf());
        assertEquals(filiado.getObservacoes(), filiadoTest.getObservacoes());
        assertEquals(filiado.getEndereco(), filiadoTest.getEndereco());
        assertEquals(filiado.getRg(), filiadoTest.getRg());
        assertEquals(filiado.getFaixas(), filiadoTest.getFaixas());
    }

    @Test
    public void hashCodeTest(){
        assertEquals((int)(long)filiado.getId(), filiado.hashCode());
    }

    @Test
    public void toStringTest(){
        filiado.setNome("Thom Yorke");
        filiado.setRegistroCbj("1241234");
        filiado.setDataNascimento(new Date());
        filiado.setEmail("radiohead@test.com");
        filiado.setCpf("12312312312");

        String expectedString = "Nome: Thom Yorke" +
                "\nRegistroCbj: 1241234"+
                "\nDataNasc: "+filiado.getDataNascimento()+
                "\nE-mail: radiohead@test.com"+
                "\nCPF: 12312312312";

        assertEquals(filiado.toString(), expectedString);
    }
}
