package com.estudos.springrestapi.handle;

public class BusinessException extends RuntimeException{
    public BusinessException(String mensagem){
        super(mensagem);
    }

    public BusinessException(String mensagem, Object ... params) { // Mensagens de forma dinâmica
        super(String.format(mensagem, params));
    }
}
