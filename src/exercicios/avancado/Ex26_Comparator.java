package exercicios.avancado;

import java.util.ArrayList;
import java.util.List;

/*
 * Exercício 26 — Comparable e Comparator
 * Nível: Avançado
 *
 * EXPLICAÇÃO:
 * Para ordenar objetos (não tipos primitivos), Java precisa saber
 * "quem vem antes de quem". Comparable define uma ordem NATURAL
 * dentro da própria classe (implements Comparable<T>, método
 * compareTo). Comparator define ordens EXTERNAS e alternativas, sem
 * mexer na classe original — útil quando você quer ordenar de formas
 * diferentes em momentos diferentes.
 *
 * DESAFIO:
 * Crie uma classe Pessoa (nome, idade). Depois:
 * 1) Faça Pessoa implementar Comparable<Pessoa>, ordenando por idade
 *    (ordem natural).
 * 2) Crie uma List<Pessoa> com pelo menos 4 pessoas e ordene usando
 *    Collections.sort(lista) (usa o Comparable).
 * 3) Agora ordene a MESMA lista por nome, usando um Comparator
 *    (sem alterar a classe Pessoa), com
 *    lista.sort(Comparator.comparing(Pessoa::getNome)).
 *
 * DICAS:
 * // dica 1: compareTo deve retornar negativo/zero/positivo:
 * //         return Integer.compare(this.idade, outra.idade);
 * // dica 2: Collections.sort(lista) usa o compareTo (Comparable)
 * // dica 3: Comparator.comparing precisa de um getter (getNome())
 *
 * SAÍDA ESPERADA (exemplo, com pessoas Ana(30), Bruno(20), Carla(40), Davi(10)):
 * Ordenado por idade: Davi(10), Bruno(20), Ana(30), Carla(40)
 * Ordenado por nome: Ana(30), Bruno(20), Carla(40), Davi(10)
 */
public class Ex26_Comparator {

    // TODO: crie a classe Pessoa (nome, idade) implements Comparable<Pessoa>

    public static void main(String[] args) {
        List<Object> pessoas = new ArrayList<>(); // troque Object por Pessoa quando criar a classe

        // TODO: crie pelo menos 4 pessoas e adicione à lista

        // TODO: ordene por idade usando Collections.sort (Comparable)

        // TODO: ordene por nome usando um Comparator, sem alterar a classe Pessoa
    }
}
