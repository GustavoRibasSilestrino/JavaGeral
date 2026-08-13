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
        if (numero %2 == 0 ) {
            System.out.println( numero + " É par!");
        }
        else {
            System.out.println( numero + " É ímpar!");
        }

            // só 1 = é atribuição 2x o ==, é para comparar, perguntar se dois valores sao iguais


        // TODO: classifique a idade
        int idade = 25; // troque o valor para testar

        if ( idade<12){
            System.out.println("Criança");
        }
        // else if eu uso quando tem mais de 2 valores
        else if ( idade>=13 || idade<=17 ){
            // else if usamos quando tem mais de 1° possibilidade dentro das opções
            System.out.println("Adolescente");
        }
        else if ( idade>=18 || idade<=59 ){
            System.out.println("Adulto");
        }
        else if ( idade>59){
            System.out.println("Idoso");
        }

        // TODO: descubra o maior entre a, b e c sem usar Math.max
        int a = 4, b = 9, c = 7; // troque os valores para testar
        int maior = 0;
        if ( a > b ){
            maior = a;
            // aqui eu estou fazendo como se fosse uma batalha
            System.out.println(maior);
        }

        else if ( b > a) {
            maior = b;
            System.out.println(maior);
        }

        else if ( c > b ) {
            maior = c;
            System.out.println(maior);
        }

    }
}
