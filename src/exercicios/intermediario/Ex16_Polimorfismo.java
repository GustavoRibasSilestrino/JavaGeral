package exercicios.intermediario;

import java.util.ArrayList;
import java.util.List;

/*
 * Exercício 16 — Polimorfismo
 * Nível: Intermediário
 *
 * EXPLICAÇÃO:
 * Polimorfismo é a capacidade de tratar objetos de subclasses
 * diferentes de forma uniforme, através do tipo da superclasse — mas
 * cada um "reage" com seu próprio comportamento. Isso é o que torna
 * herança realmente poderosa: uma lista de Animal pode conter
 * Cachorros e Gatos, e cada um emite seu som correto ao chamar o mesmo método.
 *
 * DESAFIO:
 * Reaproveite (ou recrie aqui) as classes Animal, Cachorro e Gato do
 * exercício anterior. Crie uma List<Animal>, adicione vários Cachorros
 * e Gatos, e percorra a lista chamando emitirSom() em cada um — sem
 * precisar saber, no loop, se é Cachorro ou Gato.
 *
 * DICAS:
 * // dica 1: List<Animal> animais = new ArrayList<>();
 * // dica 2: animais.add(new Cachorro()); animais.add(new Gato());
 * // dica 3: for (Animal a : animais) { a.emitirSom(); } — o método
 * //         correto é escolhido automaticamente em tempo de execução
 *
 * SAÍDA ESPERADA (para 2 Cachorros e 2 Gatos adicionados nessa ordem):
 * Au au!
 * Au au!
 * Miau!
 * Miau!
 */
public class Ex16_Polimorfismo {

    static class Animal {
        void emitirSom() {
            System.out.println("Som genérico de animal");
        }
    }

    // TODO: crie Cachorro extends Animal (emitirSom -> "Au au!")

    // TODO: crie Gato extends Animal (emitirSom -> "Miau!")

    public static void main(String[] args) {
        List<Animal> animais = new ArrayList<>();

        // TODO: adicione ao menos 2 Cachorros e 2 Gatos na lista

        // TODO: percorra a lista chamando emitirSom() em cada elemento
    }
}
