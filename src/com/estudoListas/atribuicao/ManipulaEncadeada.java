package com.estudoListas.atribuicao;

public class ManipulaEncadeada<T> {

    ListaEncadeada<T> referenciaEntrada;

    public ManipulaEncadeada(){ //ListaEncadeada
        this.referenciaEntrada = null;
    }

    public int size(){
        int tamanhoLista = 0;
        ListaEncadeada<T> referenciaAux = referenciaEntrada;
        while(true){
            if(referenciaAux != null){
                tamanhoLista++;
                if(referenciaAux.getProximoNo() != null){
                    referenciaAux = referenciaAux.getProximoNo();
                }else{
                    break;
                }
            }else{
                break;
            }
        }

        return tamanhoLista;
    }

    public boolean isEmpty(){
        return referenciaEntrada == null ? true: false;
    }
    
}
