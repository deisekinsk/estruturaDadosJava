package com.atribuicaoReferencia.atribuicaoReferencia;

public class ManipulaPilha {

    Pilha dadoPilha = null;

    
    public void push(Pilha novoDado){
        Pilha dadoReferencia = dadoPilha;
        dadoPilha = novoDado;
        dadoPilha.setProximoDado(dadoReferencia);
    }


    public Pilha pop(){
        if(!this.isEmpty()){
            Pilha mantemDado = dadoPilha;
            dadoPilha = dadoPilha.getProximoDado();
            return mantemDado;
        }
    
        return null;
    }


    public Pilha top(){
        return dadoPilha;
    }

    public boolean isEmpty(){
       //operador ternário
        return dadoPilha == null ? true : false;
        
    }


    @Override
    public String toString() {
        
        String manipulaPilha = "------------------\n";
        manipulaPilha += "Manipula Pilha\n";
        manipulaPilha += "------------------\n";

        Pilha armazenaDado = dadoPilha;

        while(true){
            if(armazenaDado != null){
                manipulaPilha += "[Pilha{dado="+ armazenaDado.getDado()+"}]\n";
                armazenaDado = armazenaDado.getProximoDado();
            }else{
                break;
            }
        }
        manipulaPilha += "--Fim do programa--\n";
        return manipulaPilha;
    }
    
}
