package exercicios.intermediario;

import java.util.HashMap;
import java.util.Map;

/*
 * Exercício 20 — Coleções: HashMap
 * Nível: Intermediário
 *
 * EXPLICAÇÃO:
 * HashMap guarda pares chave-valor (Map<K, V>). É ótimo para "contar"
 * ou "indexar" coisas: por exemplo, usar cada palavra como chave e a
 * quantidade de vezes que apareceu como valor.
 *
 * DESAFIO:
 * Dada uma frase, conte quantas vezes cada palavra aparece, ignorando
 * maiúsculas/minúsculas, e imprima o resultado (palavra -> quantidade).
 *
 * DICAS:
 * // dica 1: frase.toLowerCase().split(" ") separa a frase em palavras
 * // dica 2: Map<String, Integer> contagem = new HashMap<>();
 * // dica 3: para incrementar o contador de uma palavra:
 * //         contagem.put(palavra, contagem.getOrDefault(palavra, 0) + 1);
 * // dica 4: para imprimir tudo, percorra com:
 * //         for (Map.Entry<String, Integer> e : contagem.entrySet()) { ... }
 *
 * SAÍDA ESPERADA (para a frase de exemplo já no arquivo — ordem pode variar, HashMap não garante ordem):
 * o -> 2
 * rato -> 2
 * roeu -> 1
 * a -> 1
 * roupa -> 1
 * do -> 1
 * rei -> 1
 * de -> 1
 * roma -> 1
 * e -> 1
 */
public class Ex20_Colecoes_HashMap {
    public static void main(String[] args) {
        String frase = "o rato roeu a roupa do rei de roma e o rato";

        Map<String, Integer> contagem = new HashMap<>();

        // TODO: separe a frase em palavras e conte a frequência de cada uma

        // TODO: imprima o resultado (palavra -> quantidade)
    }
}
