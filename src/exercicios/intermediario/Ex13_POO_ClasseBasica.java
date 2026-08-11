package exercicios.intermediario;

/*
 * Exercício 13 — Sua Primeira Classe (POO)
 * Nível: Intermediário
 *
 * EXPLICAÇÃO:
 * Uma classe é um "molde" para criar objetos. Ela tem atributos
 * (variáveis que descrevem o objeto) e métodos (ações que o objeto
 * pode fazer). Um construtor é um método especial, com o mesmo nome da
 * classe, chamado quando você cria um objeto com "new".
 *
 * DESAFIO:
 * Crie uma classe Produto com atributos: nome (String), preco (double)
 * e quantidadeEstoque (int). Adicione:
 * 1) um construtor que recebe os três valores;
 * 2) um método calcularValorTotalEstoque() que retorna preco * quantidadeEstoque;
 * 3) um método aplicarDesconto(double percentual) que reduz o preço.
 * No main(), crie 2 ou 3 produtos diferentes e teste os métodos.
 *
 * DICAS:
 * // dica 1: public Produto(String nome, double preco, int quantidadeEstoque) { this.nome = nome; ... }
 * // dica 2: "this" se refere ao objeto atual — usado para diferenciar
 * //         o atributo da classe do parâmetro do construtor quando têm o mesmo nome
 * // dica 3: desconto de 10% -> preco = preco - (preco * percentual / 100);
 *
 * SAÍDA ESPERADA (exemplo, se você criar new Produto("Caneta", 2.50, 100)):
 * Valor total em estoque: 250.0
 * Após aplicarDesconto(10): preço passa de 2.50 para 2.25
 */
public class Ex13_POO_ClasseBasica {

    static class Produto {
        String nome;
        double preco;
        int quantidadeEstoque;

        // TODO: crie o construtor

        // TODO: implemente calcularValorTotalEstoque()

        // TODO: implemente aplicarDesconto(double percentual)
    }

    public static void main(String[] args) {
        // TODO: crie 2 ou 3 objetos Produto e teste os métodos
    }
}
