package exercicios.muitoavancado;

import java.util.ArrayList;
import java.util.List;

/*
 * Exercício 32 — Projeto Final: Mini Sistema Bancário
 * Nível: Muito Avançado (integrador)
 *
 * EXPLICAÇÃO:
 * Este exercício junta praticamente tudo que você praticou até aqui:
 * POO (classes, herança, encapsulamento, polimorfismo), coleções
 * (List), tratamento de exceções e boas práticas de organização de
 * código. É o tipo de exercício que aparece (de forma parecida) em
 * testes técnicos de vaga júnior/pleno.
 *
 * DESAFIO:
 * 1) Crie uma classe abstrata Conta com: numero (int), titular
 *    (String) e saldo privado (double). Métodos: depositar(double),
 *    sacar(double) (lança SaldoInsuficienteException se não houver
 *    saldo/limite), getSaldo().
 * 2) Crie ContaCorrente extends Conta, com um limiteChequeEspecial
 *    (double) — pode sacar até saldo + limite.
 * 3) Crie ContaPoupanca extends Conta, com um método
 *    aplicarRendimento(double taxaPercentual) que aumenta o saldo.
 *    ContaPoupanca NÃO pode ter saldo negativo em hipótese alguma.
 * 4) Crie uma classe Banco com uma List<Conta>, métodos
 *    abrirConta(Conta), buscarPorNumero(int) e
 *    calcularPatrimonioTotal() (soma o saldo de todas as contas).
 * 5) No main(), simule um cenário: abra 2-3 contas de tipos
 *    diferentes, faça depósitos/saques (incluindo pelo menos um que
 *    deveria falhar), aplique rendimento na poupança, e imprima o
 *    patrimônio total do banco ao final.
 *
 * DICAS:
 * // dica 1: reaproveite a exceção customizada do Exercício 21
 * //         (SaldoInsuficienteException), ou recrie uma aqui
 * // dica 2: em ContaCorrente, sacar() precisa de uma regra diferente
 * //         de ContaPoupanca — isso é polimorfismo na prática:
 * //         sobrescreva sacar() em cada subclasse com @Override
 * // dica 3: buscarPorNumero pode usar stream().filter(...).findFirst(),
 * //         ou um for tradicional com if — os dois são válidos
 * // dica 4: pense em qual método faz mais sentido ser abstrato na
 * //         classe Conta, e qual já pode vir implementado
 *
 * SAÍDA ESPERADA (exemplo — depende de como você montar o cenário):
 * ContaCorrente com limite de 200: consegue sacar até saldo + 200
 * ContaPoupanca: rendimento aumenta o saldo, nunca fica negativa
 * Uma tentativa de saque acima do limite deve lançar SaldoInsuficienteException
 * calcularPatrimonioTotal() deve ser a soma exata dos saldos de todas as contas abertas
 */
public class Ex32_ProjetoFinal {

    // TODO: crie a exceção SaldoInsuficienteException (ou reaproveite a do Ex21)

    // TODO: crie a classe abstrata Conta

    // TODO: crie ContaCorrente extends Conta

    // TODO: crie ContaPoupanca extends Conta

    static class Banco {
        private final List<Object> contas = new ArrayList<>(); // troque Object por Conta quando criar a classe

        // TODO: implemente abrirConta(Conta conta)

        // TODO: implemente buscarPorNumero(int numero)

        // TODO: implemente calcularPatrimonioTotal()
    }

    public static void main(String[] args) {
        // TODO: simule o cenário completo descrito no desafio
    }
}
