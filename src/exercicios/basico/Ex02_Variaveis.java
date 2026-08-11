package exercicios.basico;

/*
 * Exercício 02 — Tipos Primitivos e Operadores
 * Nível: Básico
 *
 * EXPLICAÇÃO:
 * Java tem tipos numéricos diferentes (int para inteiros, double para
 * decimais) e operadores aritméticos (+, -, *, /, %). Cuidado: dividir
 * dois "int" gera outro "int" (trunca a casa decimal). Para ter casas
 * decimais, pelo menos um dos números precisa ser double.
 *
 * DESAFIO:
 * 1) Calcule a média de 3 notas (double) digitadas por você no código
 *    (pode ser fixo, tipo double nota1 = 7.5;).
 * 2) Calcule o IMC (Índice de Massa Corporal): peso / (altura * altura).
 * 3) Imprima os dois resultados formatados com 2 casas decimais.
 *
 * DICAS:
 * // dica 1: cuidado com divisão inteira: 7 / 2 = 3, mas 7.0 / 2 = 3.5
 * // dica 2: use Math.pow(altura, 2) ou altura * altura, os dois funcionam
 * // dica 3: System.out.printf("%.2f%n", valor); formata com 2 casas
 *
 * SAÍDA ESPERADA (formato — os valores exatos dependem das notas/peso/altura que você escolher):
 * Média: <(nota1+nota2+nota3)/3, com 2 casas decimais>
 * IMC: <peso / (altura*altura), com 2 casas decimais>
 * (ex.: notas 7.0, 8.0, 9.0 -> Média: 8.00 | peso 70, altura 1.75 -> IMC: 22.86)
 */
public class Ex02_Variaveis {
    public static void main(String[] args) {
        // TODO: declare nota1, nota2, nota3 e calcule a média
        double nota1 = 9.1;
        double nota2 = 7.4;
        double nota3 = 8.5;
        double media = (nota1 + nota2 + nota3) /3;

        System.out.println("Media" + media);
        // TODO: declare peso e altura e calcule o IMC
        double peso = 143.4;
        double altura = 1.90;
        double imc = peso / Math.pow(altura, 2 );

        // o / é a divisão, pow vem de "power" (potência).
        // O metodo math.pow calcula a base elevada a um expoente

        System.out.println("IMC: " + imc);

        // TODO: imprima os resultados formatados
        System.out.println(String.format("Nota 1: %.2f", nota1));
        System.out.println(String.format("Nota 2: %.2f", nota2));
        System.out.println(String.format("Nota 3: %.2f", nota3));
        System.out.println(String.format("Media: %.2f", media));

    }
}
