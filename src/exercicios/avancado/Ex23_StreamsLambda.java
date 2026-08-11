package exercicios.avancado;

import java.util.List;

/*
 * Exercício 23 — Streams e Expressões Lambda
 * Nível: Avançado
 *
 * EXPLICAÇÃO:
 * Streams permitem processar coleções de forma "declarativa" (você
 * descreve O QUE quer, não COMO fazer passo a passo). Métodos comuns:
 * filter (filtra), map (transforma), reduce (agrega), collect (junta
 * num resultado final, como uma lista). Lambdas são "funções sem
 * nome": (parâmetro) -> expressão.
 *
 * DESAFIO:
 * Dada uma lista de números inteiros:
 * 1) Filtre apenas os números pares.
 * 2) Multiplique cada número par por 2 (map).
 * 3) Some todos os resultados (reduce).
 * 4) Desafio extra: faça tudo isso em uma ÚNICA cadeia de chamadas
 *    encadeadas (stream().filter().map().reduce()...).
 *
 * DICAS:
 * // dica 1: numeros.stream().filter(n -> n % 2 == 0)
 * // dica 2: .map(n -> n * 2)
 * // dica 3: .reduce(0, Integer::sum) ou .reduce(0, (a, b) -> a + b)
 * // dica 4: para virar lista de novo: .collect(Collectors.toList())
 *
 * SAÍDA ESPERADA (para a lista de exemplo já no arquivo: 1 a 10):
 * Pares: [2, 4, 6, 8, 10]
 * Pares x2: [4, 8, 12, 16, 20]
 * Soma final: 60
 */
public class Ex23_StreamsLambda {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // TODO: filtre os pares

        // TODO: multiplique cada par por 2

        // TODO: some tudo com reduce

        // TODO (extra): repita tudo em uma única cadeia encadeada
    }
}
