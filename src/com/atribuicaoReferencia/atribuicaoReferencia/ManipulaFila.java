package com.atribuicaoReferencia.atribuicaoReferencia;

public class ManipulaFila {

    private Fila conteudoEntrada; //refNoEntradaFila

    public ManipulaFila(){
        this.conteudoEntrada = null;

    }

    public Fila first(){
        if(!this.isEmpty()){
            Fila primeiroConteudo = conteudoEntrada;
            while(true){
                if(primeiroConteudo.getProximoConteudo() != null){
                    primeiroConteudo = primeiroConteudo.getProximoConteudo();
                }else{
                    break;
                }
            }

        }
        return null;
    }



    public void enqueue(Fila novoConteudo){
        novoConteudo.setProximoConteudo(conteudoEntrada);
        conteudoEntrada = novoConteudo;
    }

    public Fila dequeue(){
        if(!this.isEmpty()){
            Fila primeiroConteudo = conteudoEntrada;
            Fila armazenaConteudo = conteudoEntrada; //noAuxiliar

            while(true){
                if(primeiroConteudo.getProximoConteudo() != null){
                    armazenaConteudo = primeiroConteudo;
                    primeiroConteudo = primeiroConteudo.getProximoConteudo();
                }else{
                    armazenaConteudo.setProximoConteudo(null);
                    break;
                }
            }

            return primeiroConteudo;

        }
        return null;
    }


    public boolean isEmpty(){
        boolean verificaVazio = conteudoEntrada == null ? true : false;
        return verificaVazio;
    }
    
}
