package org.fpij.jitakyoei.model.business;

import org.fpij.jitakyoei.business.EntidadeBOImpl;
import org.fpij.jitakyoei.model.TestHelper;
import org.fpij.jitakyoei.model.beans.Aluno;
import org.fpij.jitakyoei.model.beans.Entidade;
import org.fpij.jitakyoei.model.beans.Filiado;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class EntidadeBOImplTest {

    EntidadeBOImpl entidadeBO = new EntidadeBOImpl(TestHelper.testAppView());

    @Test
    public void createEntidadeTest() throws Exception {
        Entidade entidade = TestHelper.testEntidade();
        entidadeBO.createEntidade(entidade);

        Entidade entidadeTest = entidadeBO.searchEntidade(entidade).get(0);
        //a entidade criada é o mesma da base de dados?
        assertEquals(entidade, entidadeTest);
    }

    @Test
    public void updateEntidadeTest() throws Exception{
        Entidade entidade = entidadeBO.listAll().get(0);
        entidade.setNome("PUC");
        entidadeBO.updateEntidade(entidade);

        List<Entidade> entidadeTest = entidadeBO.listAll();
        assertEquals(entidade, entidadeTest.get(0));
    }

}
