package com.estudos;
//abstract = abstração, usado para executar a mesma ação de diferentes formas
public abstract class Funcionario {
    //Herança
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public abstract void chamar();
}
