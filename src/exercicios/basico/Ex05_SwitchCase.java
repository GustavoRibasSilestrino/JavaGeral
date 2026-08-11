package exercicios.basico;

/*
 * Exercício 05 — Switch e Menus
 * Nível: Básico
 *
 * EXPLICAÇÃO:
 * switch é útil quando você compara UMA variável com vários valores
 * possíveis (dias da semana, opções de menu, operações...). O Java
 * moderno permite a sintaxe "switch expression": switch (x) { case 1 ->
 * ...; case 2 -> ...; default -> ...; }
 *
 * DESAFIO:
 * Simule uma calculadora simples: dadas duas variáveis double (a, b) e
 * um char operador ('+', '-', '*', '/'), use switch para calcular e
 * imprimir o resultado da operação correspondente. Trate o caso de
 * operador inválido e de divisão por zero.
 *
 * DICAS:
 * // dica 1: switch (operador) { case '+' -> resultado = a + b; ... }
 * // dica 2: para divisão por zero, verifique "if (b == 0)" ANTES de dividir
 * // dica 3: use default para capturar operadores desconhecidos
 *
 * SAÍDA ESPERADA (para os valores de exemplo já no arquivo: a=10, b=0, operador='/'):
 * Erro: divisão por zero!
 * (troque b para um valor diferente de 0 para ver o resultado numérico normal;
 * ex.: a=10, b=3, operador='/' -> Resultado: 3.33)
 */
public class Ex05_SwitchCase {
    public static void main(String[] args) {
        double a = 10, b = 0; // troque os valores para testar (inclusive b = 0)
        char operador = '/'; // troque entre '+', '-', '*', '/', ou algo inválido como '?'

        // TODO: implemente a calculadora usando switch
    }
}
