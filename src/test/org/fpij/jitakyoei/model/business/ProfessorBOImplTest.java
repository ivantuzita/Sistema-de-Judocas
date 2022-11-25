package org.fpij.jitakyoei.model.business;

import org.fpij.jitakyoei.business.AlunoBOImpl;
import org.fpij.jitakyoei.business.ProfessorBOImpl;
import org.fpij.jitakyoei.model.TestHelper;
import org.fpij.jitakyoei.model.beans.Aluno;
import org.fpij.jitakyoei.model.beans.Entidade;
import org.fpij.jitakyoei.model.beans.Filiado;
import org.fpij.jitakyoei.model.beans.Professor;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ProfessorBOImplTest {

    ProfessorBOImpl professorBO = new ProfessorBOImpl(TestHelper.testAppView());

    @Test
    public void createProfessorTest() throws Exception {
        Professor professor = TestHelper.testProfessor();
        professorBO.createProfessor(professor);

        Professor professorTest = professorBO.searchProfessor(professor).get(0);
        //o aluno criado é o mesmo aluno na base de dados?
        assertEquals(professor, professorTest);
    }

    @Test
    public void updateProfessorTest() throws Exception {
        Filiado filiado = TestHelper.testFiliado();
        filiado.setNome("Marcola");
        Professor oldProfessor = professorBO.listAll().get(0);
        oldProfessor.setFiliado(filiado);
        professorBO.updateProfessor(oldProfessor);

        assertEquals(professorBO.listAll().get(0), oldProfessor);
    }
}
