package com.atribuicaoReferencia.atribuicaoReferencia;

public class ExemploNo {
    private String conteudo;
    private ExemploNo proximoNo;


    public ExemploNo(String conteudo) {
        this.proximoNo = null;
        this.conteudo = conteudo;
    }


    public String getConteudo() {
        return this.conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public ExemploNo getProximoNo() {
        return this.proximoNo;
    }

    public void setProximoNo(ExemploNo proximoNo) {
        this.proximoNo = proximoNo;
    }


    @Override
    public String toString() {
        return "{" +
            " conteudo='" + getConteudo() + "'" +
            "}";
    }
    

    
}
