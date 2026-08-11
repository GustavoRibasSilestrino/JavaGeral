package exercicios.intermediario;

/*
 * Exercício 12 — Recursão
 * Nível: Intermediário
 *
 * EXPLICAÇÃO:
 * Um método recursivo é aquele que chama a si mesmo, até atingir um
 * "caso base" que interrompe a recursão. Toda função recursiva precisa
 * de: (1) um caso base claro, (2) uma chamada que se aproxima do caso
 * base a cada passo.
 *
 * DESAFIO:
 * 1) Implemente fatorial(int n) de forma recursiva (sem loop).
 * 2) Implemente fibonacci(int n) de forma recursiva (fib(0)=0, fib(1)=1,
 *    fib(n)=fib(n-1)+fib(n-2)).
 * 3) Desafio extra: implemente somaDigitos(int n) recursivamente
 *    (retire o último dígito com n % 10, e chame de novo com n / 10).
 *
 * DICAS:
 * // dica 1: caso base do fatorial: if (n <= 1) return 1;
 * // dica 2: fibonacci recursivo "puro" fica MUITO lento para n grande
 * //         (n > 40) — pesquise por que depois (dica: recalcula tudo
 * //         várias vezes). Isso é normal para esse exercício.
 * // dica 3: caso base da soma de dígitos: if (n < 10) return n;
 *
 * SAÍDA ESPERADA (para fatorial(5), fibonacci(10) e somaDigitos(12345)):
 * fatorial(5) = 120
 * fibonacci(10) = 55
 * somaDigitos(12345) = 15
 * Dica: rode exercicios/testes/TesteAutomatico.java para conferência automática!
 */
public class Ex12_Recursao {

    // TODO: implemente fatorial recursivo
    // (public para que o TesteAutomatico em exercicios.testes consiga chamar este método)
    public static long fatorial(int n) {
        throw new UnsupportedOperationException("TODO: implemente fatorial recursivo");
    }

    // TODO: implemente fibonacci recursivo
    public static long fibonacci(int n) {
        throw new UnsupportedOperationException("TODO: implemente fibonacci recursivo");
    }

    // TODO (extra): implemente somaDigitos recursivo
    public static int somaDigitos(int n) {
        throw new UnsupportedOperationException("TODO: implemente somaDigitos recursivo");
    }

    public static void main(String[] args) {
        // TODO: teste fatorial(5), fibonacci(10) e somaDigitos(12345)
    }
}
