package com.estudos;

public class Navegador {
    private String url;

    public String getUrl(){
        return url;
    }

    public void setUrl(String url){
        this.url = url;
    }

    public void exibirPagina(String url){
        System.out.println("Exibindo página web");
        adicionarNovaAba();
        atualizarPagina();

    }

    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba");
    }

    public void atualizarPagina(){
        System.out.println("Atualizando a página");
    }
}
