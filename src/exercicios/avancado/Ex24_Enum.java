package exercicios.avancado;

/*
 * Exercício 24 — Enums
 * Nível: Avançado
 *
 * EXPLICAÇÃO:
 * Enum define um conjunto FIXO de valores possíveis (ex: dias da
 * semana, status de um pedido). É mais seguro que usar Strings ou
 * números "soltos", porque o compilador impede valores inválidos.
 * Enums em Java também podem ter atributos e métodos.
 *
 * DESAFIO:
 * Crie um enum StatusPedido com os valores: PENDENTE, EM_PREPARO,
 * ENVIADO, ENTREGUE, CANCELADO. Adicione um método
 * podeSerCancelado() que retorna true apenas se o status for PENDENTE
 * ou EM_PREPARO. No main(), teste esse método para cada valor do enum.
 *
 * DICAS:
 * // dica 1: enum StatusPedido { PENDENTE, EM_PREPARO, ENVIADO, ENTREGUE, CANCELADO; }
 * // dica 2: dentro do enum, você pode definir métodos normalmente,
 * //         como se fosse uma classe
 * // dica 3: para percorrer todos os valores: StatusPedido.values()
 * // dica 4: switch funciona muito bem com enums:
 * //         switch (status) { case PENDENTE, EM_PREPARO -> ... }
 *
 * SAÍDA ESPERADA:
 * PENDENTE -> pode ser cancelado: true
 * EM_PREPARO -> pode ser cancelado: true
 * ENVIADO -> pode ser cancelado: false
 * ENTREGUE -> pode ser cancelado: false
 * CANCELADO -> pode ser cancelado: false
 */
public class Ex24_Enum {

    // TODO: crie o enum StatusPedido com o método podeSerCancelado()

    public static void main(String[] args) {
        // TODO: percorra StatusPedido.values() e imprima se cada um
        // pode ser cancelado
    }
}
