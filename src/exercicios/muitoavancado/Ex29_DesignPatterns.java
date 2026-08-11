package exercicios.muitoavancado;

import java.util.ArrayList;
import java.util.List;

/*
 * Exercício 29 — Design Patterns: Singleton e Observer
 * Nível: Muito Avançado
 *
 * EXPLICAÇÃO:
 * Design patterns são soluções "batizadas" para problemas recorrentes
 * de design de software.
 * - Singleton: garante que uma classe tenha APENAS UMA instância em
 *   todo o programa (útil para configurações globais, conexões
 *   compartilhadas). Construtor privado + método estático getInstance().
 * - Observer: um objeto ("assunto") mantém uma lista de "observadores"
 *   e os notifica automaticamente quando algo muda (base de sistemas
 *   de eventos, notificações, GUIs).
 *
 * DESAFIO:
 * 1) Crie uma classe Configuracao (Singleton) com um atributo
 *    "modoDebug" (boolean). Garanta que só existe UMA instância,
 *    acessível via Configuracao.getInstance().
 * 2) Implemente Observer: uma interface Observador com o método
 *    notificar(String evento). Crie uma classe Publicador que mantém
 *    uma lista de Observadores, permite inscrever novos, e um método
 *    publicarEvento(String evento) que notifica todos.
 *    Crie 2 ou 3 observadores diferentes (ex: imprimem de formas
 *    diferentes) e teste publicando um evento.
 *
 * DICAS:
 * // dica 1: construtor privado impede "new Configuracao()" de fora da classe
 * // dica 2: private static Configuracao instancia; e getInstance() cria
 * //         a instância só na primeira chamada (lazy initialization)
 * // dica 3: interface Observador { void notificar(String evento); }
 * // dica 4: publicarEvento percorre a lista chamando notificar() em cada um
 *
 * SAÍDA ESPERADA:
 * Configuracao.getInstance() == Configuracao.getInstance() -> true (mesma instância)
 * publicarEvento("Novo pedido!") -> cada observador inscrito imprime sua
 * própria reação ao evento (você decide o texto de cada um)
 */
public class Ex29_DesignPatterns {

    // TODO: crie a classe Configuracao como Singleton

    // TODO: crie a interface Observador

    // TODO: crie a classe Publicador com lista de Observadores,
    // método inscrever(Observador o) e publicarEvento(String evento)

    public static void main(String[] args) {
        // TODO: teste o Singleton (mostre que getInstance() sempre
        // retorna o mesmo objeto)

        // TODO: teste o Observer com 2 ou 3 observadores diferentes
    }
}
