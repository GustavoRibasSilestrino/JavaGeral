package exercicios.avancado;

/*
 * Exercício 21 — Tratamento de Exceções
 * Nível: Avançado
 *
 * EXPLICAÇÃO:
 * Exceções são erros que acontecem durante a execução. try/catch
 * permite "capturar" o erro e reagir sem derrubar o programa. finally
 * sempre executa, com ou sem erro. Você também pode criar suas
 * próprias exceções, estendendo Exception (checked) ou
 * RuntimeException (unchecked).
 *
 * DESAFIO:
 * 1) Crie uma exceção customizada SaldoInsuficienteException que
 *    estenda RuntimeException, com uma mensagem explicando o problema.
 * 2) Em um método sacar(double saldo, double valor), lance essa
 *    exceção (throw) se valor > saldo.
 * 3) No main(), chame sacar() dentro de um try/catch, tratando a
 *    exceção sem deixar o programa quebrar, e imprima algo no finally.
 *
 * DICAS:
 * // dica 1: class SaldoInsuficienteException extends RuntimeException {
 * //         public SaldoInsuficienteException(String msg) { super(msg); } }
 * // dica 2: if (valor > saldo) throw new SaldoInsuficienteException("...");
 * // dica 3: try { sacar(...); } catch (SaldoInsuficienteException e) {
 * //         System.out.println(e.getMessage()); } finally { ... }
 *
 * SAÍDA ESPERADA (exemplo, sacar(100, 40) e depois sacar(100, 150)):
 * Saque de 40.0 realizado, saldo restante: 60.0
 * Erro: saldo insuficiente para sacar 150.0
 * Operação finalizada. (isso vem do finally)
 * Dica: rode exercicios/testes/TesteAutomatico.java para conferência automática!
 */
public class Ex21_TratamentoExcecoes {

    // TODO: crie a exceção customizada SaldoInsuficienteException

    // public para que o TesteAutomatico em exercicios.testes consiga chamar este método
    public static double sacar(double saldo, double valor) {
        // TODO: lance SaldoInsuficienteException se valor > saldo,
        // senão retorne saldo - valor
        throw new UnsupportedOperationException("TODO: implemente sacar");
    }

    public static void main(String[] args) {
        // TODO: chame sacar() dentro de um try/catch/finally,
        // testando um caso que dá erro e um que funciona
    }
}
