package exercicios.testes;

/*
 * Mini framework de testes — sem JUnit
 *
 * Este projeto não usa Maven/Gradle, então não há como baixar o JUnit
 * automaticamente. Em vez disso, esta classe é um "verificador" bem
 * simples: você chama checar(descricao, condicao) e ela imprime se
 * passou ou falhou, guardando um placar total.
 *
 * Se um dia você configurar Maven/Gradle no projeto, vale a pena
 * migrar esses testes para JUnit de verdade (@Test, assertEquals...) —
 * a lógica de "comparar resultado esperado com resultado obtido" é a
 * mesma, só muda a ferramenta.
 */
public class Testador {
    private static int total = 0;
    private static int passaram = 0;
    private static int pendentes = 0;

    public static void checar(String descricao, boolean condicaoVerdadeira) {
        total++;
        if (condicaoVerdadeira) {
            passaram++;
            System.out.println("  [OK]       " + descricao);
        } else {
            System.out.println("  [FALHOU]   " + descricao);
        }
    }

    public static void naoImplementado(String descricao) {
        total++;
        pendentes++;
        System.out.println("  [PENDENTE] " + descricao + " — ainda não implementado");
    }

    public static void erroInesperado(String descricao, Exception e) {
        total++;
        System.out.println("  [ERRO]     " + descricao + " — lançou " + e.getClass().getSimpleName()
                + ": " + e.getMessage());
    }

    public static void secao(String titulo) {
        System.out.println();
        System.out.println(titulo);
    }

    public static void imprimirResumoFinal() {
        int falharam = total - passaram - pendentes;
        System.out.println();
        System.out.println("==================================================");
        System.out.printf("RESULTADO FINAL: %d de %d testes passaram%n", passaram, total);
        System.out.printf("  OK: %d   |   Falharam: %d   |   Pendentes: %d%n", passaram, falharam, pendentes);
        System.out.println("==================================================");
    }
}
