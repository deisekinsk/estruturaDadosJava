package com.atribuicaoReferencia.atribuicaoReferencia;

public class Pilha {

        private int dado;
        private Pilha proximoDado = null;


    public Pilha() {
    }

    public Pilha(int dado) {
        this.dado = dado;
    }


    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public Pilha getProximoDado() {
        return this.proximoDado;
    }

    public void setProximoDado(Pilha proximoDado) {
        this.proximoDado = proximoDado;
    }



    @Override
    public String toString() {
        return "{" +
            " dado='" + dado + "'" +
            "}";
    }


    
    
}
