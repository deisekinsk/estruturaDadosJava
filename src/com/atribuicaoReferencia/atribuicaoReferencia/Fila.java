package com.atribuicaoReferencia.atribuicaoReferencia;

public class Fila {

    private Object conteudo; //object
    private Fila proximoConteudo; //refNo


    public Fila() {
    }


    public Fila(Object conteudo){
        this.proximoConteudo = null;
        this.conteudo = conteudo;
    }


    public Object getConteudo() {
        return this.conteudo;
    }

    public void setConteudo(Object conteudo) {
        this.conteudo = conteudo;
    }

    public Fila getProximoConteudo() {
        return this.proximoConteudo;
    }

    public void setProximoConteudo(Fila proximoConteudo) {
        this.proximoConteudo = proximoConteudo;
    }


    @Override
    public String toString() {
        return "{" + getConteudo() +
            "}";
    }


    
}
