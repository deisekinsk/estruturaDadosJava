## Estrutura de Dados

Como se estrutura os dados no computador?
Os dados em variáveis seja um número inteiro, ou valor booleano, são armazenados em bit. Bit é um valor de memória.

Memória primária: Não mantém os dados na ausência de energia. Exemplo: Memória RAM. A memória RAM possui chips que podem manter milhões de bits de informações. 

Memória secundária: Memória que mantém os dados, mesmo na ausência de energia.

## Atribuição e Referência

Nostipos primitivos, as atribuições são por cópia do valor > com o tipo primitivo, o valor é copiado em memória.
Em objetos, é copiado o valor de referência de memória (sem duplicar o objeto). Ou se ja, objeto aponta para o mesmo endereço de memória.

### Tipos de Dados em Java X Memória consumida

| Tipo | Memória Consumida |
| --- | --- |
| `boolean` | 1 bit |
| `byte` | 1 byte |
| `char` | 2 bytes |
| `short` | 2 bytes |
| `int` | 4 bytes |
| `float` | 4 bytes |
| `long` | 8 bytes |
| `double` | 8 bytes |

## Generics
O uso de Generics é recomendado para evitar casting excessivo e códigos redundades. E ajuda a encontrar erros em tempo de compilação e é utilizado desde a versão Java SE 5.0.
>Lista<String> minhaLista = new Lista<>();

>public class Lista<T>{
>    private T t;
>}
### Wildcards

-Unknown Wildcard > List<?>
>public void imprimiLista(List<?> listaPessoas){
    >for(Pessoa p : listaPessoas){
        >System.out.println(p);
    >}
>}
>Lista<Aluno> minhaLista = new Lista<Aluno>();
>imprimiLista(minhaLista);

-UpperBounded Wildcard > List ? extends Objeto
>public void imprimiLista(List<? extends Pessoa> listaPessoas){
    >for(Pessoa p : listaPessoas){
        >System.out.println(p);
    >}
>}
>Lista<Aluno> minhaLista = new Lista<Aluno>();
>imprimiLista(minhaLista);

-LowerBounded Wildcard > List ? super Objeto
>public void imprimiLista(List<? super Pessoa> listaPessoas){
    >for(Pessoa p : listaPessoas){
        >System.out.println(p);
    >}
>}
>Lista<Aluno> minhaLista = new Lista<Aluno>();
>imprimiLista(minhaLista);

- Convenção de valores
K=KEY e V=Value > Map<K,V>;
E=Element > List<E>;
T=Type > Collectiions#addAll;
?= Genérico;
## Pilha
LIFO - Last in, First Out
- Métodos de manipulação de Pilhas
`top();` Copia informação do primeio nó da pilha 
`pop();` Retira informação do primeiro nó da pilha
`push();` Insire informação do primeiro nó da pilha
`isEmpty();` Verifica se a referência da pilha é vazia

## Referências
- Lógica de Programação e Estrutura de Dados. Sandra Paga e Gerson Risseti. Pearson.
- Estrutrua de DAdps Fundamentais - Conceitos e Aplicações. Silvio Pereira
- Java SE 8 Programmer I - O guia para sua certificação Oracle Certified Associate. Casa do Código


##### Notas
Java, configurações de variáveis de ambiente.

## Formatação de arquivo .md

- `src`: the folder to maintain sources
[here](https://github.com/deisekinsk/condicionalJava).
> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.
