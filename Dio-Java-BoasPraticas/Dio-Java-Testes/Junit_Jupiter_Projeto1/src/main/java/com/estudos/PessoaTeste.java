package com.estudos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTeste {
    @Test
    void validarIdade(){
        Pessoa pessoa = new Pessoa("Julio", LocalDate.of(2020, 1, 1));
        Assertions.assertEquals(6, pessoa.getIdade());
    }

    @Test
    void ValidMaiorIdade(){
        Pessoa pessoa = new Pessoa("Julio", LocalDate.of(2020, 1, 1));
        Assertions.assertFalse(pessoa.eMaiorIdade());
    }
}
