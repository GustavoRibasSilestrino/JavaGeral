package exercicios.avancado;

/*
 * Exercício 22 — Generics
 * Nível: Avançado
 *
 * EXPLICAÇÃO:
 * Generics permitem criar classes e métodos que funcionam com
 * QUALQUER tipo, mantendo segurança de tipos em tempo de compilação.
 * Em vez de criar CaixaDeInteiro, CaixaDeString, etc., você cria uma
 * única classe Caixa<T>, onde T é substituído pelo tipo real na hora
 * de usar (Caixa<Integer>, Caixa<String>...).
 *
 * DESAFIO:
 * 1) Crie uma classe genérica Caixa<T> com um atributo "conteudo" (T),
 *    um método guardar(T item) e um método T pegar().
 * 2) Crie um método genérico estático <T> void trocar(T[] array, int i,
 *    int j) que troca dois elementos de posição em qualquer array de
 *    objetos.
 *
 * DICAS:
 * // dica 1: class Caixa<T> { private T conteudo; ... }
 * // dica 2: método genérico: static <T> void trocar(T[] array, int i, int j) { ... }
 * // dica 3: para trocar, use uma variável temporária:
 * //         T temp = array[i]; array[i] = array[j]; array[j] = temp;
 * // dica 4: generics não funcionam com tipos primitivos (int, double) —
 * //         use as versões "wrapper" (Integer, Double)
 *
 * SAÍDA ESPERADA (exemplo):
 * Caixa<String> guardando "Olá" -> pegar() retorna "Olá"
 * Caixa<Integer> guardando 42 -> pegar() retorna 42
 * trocar({1,2,3}, 0, 2) transforma o array em {3,2,1}
 */
public class Ex22_Generics {

    // TODO: crie a classe genérica Caixa<T>

    // TODO: crie o método genérico estático trocar(T[] array, int i, int j)

    public static void main(String[] args) {
        // TODO: teste Caixa<String> e Caixa<Integer>

        // TODO: teste trocar() com um array de Integer ou String
    }
}
