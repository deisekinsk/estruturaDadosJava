import com.atribuicaoReferencia.atribuicaoReferencia.ExemploNo;
import com.atribuicaoReferencia.atribuicaoReferencia.Fila;
import com.atribuicaoReferencia.atribuicaoReferencia.ManipulaFila;
import com.atribuicaoReferencia.atribuicaoReferencia.ManipulaPilha;
import com.atribuicaoReferencia.atribuicaoReferencia.Pilha;
import com.atribuicaoReferencia.atribuicaoReferencia.atribuicaoReferencia;
import com.estudoListas.atribuicao.ListaEncadeada;
import com.estudoListas.atribuicao.ManipulaEncadeada;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("***Esturura de Dados***\n");
        // cria objet, instancia

        atribuicaoReferencia atribuicaoReferencia = new atribuicaoReferencia(0);

        atribuicaoReferencia objetoB = atribuicaoReferencia;

        ExemploNo<String> exemploNo = new ExemploNo<String>("Primeiro Dado");
        ExemploNo<String> exemploNo2 = new ExemploNo<String>("Segundo Dado");
        ExemploNo<String> exemploNo3 = new ExemploNo<String>("Terceiro Dado");
        // Erro na compilação. Pois o encadeamento já iniciou com o tipo String.
        // ExemploNo<Integer> exemploNo4 = new ExemploNo<Integer>(5);

        ManipulaPilha manipulaPilha = new ManipulaPilha();

        ManipulaFila<String> manipulaFila = new ManipulaFila<>(); // minhaFila

        ManipulaEncadeada<String> listaEncadeada = new ManipulaEncadeada<>();

        // chama metodo
        atribuicaoReferencia.impressaoVariavel();

        System.out.println("\nObjetos Inteiros:\n" + atribuicaoReferencia + "," + objetoB);

        atribuicaoReferencia.setObjeto(5);

        System.out.println(atribuicaoReferencia + "," + objetoB);

        exemploNo.setProximoNo(exemploNo2);
        exemploNo2.setProximoNo(exemploNo3);

        System.out.println(exemploNo);
        System.out.println(exemploNo.getProximoNo());
        System.out.println(exemploNo.getProximoNo().getProximoNo());
        System.out.println(exemploNo.getProximoNo().getProximoNo().getProximoNo());

        manipulaPilha.push(new Pilha(1));
        manipulaPilha.push(new Pilha(2));
        manipulaPilha.push(new Pilha(3));
        manipulaPilha.push(new Pilha(4));

        System.out.println(manipulaPilha);
        System.out.println("manipulaPilha.pop(): " + manipulaPilha.pop());
        System.out.println(manipulaPilha);

        manipulaPilha.push(new Pilha(99));

        System.out.println(manipulaPilha);

        System.out.println("-----------------\nManipula Fila\n-----------------");

        manipulaFila.enqueue("Chimamanda");
        manipulaFila.enqueue("Dandara");
        manipulaFila.enqueue("Xica Da Silva");
        manipulaFila.enqueue("Elza Soares");

        System.out.println("Conteúdo da fila=" + manipulaFila);
        System.out.println("manipulaFila.dequeue(): " + manipulaFila.dequeue());
        System.out.println("Conteúdo da fila=" + manipulaFila);
        manipulaFila.enqueue("Nina Simone");
        System.out.println("Conteúdo da fila=" + manipulaFila);

        System.out.println("manipulaFila.first();: " + manipulaFila.first());
        System.out.println("Conteúdo da fila=" + manipulaFila);

        listaEncadeada.Print();

        listaEncadeada.add("Volume 1");
        listaEncadeada.add("Volume 2");
        listaEncadeada.add("Volume 3");
        listaEncadeada.add("Volume 4");

        System.out.println(listaEncadeada.get(0));
        System.out.println(listaEncadeada.get(1));
        System.out.println(listaEncadeada.get(2));
        System.out.println(listaEncadeada.get(3));

        System.out.println(listaEncadeada);
        listaEncadeada.remove(3);
        System.out.println(listaEncadeada);


    }
}
