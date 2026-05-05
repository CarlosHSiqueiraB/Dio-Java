package com.estudos;

public class Main {
    public static void main(String[] args) {
    ReprodutorMusical AppleMusic = new ReprodutorMusical();
    AparelhoTelefonico N_Celular = new AparelhoTelefonico();
    Navegador Google = new Navegador();

    AppleMusic.setMusica("Titânio");
    AppleMusic.selecionarMusica("Titânio");

    N_Celular.setNumero("79991214304");
    N_Celular.ligar("79991214304");

    Google.setUrl("Youtube.com");
    Google.exibirPagina("Youtube.com");
 }
}