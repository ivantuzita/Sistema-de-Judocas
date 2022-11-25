package org.fpij.jitakyoei.model.business;

import org.fpij.jitakyoei.business.AlunoBOImpl;
import org.fpij.jitakyoei.model.TestHelper;
import org.fpij.jitakyoei.model.beans.Aluno;
import org.fpij.jitakyoei.model.beans.Filiado;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class AlunoBOImplTest {

    AlunoBOImpl alunoBO = new AlunoBOImpl(TestHelper.testAppView());

    @Test
    public void createAlunoTest() throws Exception {
        Aluno aluno = TestHelper.testAluno();
        alunoBO.createAluno(aluno);

        Aluno alunoTest = alunoBO.searchAluno(aluno).get(0);
        //o aluno criado é o mesmo aluno na base de dados?
        assertEquals(aluno, alunoTest);
    }

    @Test
    public void updateAlunoTest() throws Exception {
        Filiado filiado = TestHelper.testFiliado();
        filiado.setNome("Gilberto");
        Aluno oldAluno = alunoBO.listAll().get(0);
        oldAluno.setFiliado(filiado);
        alunoBO.updateAluno(oldAluno);

        assertEquals(alunoBO.listAll().get(0), oldAluno);
    }

}
