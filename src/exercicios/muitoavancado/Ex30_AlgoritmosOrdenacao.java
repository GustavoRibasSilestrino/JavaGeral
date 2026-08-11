package exercicios.muitoavancado;

import java.util.Arrays;

/*
 * Exercício 30 — Algoritmos de Ordenação e Busca (na mão)
 * Nível: Muito Avançado
 *
 * EXPLICAÇÃO:
 * Usar Arrays.sort() no dia a dia é ótimo, mas entender COMO a
 * ordenação funciona por dentro é fundamental para entrevistas e para
 * entender complexidade (Big O). Bubble sort é o mais simples
 * (O(n²)): compara pares vizinhos e troca se estiverem fora de ordem,
 * repetindo até não haver mais trocas. Busca binária (O(log n)) só
 * funciona em array JÁ ORDENADO: compara com o meio e descarta metade
 * do array a cada passo.
 *
 * DESAFIO:
 * 1) Implemente bubbleSort(int[] array) manualmente (sem usar
 *    Arrays.sort), ordenando em ordem crescente.
 * 2) Implemente buscaBinaria(int[] arrayOrdenado, int alvo), que
 *    retorna o índice do valor ou -1 se não encontrar.
 * 3) Desafio extra: implemente insertionSort(int[] array) também, e
 *    compare mentalmente com o bubbleSort — qual você acha mais
 *    eficiente na prática, e por quê?
 *
 * DICAS:
 * // dica 1: bubble sort tem 2 loops aninhados; se n-1 iterações
 * //         passarem sem trocas, o array já está ordenado (otimização opcional)
 * // dica 2: busca binária: int meio = (inicio + fim) / 2; compare
 * //         arrayOrdenado[meio] com o alvo e ajuste inicio/fim
 * // dica 3: use Arrays.toString(array) para imprimir arrays facilmente
 *
 * SAÍDA ESPERADA (para o array de exemplo {9,3,7,1,8,2,5,4,6}):
 * Ordenado: [1, 2, 3, 4, 5, 6, 7, 8, 9]
 * buscaBinaria(ordenado, 5) = índice 4
 * buscaBinaria(ordenado, 100) = -1 (não existe)
 * Dica: rode exercicios/testes/TesteAutomatico.java para conferência automática!
 */
public class Ex30_AlgoritmosOrdenacao {

    // public para que o TesteAutomatico em exercicios.testes consiga chamar este método
    public static void bubbleSort(int[] array) {
        // TODO: implemente bubble sort
        throw new UnsupportedOperationException("TODO: implemente bubbleSort");
    }

    public static int buscaBinaria(int[] arrayOrdenado, int alvo) {
        // TODO: implemente busca binária
        throw new UnsupportedOperationException("TODO: implemente buscaBinaria");
    }

    // TODO (extra): implemente insertionSort(int[] array)
    public static void insertionSort(int[] array) {
        throw new UnsupportedOperationException("TODO: implemente insertionSort");
    }

    public static void main(String[] args) {
        int[] numeros = {9, 3, 7, 1, 8, 2, 5, 4, 6};

        // TODO: ordene "numeros" com bubbleSort e imprima o resultado

        // TODO: procure alguns valores com buscaBinaria (lembre-se: o
        // array precisa estar ordenado antes de buscar!)
    }
}
