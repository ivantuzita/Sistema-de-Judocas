package org.fpij.jitakyoei.model.beans;

import org.fpij.jitakyoei.business.ProfessorEntidadeBOImpl;
import org.fpij.jitakyoei.model.TestHelper;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProfessorEntidadeTest {

    ProfessorEntidade professorEntidade = TestHelper.testProfessorEntidade();

    @Test
    public void attributesTest(){
        Professor professor = TestHelper.testProfessor();
        Entidade entidade = TestHelper.testEntidade();

        professorEntidade.setProfessor(professor);
        professorEntidade.setEntidade(entidade);

        assertEquals(professorEntidade.getEntidade(), entidade);
        assertEquals(professorEntidade.getProfessor(), professor);
    }

    @Test
    public void equalsTest() {
        ProfessorEntidade professorEntidadeTest = TestHelper.testProfessorEntidade();

        //objects can't be the same cause of randomized long id in filiado
        assertFalse(professorEntidade.equals(professorEntidadeTest));
    }

    @Test
    public void hashCodeTest(){
        int expected = professorEntidade.professor.hashCode() + professorEntidade.entidade.hashCode();
        assertEquals(professorEntidade.hashCode(), expected);
    }

}
