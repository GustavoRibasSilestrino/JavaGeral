package exercicios.basico;

/*
 * Exercício 10 — Métodos (Funções)
 * Nível: Básico
 *
 * EXPLICAÇÃO:
 * Métodos organizam código em blocos reutilizáveis. Assinatura básica:
 * <modificador> <tipoDeRetorno> nomeDoMetodo(parâmetros) { ... return ...; }
 * Métodos "static" podem ser chamados diretamente pelo nome dentro da
 * mesma classe (sem precisar criar um objeto).
 *
 * DESAFIO:
 * Crie os seguintes métodos e chame todos no main():
 * 1) boolean isPrimo(int n) — retorna true se n é primo.
 * 2) long fatorial(int n) — retorna o fatorial de n (use long, cresce rápido!).
 * 3) int somaDigitos(int n) — soma os dígitos de n (ex: 123 -> 1+2+3 = 6).
 * Teste cada um com pelo menos 2 valores diferentes.
 *
 * DICAS:
 * // dica 1: número primo só é divisível por 1 e por ele mesmo; teste
 * //         divisores de 2 até n/2 (ou até raiz de n, se quiser otimizar)
 * // dica 2: fatorial(0) = 1, fatorial(n) = n * fatorial(n-1) ou faça com for
 * // dica 3: somaDigitos pode reaproveitar a lógica do Exercício 07
 *           (dividir por 10 repetidamente)
 *
 * SAÍDA ESPERADA (para os valores sugeridos: 7/8, 5/10, 123/9999):
 * isPrimo(7) = true, isPrimo(8) = false
 * fatorial(5) = 120, fatorial(10) = 3628800
 * somaDigitos(123) = 6, somaDigitos(9999) = 36
 * Dica: rode exercicios/testes/TesteAutomatico.java para conferência automática!
 */
public class Ex10_Metodos {

    // TODO: implemente isPrimo(int n)
    // (public para que o TesteAutomatico em exercicios.testes consiga chamar este método)
    public static boolean isPrimo(int n) {
        throw new UnsupportedOperationException("TODO: implemente isPrimo");
    }

    // TODO: implemente fatorial(int n)
    public static long fatorial(int n) {
        throw new UnsupportedOperationException("TODO: implemente fatorial");
    }

    // TODO: implemente somaDigitos(int n)
    public static int somaDigitos(int n) {
        throw new UnsupportedOperationException("TODO: implemente somaDigitos");
    }

    public static void main(String[] args) {
        // TODO: teste isPrimo com pelo menos 2 valores (ex: 7 e 8)

        // TODO: teste fatorial com pelo menos 2 valores (ex: 5 e 10)

        // TODO: teste somaDigitos com pelo menos 2 valores (ex: 123 e 9999)
    }
}
