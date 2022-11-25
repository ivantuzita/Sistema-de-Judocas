package org.fpij.jitakyoei.model.beans;

import org.fpij.jitakyoei.model.TestHelper;
import org.junit.Test;
import javax.swing.*;
import static org.junit.Assert.*;

public class AlunoTest {

    Aluno aluno = TestHelper.testAluno();

    @Test
    public void attributesTest(){
        Professor professor = TestHelper.testProfessor();
        Entidade entidade = TestHelper.testEntidade();
        Filiado filiado = TestHelper.testFiliado();
        aluno.setProfessor(professor);
        aluno.setEntidade(entidade);
        aluno.setFiliado(filiado);

        assertEquals(aluno.getProfessor(), professor);
        assertEquals(aluno.getEntidade(), entidade);
        assertEquals(aluno.getFiliado(), filiado);
    }

    @Test
    public void equalsTest(){
        Aluno testAluno = new Aluno();
        Professor professor = TestHelper.testProfessor();
        Entidade entidade = TestHelper.testEntidade();
        Filiado filiado = TestHelper.testFiliado();
        testAluno.setProfessor(professor);
        testAluno.setEntidade(entidade);
        testAluno.setFiliado(filiado);

        //objects can't be the same
        assertFalse(aluno.equals(testAluno));
    }

    @Test
    public void hashCodeTest(){
        aluno.setProfessor(TestHelper.testProfessor());
        aluno.setEntidade(TestHelper.testEntidade());
        aluno.setFiliado(TestHelper.testFiliado());

        int hashcode = aluno.hashCode();

        assertNotNull(hashcode);
    }

    @Test
    public void copyPropertiesTest(){
        Aluno alunoTest = new Aluno();
        alunoTest.setProfessor(TestHelper.testProfessor());
        alunoTest.setEntidade(TestHelper.testEntidade());
        alunoTest.setFiliado(TestHelper.testFiliado());

        aluno.copyProperties(alunoTest);

        assertEquals(alunoTest.getProfessor(), aluno.getProfessor());
        assertEquals(alunoTest.getEntidade(), aluno.getEntidade());
        assertEquals(alunoTest.getFiliado(), aluno.getFiliado());
    }
}
