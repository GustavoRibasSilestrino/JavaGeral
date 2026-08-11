package exercicios.basico;

/*
 * Exercício 09 — Manipulação de Strings
 * Nível: Básico
 *
 * EXPLICAÇÃO:
 * String tem vários métodos úteis: length(), charAt(i), toLowerCase(),
 * toUpperCase(), substring(), trim(), equals()... Lembre-se: strings em
 * Java são imutáveis (métodos como toUpperCase() retornam uma NOVA
 * string, não alteram a original).
 *
 * DESAFIO:
 * 1) Verifique se uma palavra é um palíndromo (lê-se igual de trás para
 *    frente), ignorando maiúsculas/minúsculas. Ex: "Arara" é palíndromo.
 * 2) Conte quantas vogais existem em uma frase.
 *
 * DICAS:
 * // dica 1: para inverter uma string, um jeito é usar
 * //         new StringBuilder(palavra).reverse().toString()
 * // dica 2: compare a string original (em minúsculas) com a invertida
 * // dica 3: para contar vogais, percorra char por char com um for e
 * //         verifique com if (c=='a'||c=='e'||...) — não esqueça de
 * //         tratar maiúsculas também, ou converta tudo pra minúsculo antes
 *
 * SAÍDA ESPERADA (para os valores de exemplo já no arquivo):
 * "Arara" é palíndromo
 * A frase "O rato roeu a roupa do rei de Roma" tem 16 vogais
 */
public class Ex09_Strings {
    public static void main(String[] args) {
        String palavra = "Arara"; // troque para testar (ex: "Java" não é palíndromo)

        // TODO: verifique se "palavra" é palíndromo

        String frase = "O rato roeu a roupa do rei de Roma"; // troque para testar

        // TODO: conte as vogais em "frase"
    }
}
