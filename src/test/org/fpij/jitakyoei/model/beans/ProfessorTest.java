package org.fpij.jitakyoei.model.beans;

import org.fpij.jitakyoei.model.TestHelper;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ProfessorTest {

    Professor professor = new Professor();

    @Test
    public void attributeTest() {
        Filiado filiado = TestHelper.testFiliado();
        Entidade entidade = TestHelper.testEntidade();
        List<Entidade> listEntidade = new ArrayList<>();
        listEntidade.add(entidade);
        professor.setEntidades(listEntidade);
        professor.setFiliado(filiado);

        assertEquals(professor.getFiliado(), filiado);
        assertEquals(professor.getEntidades(), listEntidade);
    }

    @Test
    public void equalsTest() {
        Professor testProfessor = TestHelper.testProfessor();

        //objects can't be the same cause of randomized long id in filiado
        assertNotEquals(testProfessor, professor);
    }

    @Test
    public void hashCodeTest() {
        Filiado filiado = TestHelper.testFiliado();
        Entidade entidade = TestHelper.testEntidade();
        List<Entidade> listEntidade = new ArrayList<>();
        listEntidade.add(entidade);
        professor.setEntidades(listEntidade);
        professor.setFiliado(filiado);

        int hashcode = professor.hashCode();

        assertNotNull(hashcode);
    }

    @Test
    public void toStringTest() {
        Professor testProfessor = TestHelper.testProfessor();

        assertEquals(testProfessor.toString(), testProfessor.getFiliado().getNome());
    }
}
