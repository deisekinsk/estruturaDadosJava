import com.atribuicaoReferencia.atribuicaoReferencia.atribuicaoReferencia;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Esturura de Dados");
        //cria objeto
        
        com.atribuicaoReferencia.atribuicaoReferencia.atribuicaoReferencia atribuicaoReferencia = new atribuicaoReferencia(0);

        com.atribuicaoReferencia.atribuicaoReferencia.atribuicaoReferencia objetoB = atribuicaoReferencia;

        //chama metodo
        atribuicaoReferencia.impressaoVariavel();
        System.out.println(atribuicaoReferencia+","+objetoB);
        atribuicaoReferencia.setObjeto(5);
        System.out.println(atribuicaoReferencia+","+objetoB);

    }
}
