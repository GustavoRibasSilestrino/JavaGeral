package exercicios.muitoavancado;

/*
 * Exercício 31 — Lista Encadeada Própria (sem ArrayList)
 * Nível: Muito Avançado
 *
 * EXPLICAÇÃO:
 * Uma lista encadeada é formada por "nós" (No), cada um guardando um
 * valor e uma referência para o próximo nó. É a estrutura de dados
 * por trás de LinkedList, e entender como implementá-la do zero ajuda
 * MUITO a entender ponteiros/referências e estruturas mais complexas
 * (árvores, grafos).
 *
 * DESAFIO:
 * Implemente uma classe ListaEncadeada com:
 * 1) uma classe interna No (valor int + referência para o próximo No);
 * 2) adicionar(int valor) — adiciona no final da lista;
 * 3) remover(int valor) — remove a primeira ocorrência do valor;
 * 4) contem(int valor) — retorna true/false;
 * 5) imprimir() — imprime todos os valores em ordem, tipo [1, 2, 3].
 * Não use ArrayList nem LinkedList do Java — a ideia é implementar a
 * mecânica de "nó aponta pro próximo" você mesmo.
 *
 * DICAS:
 * // dica 1: class No { int valor; No proximo; No(int valor) { this.valor = valor; } }
 * // dica 2: mantenha uma referência "cabeca" (o primeiro nó da lista)
 * // dica 3: para adicionar no final, percorra até achar um nó cujo
 * //         "proximo" seja null, e aponte ele para o novo nó
 * // dica 4: para remover, você precisa "pular" o nó indesejado —
 * //         o nó anterior passa a apontar direto para o nó seguinte ao removido
 * //         (cuidado com o caso especial de remover a cabeça da lista)
 *
 * SAÍDA ESPERADA (exemplo, adicionando 10, 20, 30, depois removendo 20):
 * [10, 20, 30]
 * contem(20) antes de remover: true
 * [10, 30]
 * contem(20) depois de remover: false
 */
public class Ex31_ListaEncadeada {

    static class ListaEncadeada {
        static class No {
            int valor;
            No proximo;

            No(int valor) {
                this.valor = valor;
            }
        }

        private No cabeca;

        // TODO: implemente adicionar(int valor)

        // TODO: implemente remover(int valor)

        // TODO: implemente contem(int valor)

        // TODO: implemente imprimir()
    }

    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();

        // TODO: adicione alguns valores, imprima, remova um valor,
        // imprima de novo, e teste contem()
    }
}
