package exercicios.avancado;

import java.util.ArrayDeque;
import java.util.Deque;

/*
 * Exercício 27 — Pilhas e Filas (com Deque)
 * Nível: Avançado
 *
 * EXPLICAÇÃO:
 * Pilha (Stack, LIFO — último a entrar é o primeiro a sair) e Fila
 * (Queue, FIFO — primeiro a entrar é o primeiro a sair) são
 * estruturas fundamentais. Em Java, ArrayDeque implementa ambas de
 * forma eficiente: push/pop para pilha, offer/poll para fila.
 *
 * DESAFIO:
 * 1) Use uma pilha (Deque com push/pop) para verificar se uma string
 *    de parênteses está balanceada. Ex: "(()())" é válida, "(()" não é.
 *    Regra: para cada '(' você empilha; para cada ')' você desempilha
 *    — se a pilha estiver vazia na hora de desempilhar, é inválido; no
 *    fim, a pilha precisa estar vazia.
 * 2) Use uma fila (Deque com offer/poll) para simular uma fila de
 *    atendimento: adicione 5 "clientes" (Strings com nomes) e atenda-os
 *    na ordem de chegada, imprimindo quem está sendo atendido.
 *
 * DICAS:
 * // dica 1: Deque<Character> pilha = new ArrayDeque<>();
 * // dica 2: pilha.push('('); pilha.pop(); pilha.isEmpty();
 * // dica 3: Deque<String> fila = new ArrayDeque<>();
 * //         fila.offer("Cliente 1"); fila.poll();
 *
 * SAÍDA ESPERADA (para "(()())" e "(()"):
 * "(()())" balanceado? true
 * "(()" balanceado? false
 * (extra) fila atendendo 5 clientes na ordem em que foram adicionados
 * Dica: rode exercicios/testes/TesteAutomatico.java para conferência automática!
 */
public class Ex27_EstruturasDados {

    // public para que o TesteAutomatico em exercicios.testes consiga chamar este método
    public static boolean parenteseBalanceado(String texto) {
        // TODO: implemente usando uma pilha (Deque)
        throw new UnsupportedOperationException("TODO: implemente parenteseBalanceado");
    }

    public static void main(String[] args) {
        // TODO: teste parenteseBalanceado com "(()())" (true) e "(()" (false)

        Deque<String> filaAtendimento = new ArrayDeque<>();
        // TODO: adicione 5 clientes e atenda-os na ordem de chegada
    }
}
