package com.estudos;

public class ReprodutorMusical {
    private String musica;

    public String getMusica(){
        return musica;
    }

    public void setMusica(String musica){
        this.musica = musica;
    }

    public void selecionarMusica(String musica){
        System.out.println("A música foi Selecionada!");
        tocar();
        pausar();
    }

    public void tocar() {
        System.out.println("Tocando a música!");
    }

    public void pausar(){
        System.out.println("Pausando a música!");
    }
}
