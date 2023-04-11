package com.atribuicaoReferencia.atribuicaoReferencia;

public class Fila<T> {

    private T conteudo; //object
    private Fila<T> proximoConteudo; //refNo


    public Fila() {
    }


    public Fila(T conteudo){
        this.proximoConteudo = null;
        this.conteudo = conteudo;
    }


    public T getConteudo() {
        return this.conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public Fila<T> getProximoConteudo() {
        return this.proximoConteudo;
    }

    public void setProximoConteudo(Fila<T> proximoConteudo) {
        this.proximoConteudo = proximoConteudo;
    }


    @Override
    public String toString() {
        return "{" + getConteudo() +
            "}";
    }


    
}
