package exercicios.intermediario;

/*
 * Exercício 15 — Herança
 * Nível: Intermediário
 *
 * EXPLICAÇÃO:
 * Herança permite que uma classe (subclasse) reaproveite atributos e
 * métodos de outra (superclasse), usando "extends". Isso evita
 * duplicação de código quando classes compartilham características.
 *
 * DESAFIO:
 * Crie uma classe Animal com atributo nome (String) e método
 * emitirSom() que imprime "Som genérico de animal". Depois crie duas
 * subclasses:
 * 1) Cachorro extends Animal — sobrescreva emitirSom() para imprimir
 *    "Au au!"
 * 2) Gato extends Animal — sobrescreva emitirSom() para imprimir "Miau!"
 * No main(), crie um objeto de cada tipo e chame emitirSom().
 *
 * DICAS:
 * // dica 1: class Cachorro extends Animal { ... }
 * // dica 2: use @Override em cima do método que está sendo sobrescrito
 * // dica 3: use "super(nome)" no construtor da subclasse para chamar
 * //         o construtor da superclasse, se você criar um construtor com parâmetros
 *
 * SAÍDA ESPERADA:
 * Au au!
 * Miau!
 */
public class Ex15_Heranca {

    static class Animal {
        String nome;

        void emitirSom() {
            System.out.println("Som genérico de animal");
        }
    }

    // TODO: crie a classe Cachorro extends Animal, sobrescrevendo emitirSom()

    // TODO: crie a classe Gato extends Animal, sobrescrevendo emitirSom()

    public static void main(String[] args) {
        // TODO: crie um Cachorro e um Gato, e chame emitirSom() de cada um
    }
}
