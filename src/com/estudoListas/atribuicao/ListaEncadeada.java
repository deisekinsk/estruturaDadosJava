package com.estudoListas.atribuicao;

public class ListaEncadeada<T> {

    public void Print(){
        System.out.println("-----------------\nLista Encadeada\n-----------------");

    }

    private T conteudo;
    private ListaEncadeada proximoNo;

    public ListaEncadeada(){
        this.proximoNo = null;

    }

    public ListaEncadeada(T conteudo){
        this.proximoNo = null;
        this.conteudo = conteudo;
    }


    public ListaEncadeada(T conteudo, ListaEncadeada proximoNo) {
        this.conteudo = conteudo;
        this.proximoNo = proximoNo;
    }


    public T getConteudo() {
        return this.conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public ListaEncadeada getProximoNo() {
        return this.proximoNo;
    }

    public void setProximoNo(ListaEncadeada proximoNo) {
        this.proximoNo = proximoNo;
    }


    @Override
    public String toString() {
        return "{" +
            " Conteudo='" + getConteudo() + "'" +
            "}";
    }

    public String toStringEncadeado(){
        String str =  " Conteudo='" + getConteudo() + "'" +
        "}";
        
        if(proximoNo != null){
            str += "->" + proximoNo.toString();
        }else{
            str += "->null";
        }

        return str;
    }


    
}
