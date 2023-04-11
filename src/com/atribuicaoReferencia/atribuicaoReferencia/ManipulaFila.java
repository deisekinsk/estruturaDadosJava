package com.atribuicaoReferencia.atribuicaoReferencia;

public class ManipulaFila<T> {

    private Fila<T> conteudoEntrada; //refNoEntradaFila

    public ManipulaFila(){
        this.conteudoEntrada = null;

    }

    public T first(){
        if(!this.isEmpty()){
            Fila<T> primeiroConteudo = conteudoEntrada;
            while(true){
                if(primeiroConteudo.getProximoConteudo() != null){
                    primeiroConteudo = primeiroConteudo.getProximoConteudo();
                }else{
                    break;
                }
            }
            return primeiroConteudo.getConteudo();

        }
        return null;
    }

    public void enqueue(T recebeConteudo){
        Fila<T> novoConteudo = new Fila(recebeConteudo);
        novoConteudo.setProximoConteudo(conteudoEntrada);
        conteudoEntrada = novoConteudo;
    }

    public T dequeue(){
        if(!this.isEmpty()){
            Fila<T> primeiroConteudo = conteudoEntrada;
            Fila<T> armazenaConteudo = conteudoEntrada; //noAuxiliar

            while(true){
                if(primeiroConteudo.getProximoConteudo() != null){
                    armazenaConteudo = primeiroConteudo;
                    primeiroConteudo = primeiroConteudo.getProximoConteudo();
                }else{
                    armazenaConteudo.setProximoConteudo(null);
                    break;
                }
            }
            //casting (T)
            return primeiroConteudo.getConteudo();

        }
        return null;
    }


    public boolean isEmpty(){
        boolean verificaVazio = conteudoEntrada == null ? true : false;
        return verificaVazio;
    }



    @Override
    public String toString() {
        String imprimiFila = "";
        
        Fila<T> armazenaConteudo = conteudoEntrada;

            if(conteudoEntrada != null){
                while(true){
                   imprimiFila += armazenaConteudo;
                   //teste se tem apenas um elemento na fila
                   if(armazenaConteudo.getProximoConteudo() != null){
                    armazenaConteudo = armazenaConteudo.getProximoConteudo();
                   }else{
                    imprimiFila += "null";
                    break;
                   }
                }

            }else{
                imprimiFila = "null";
            }

        return imprimiFila;
    }

    
    
}
