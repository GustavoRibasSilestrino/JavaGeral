package exercicios.basico;

import java.util.Scanner;

/*
 * Exercício 03 — Entrada de Dados com Scanner
 * Nível: Básico
 *
 * EXPLICAÇÃO:
 * Scanner lê o que o usuário digita no console. Você cria um Scanner
 * "acoplado" ao System.in, e usa métodos como nextLine() (texto),
 * nextInt() (inteiro) ou nextDouble() (decimal) para capturar a entrada.
 *
 * DESAFIO:
 * Peça ao usuário para digitar o nome e a idade. Depois imprima:
 * "Prazer, <nome>! Ano que vem você fará <idade+1> anos."
 * Bônus: se misturar nextInt() com nextLine(), você vai levar uma
 * "pegadinha" clássica do Java (o \n sobra no buffer) — pesquise
 * "Scanner nextInt nextLine bug java" se isso acontecer com você.
 *
 * DICAS:
 * // dica 1: Scanner sc = new Scanner(System.in);
 * // dica 2: String nome = sc.nextLine();
 * // dica 3: int idade = sc.nextInt();
 * // dica 4: não esqueça de fechar o scanner no fim: sc.close();
 *
 * SAÍDA ESPERADA (exemplo, se você digitar "Ana" e depois "30"):
 * Prazer, Ana! Ano que vem você fará 31 anos.
 */

import java.util.Scanner;

public class Ex03_EntradaSaida {
    public static void main(String[] args) {
        // TODO: crie o Scanner
        // import java.util.Scanner;, usada para ler entrada de dados, ou seja, capturar o que o usuario
        // digita no teclado enquanto o programa roda

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome");
//        String nome = sc.nextLine();
        String nome = sc.nextLine();


        System.out.println("Digite sua idade");
        int idade = sc.nextInt();



        System.out.println(String.format("Prazer, %s! Ano que vem você fará %s anos. ", nome, idade + 1));
        // Scanner = tipo, sc = nome da variavel, new Scanner = cria um objeto, (System.in) = argumento " de onde ler"
        // System.in = o argumento, Aqui você está dizendo de onde o Scanner vai ler dados. System.in representa a entrada padrão do sistema

        System.out.println("Parabens!!");

        sc.close();
        // TODO: leia nome e idade
        //feito
        // TODO: imprima a mensagem final
        // feito
        // TODO: feche o scanner
        //feito
    }
}
