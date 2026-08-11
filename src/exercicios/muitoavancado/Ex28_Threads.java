package exercicios.muitoavancado;

/*
 * Exercício 28 — Threads e Concorrência
 * Nível: Muito Avançado
 *
 * EXPLICAÇÃO:
 * Uma Thread executa código de forma independente/concorrente com o
 * resto do programa. Você pode criar uma implementando Runnable (mais
 * flexível) e passando para "new Thread(runnable)". O problema é que
 * threads podem acessar a mesma variável ao mesmo tempo e causar
 * "race conditions" (resultados inconsistentes) — por isso existe a
 * palavra-chave "synchronized", que garante que só uma thread execute
 * aquele trecho por vez.
 *
 * DESAFIO:
 * 1) Crie duas threads: uma imprime os números de 1 a 10, outra
 *    imprime as letras de A a J. Rode ambas ao mesmo tempo (start()) e
 *    observe que a ordem de saída não é previsível — isso é normal!
 * 2) Desafio extra (race condition de verdade): crie um contador
 *    compartilhado (int) e duas threads que incrementam esse contador
 *    100000 vezes cada, SEM synchronized. Rode e veja que o resultado
 *    final quase nunca é 200000. Depois adicione "synchronized" no
 *    método que incrementa e rode de novo — o resultado deve ficar
 *    sempre correto.
 *
 * DICAS:
 * // dica 1: Runnable tarefa = () -> { for (...) System.out.println(...); };
 * //         Thread t = new Thread(tarefa); t.start();
 * // dica 2: use t.join() se quiser esperar uma thread terminar antes de continuar
 * // dica 3: synchronized void incrementar() { contador++; }
 *
 * SAÍDA ESPERADA:
 * Números (1 a 10) e letras (A a J) intercalados de forma IMPREVISÍVEL
 * (a ordem muda a cada execução — isso é esperado, não um bug)
 * (extra) sem synchronized: contador final quase nunca é 200000
 * (extra) com synchronized: contador final é sempre 200000
 */
public class Ex28_Threads {
    public static void main(String[] args) throws InterruptedException {
        // TODO: crie e inicie as duas threads (números e letras)

        // TODO (extra): crie o cenário de race condition com e sem synchronized
    }
}
