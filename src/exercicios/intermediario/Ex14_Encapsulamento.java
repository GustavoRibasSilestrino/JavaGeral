package exercicios.intermediario;

/*
 * Exercício 14 — Encapsulamento
 * Nível: Intermediário
 *
 * EXPLICAÇÃO:
 * Encapsulamento é "proteger" os atributos de uma classe, deixando-os
 * private, e controlando o acesso através de métodos públicos
 * (getters para ler, setters para escrever). Isso permite validar
 * dados antes de aceitá-los.
 *
 * DESAFIO:
 * Crie uma classe ContaBancaria com atributo privado "saldo" (double).
 * 1) getSaldo() — retorna o saldo.
 * 2) depositar(double valor) — soma ao saldo, mas rejeita valores <= 0
 *    (imprima uma mensagem de erro nesse caso, sem quebrar o programa).
 * 3) sacar(double valor) — subtrai do saldo, mas rejeita se o valor for
 *    maior que o saldo disponível ou <= 0.
 * Teste tentando depositar/sacar valores inválidos.
 *
 * DICAS:
 * // dica 1: private double saldo; (nunca deixe o atributo public)
 * // dica 2: no setter/depositar, sempre valide ANTES de alterar o atributo
 * // dica 3: esse exercício é a base para o "projeto final" mais à frente
 *
 * SAÍDA ESPERADA (exemplo, partindo de saldo = 0):
 * depositar(100) -> saldo: 100.0
 * depositar(-10) -> rejeitado (valor inválido), saldo continua 100.0
 * sacar(30) -> saldo: 70.0
 * sacar(1000) -> rejeitado (saldo insuficiente), saldo continua 70.0
 */
public class Ex14_Encapsulamento {

    static class ContaBancaria {
        private double saldo;

        // TODO: implemente getSaldo()

        // TODO: implemente depositar(double valor) com validação

        // TODO: implemente sacar(double valor) com validação
    }

    public static void main(String[] args) {
        // TODO: crie uma ContaBancaria e teste depósitos/saques válidos e inválidos
    }
}
