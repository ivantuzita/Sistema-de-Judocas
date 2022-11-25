package org.fpij.jitakyoei.model;

import org.fpij.jitakyoei.facade.AppFacade;
import org.fpij.jitakyoei.model.beans.*;
import org.fpij.jitakyoei.view.AppView;

import java.util.Date;
import java.util.Random;

public class TestHelper {

    public static AppView testAppView() {
        return new AppView() {
            @Override
            public void handleModelChange(Object obj) {
            }

            @Override
            public void displayException(Exception e) {
            }

            @Override
            public void registerFacade(AppFacade facade) {
            }
        };
    }

    public static ProfessorEntidade testProfessorEntidade() {
        return new ProfessorEntidade(
                TestHelper.testProfessor(),
                TestHelper.testEntidade()
        );
    }

    public static Filiado testFiliado() {
        Filiado filiado = new Filiado();
        filiado.setId(new Random().nextLong());
        filiado.setNome("Gilberto Santos");
        filiado.setRegistroCbj("123-222-44.22");
        filiado.setDataNascimento(new Date());
        filiado.setDataCadastro(new Date());
        filiado.setTelefone1("(00) 2222-3333");
        filiado.setEmail("jowjow@gmail.com");
        filiado.setCpf("036.464.453-27");
        Endereco endereco = new Endereco();
        endereco.setBairro("Vila Natalina");
        endereco.setCep("66522-543");
        endereco.setCidade("Polo Norte");
        endereco.setEstado("Polo Sul");
        endereco.setRua("Rua Papai Noel");
        filiado.setEndereco(endereco);
        return filiado;
    }

    public static Professor testProfessor() {
        Professor professor = new Professor();
        professor.setFiliado(TestHelper.testFiliado());
        return professor;
    }

    public static Entidade testEntidade() {
        Entidade entidade = new Entidade();
        Endereco endereco = new Endereco();
        endereco.setBairro("Vila Natalina");
        endereco.setCep("66522-543");
        endereco.setCidade("Polo Norte");
        endereco.setEstado("Polo Sul");
        endereco.setRua("Rua Papai Noel");
        entidade.setEndereco(endereco);
        entidade.setNome("Centro Universitário FEI");
        entidade.setTelefone1("(00) 2222-3333");
        return entidade;
    }

    public static Aluno testAluno() {
        Aluno aluno = new Aluno();
        aluno.setFiliado(TestHelper.testFiliado());
        aluno.setEntidade(TestHelper.testEntidade());
        aluno.setProfessor(TestHelper.testProfessor());
        return aluno;
    }

}