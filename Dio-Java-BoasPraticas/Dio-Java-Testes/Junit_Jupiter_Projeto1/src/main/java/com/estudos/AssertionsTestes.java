package com.estudos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

import java.time.LocalDate;

public class AssertionsTestes {
    @Test
    void validarLancamentos(){
        int[] p1Lancamento = {10,20,30,40,50};
        int[] p2Lancamento = {10,20,30,40,50};

        Assertions.assertArrayEquals(p1Lancamento, p2Lancamento);
    }

    @Test
    void validarObjNull(){
        Pessoa pessoa = null;
        Assertions.assertNull(pessoa);
    }

    @Test
    void validarPeloNome(){
        Pessoa will = new Pessoa("Will", LocalDate.of(2007, 1, 1));
        Assertions.assertTrue(will.getNome().equals("Will"));
        Assertions.assertEquals(10, 5+5);
    }
}
