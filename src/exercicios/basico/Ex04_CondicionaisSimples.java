package exercicios.basico;

/*
 * Exercício 04 — Estruturas Condicionais
 * Nível: Básico
 *
 * EXPLICAÇÃO:
 * if/else permite tomar decisões: "se isso for verdade, faça X, senão
 * faça Y". Você pode encadear vários "else if" para checar múltiplas
 * condições em sequência.
 *
 * DESAFIO:
 * 1) Dado um número inteiro, diga se ele é par ou ímpar (use %).
 * 2) Dada uma idade, classifique em: "criança" (0-12), "adolescente"
 *    (13-17), "adulto" (18-59) ou "idoso" (60+).
 * 3) Desafio extra: dados 3 números, descubra qual é o maior sem usar
 *    Math.max (só com if/else).
 *
 * DICAS:
 * // dica 1: par/ímpar -> if (numero % 2 == 0) { ... } else { ... }
 * // dica 2: para faixas de idade, comece pela condição mais restritiva
 * // dica 3: para o maior de 3, compare dois de cada vez em cascata
 *
 * SAÍDA ESPERADA (para os valores de exemplo já no arquivo: numero=17, idade=25, a=4, b=9, c=7):
 * 17 é ímpar
 * 25 anos -> adulto
 * Maior entre 4, 9 e 7: 9
 */
public class Ex04_CondicionaisSimples {
    public static void main(String[] args) {
        int numero = 17; // troque o valor para testar

        // TODO: verifique se numero é par ou ímpar

        int idade = 25; // troque o valor para testar

        // TODO: classifique a idade

        int a = 4, b = 9, c = 7; // troque os valores para testar

        // TODO: descubra o maior entre a, b e c sem usar Math.max
    }
}
