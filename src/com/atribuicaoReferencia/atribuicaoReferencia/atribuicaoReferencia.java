package com.atribuicaoReferencia.atribuicaoReferencia;

public class atribuicaoReferencia {

    Integer objetoInteiro;


    public atribuicaoReferencia(Integer objetoInteiro) {
        this.objetoInteiro = objetoInteiro;
    }

    
    public void impressaoVariavel(){
        int numeroA = 1;
        int numeroB = numeroA;
        System.out.println("NumeroA="+numeroA+" NumeroB="+numeroB);
        numeroA = 2;
        System.out.println("NumeroA="+numeroA+" NumeroB="+numeroB);

    }


    public void setObjeto(Integer objetoInteiro) {
        this.objetoInteiro = objetoInteiro;
        
    }
    
    //toString
    @Override
    public String toString() {
        return this.objetoInteiro.toString();
    }
}
