package exercicios.intermediario;

/*
 * Exercício 18 — Interfaces
 * Nível: Intermediário
 *
 * EXPLICAÇÃO:
 * Uma interface define um "contrato" de métodos que qualquer classe
 * que a implementa é OBRIGADA a fornecer. Diferente de herança
 * (extends, uma só superclasse), uma classe pode implementar VÁRIAS
 * interfaces ao mesmo tempo (implements).
 *
 * DESAFIO:
 * Crie uma interface Pagavel com o método calcularPagamento() que
 * retorna double. Implemente-a em duas classes:
 * 1) Funcionario (com salarioFixo) — calcularPagamento() retorna o
 *    salário fixo.
 * 2) Freelancer (com valorPorHora e horasTrabalhadas) —
 *    calcularPagamento() retorna valorPorHora * horasTrabalhadas.
 * No main(), crie uma lista de Pagavel contendo os dois tipos, e some
 * o total a pagar percorrendo a lista.
 *
 * DICAS:
 * // dica 1: interface Pagavel { double calcularPagamento(); }
 * // dica 2: class Funcionario implements Pagavel { ... }
 * // dica 3: assim como no polimorfismo, List<Pagavel> aceita
 * //         Funcionario e Freelancer ao mesmo tempo
 *
 * SAÍDA ESPERADA (exemplo, Funcionario com salarioFixo=3000, Freelancer com valorPorHora=50 e horasTrabalhadas=20):
 * Total a pagar: 4000.0
 */
public class Ex18_Interfaces {

    interface Pagavel {
        double calcularPagamento();
    }

    // TODO: crie Funcionario implements Pagavel

    // TODO: crie Freelancer implements Pagavel

    public static void main(String[] args) {
        // TODO: crie uma lista de Pagavel com Funcionarios e Freelancers,
        // e some o total a pagar
    }
}
