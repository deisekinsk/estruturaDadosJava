import com.atribuicaoReferencia.atribuicaoReferencia.ExemploNo;
import com.atribuicaoReferencia.atribuicaoReferencia.atribuicaoReferencia;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("***Esturura de Dados***\n");
        //cria objeto
        
        com.atribuicaoReferencia.atribuicaoReferencia.atribuicaoReferencia atribuicaoReferencia = new atribuicaoReferencia(0);

        com.atribuicaoReferencia.atribuicaoReferencia.atribuicaoReferencia objetoB = atribuicaoReferencia;

        ExemploNo exemploNo = new ExemploNo("Primeiro Dado");
        ExemploNo exemploNo2 = new ExemploNo("Segundo Dado");
        ExemploNo exemploNo3 = new ExemploNo("Terceiro Dado");



        //chama metodo
        atribuicaoReferencia.impressaoVariavel();
        System.out.println("\nObjetos Inteiros:\n"+atribuicaoReferencia+","+objetoB);
        atribuicaoReferencia.setObjeto(5);
        System.out.println(atribuicaoReferencia+","+objetoB);
        
        exemploNo.setProximoNo(exemploNo2);
        exemploNo2.setProximoNo(exemploNo3);
        
        System.out.println(exemploNo);
        System.out.println(exemploNo.getProximoNo());
        System.out.println(exemploNo.getProximoNo().getProximoNo());
        System.out.println(exemploNo.getProximoNo().getProximoNo().getProximoNo());


    }
}
