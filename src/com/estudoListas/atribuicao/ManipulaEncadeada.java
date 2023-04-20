package com.estudoListas.atribuicao;

public class ManipulaEncadeada<T> {

    ListaEncadeada<T> referenciaEntrada;

    public ManipulaEncadeada(){ //ListaEncadeada
        this.referenciaEntrada = null;

    }

    public void add(T conteudo){
        ListaEncadeada<T> novoConteudo = new ListaEncadeada<>(conteudo);
        if(this.isEmpty()){
            referenciaEntrada = novoConteudo;
            return;
        }

        ListaEncadeada<T> conteudoAuxiliar = referenciaEntrada;
        //percorre cada índice
        for(int i = 0; i < this.size(); i++){
            conteudoAuxiliar = conteudoAuxiliar.getProximoNo();
        }

    }

    public T  get(int index){
        return getConteudo(index).getConteudo();
    }

    public  T remove(int index){
        ListaEncadeada<T> conteudoPivor = this.getConteudo(index);
        if(index == 0){
            referenciaEntrada = conteudoPivor.getProximoNo();
            return conteudoPivor.getConteudo();
        }

        ListaEncadeada<T> conteudoAnterior = getConteudo(index - 1);
        conteudoAnterior.setProximoNo(conteudoPivor.getProximoNo());
        return conteudoPivor.getConteudo();

    }
    

    private ListaEncadeada<T> getConteudo(int index){

        validaIndice(index);
        ListaEncadeada<T> conteudoAuxiliar = referenciaEntrada;
        ListaEncadeada<T> conteudoRetorno = null;
        for (int i = 0; i < this.size()-1; i++){
            conteudoRetorno = conteudoAuxiliar;
            conteudoAuxiliar = conteudoAuxiliar.getProximoNo();
        }

        return conteudoRetorno;

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

    public void validaIndice (int index){
        //null point exception

        if(index >= size()){
            int ultimoIndice = size() -1;
            throw new IndexOutOfBoundsException("Não possui conteúdo no index: " + index + "\n Último indice: " + ultimoIndice);
        }

    }

    public boolean isEmpty(){
        return referenciaEntrada == null ? true: false;
    }


    @Override
    public String toString() {
        String strRetorno = "";

        ListaEncadeada<T> conteudoAuxiliar = referenciaEntrada;
        for(int i = 0; i < this.size(); i++){
            strRetorno += "{" +
            " Lista Encadeada AQUI='" + conteudoAuxiliar.getConteudo() + "'" +
            "}";
          
            conteudoAuxiliar = conteudoAuxiliar.getProximoNo();

        }

        strRetorno += "null";

        return strRetorno;

    }

        
}
