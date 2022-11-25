package org.fpij.jitakyoei.model.business;

import org.fpij.jitakyoei.business.ProfessorEntidadeBOImpl;
import org.fpij.jitakyoei.model.TestHelper;
import org.fpij.jitakyoei.model.beans.ProfessorEntidade;
import org.junit.Test;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ProfessorEntidadeBOImplTest {

    ProfessorEntidadeBOImpl professorEntidadeBO = new ProfessorEntidadeBOImpl(TestHelper.testAppView());

    @Test
    public void createProfessorEntidadeTest() throws Exception {
        ProfessorEntidade professorEntidade = TestHelper.testProfessorEntidade();
        List<ProfessorEntidade> professorEntidadeList = new ArrayList<>();
        professorEntidadeList.add(professorEntidade);
        professorEntidadeBO.createProfessorEntidade(professorEntidadeList);
    }
}
