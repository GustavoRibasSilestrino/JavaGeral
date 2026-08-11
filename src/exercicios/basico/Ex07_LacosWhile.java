package exercicios.basico;

import java.util.Scanner;

/*
 * Exercício 07 — While e Do-While
 * Nível: Básico
 *
 * EXPLICAÇÃO:
 * while repete "enquanto uma condição for verdadeira" — útil quando
 * você NÃO sabe de antemão quantas repetições vai precisar (por
 * exemplo, validar entrada do usuário). do-while é parecido, mas
 * executa o bloco pelo menos uma vez antes de checar a condição.
 *
 * DESAFIO:
 * 1) Peça um número ao usuário repetidamente até que ele digite um
 *    número positivo (rejeite negativos e zero, avisando o motivo).
 * 2) Dado um número inteiro, conte quantos dígitos ele tem, usando um
 *    while que vai dividindo o número por 10 até chegar a zero.
 *
 * DICAS:
 * // dica 1: while (numero <= 0) { ... peça de novo ... }
 * // dica 2: para contar dígitos: while (numero != 0) { numero /= 10; contador++; }
 * // dica 3: cuidado com números negativos no contador de dígitos — use Math.abs()
 *
 * SAÍDA ESPERADA:
 * (parte 1 depende do que você digitar — só termina quando o número for positivo)
 * Para numero = 20475: o número tem 5 dígitos
 */
public class Ex07_LacosWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO: peça um número até que seja positivo, usando while

        int numero = 20475; // troque para testar a contagem de dígitos

        // TODO: conte os dígitos de "numero" usando while

        sc.close();
    }
}
