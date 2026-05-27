package com.estudos.beansvscomponents;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //Situação para usar component: Quando o código for um componente que será escaneado da aplicação, e quando termos acesso direto a seu código fonte
public class ConversorJson {

    @Autowired
    private Gson gson;

    public ViaCepResponse converter(String json ){
        ViaCepResponse response = gson.fromJson(json,ViaCepResponse.class);
        return response;
    }
}
