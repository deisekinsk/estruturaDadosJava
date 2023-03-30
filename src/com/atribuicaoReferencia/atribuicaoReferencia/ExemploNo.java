package com.atribuicaoReferencia.atribuicaoReferencia;

public class ExemploNo<T> {
    private T conteudo;
    private ExemploNo<T> proximoNo;


    public ExemploNo(T conteudo) {
        this.proximoNo = null;
        this.conteudo = conteudo;
    }


    public T getConteudo() {
        return this.conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public ExemploNo<T> getProximoNo() {
        return this.proximoNo;
    }

    public void setProximoNo(ExemploNo<T> proximoNo) {
        this.proximoNo = proximoNo;
    }


    @Override
    public String toString() {
        return "{" +
            " conteudo='" + getConteudo() + "'" +
            "}";
    }
    

    
}
