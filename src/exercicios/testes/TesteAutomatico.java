package exercicios.testes;

import exercicios.basico.Ex10_Metodos;
import exercicios.intermediario.Ex12_Recursao;
import exercicios.avancado.Ex21_TratamentoExcecoes;
import exercicios.avancado.Ex27_EstruturasDados;
import exercicios.muitoavancado.Ex30_AlgoritmosOrdenacao;

import java.util.Arrays;

import static exercicios.testes.Testador.*;

/*
 * TESTE AUTOMÁTICO
 *
 * Como usar: resolva um exercício, depois rode ESTE arquivo (botão
 * direito > Run 'TesteAutomatico.main()'). Ele chama os métodos que
 * você implementou e confere se o resultado bate com o esperado.
 * Rode quantas vezes quiser, a qualquer momento — métodos ainda não
 * implementados aparecem como [PENDENTE], não quebram o programa.
 *
 * IMPORTANTE — por que só alguns exercícios estão aqui:
 * Só dá pra testar automaticamente exercícios que expõem MÉTODOS COM
 * RETORNO (ex: isPrimo, fatorial, buscaBinaria). Exercícios que
 * apenas imprimem no console (Ex01, Ex03, Ex06...) ou que pedem para
 * você CRIAR classes novas dentro do arquivo (Ex13 Produto, Ex15
 * Cachorro/Gato, Ex22 Caixa<T>, Ex31 ListaEncadeada...) não têm como
 * ser testados aqui sem que você já tenha criado essas classes — para
 * esses, a verificação é rodar o próprio Ex##.java e conferir a saída
 * a olho, testando valores diferentes.
 *
 * Cobertura automática desta versão: Ex10, Ex12, Ex21 (sacar), Ex27,
 * Ex30. Se quiser, você pode estender esta classe com testes para os
 * seus próprios métodos conforme for avançando.
 */
public class TesteAutomatico {

    public static void main(String[] args) {
        testarEx10Metodos();
        testarEx12Recursao();
        testarEx21Sacar();
        testarEx27Parenteses();
        testarEx30Ordenacao();

        imprimirResumoFinal();
    }

    static void testarEx10Metodos() {
        secao("Exercício 10 — Métodos (isPrimo, fatorial, somaDigitos)");

        try {
            checar("isPrimo(7) deve ser true", Ex10_Metodos.isPrimo(7));
            checar("isPrimo(8) deve ser false", !Ex10_Metodos.isPrimo(8));
            checar("isPrimo(1) deve ser false", !Ex10_Metodos.isPrimo(1));
            checar("isPrimo(2) deve ser true", Ex10_Metodos.isPrimo(2));
        } catch (UnsupportedOperationException e) {
            naoImplementado("isPrimo(int)");
        }

        try {
            checar("fatorial(5) deve ser 120", Ex10_Metodos.fatorial(5) == 120);
            checar("fatorial(0) deve ser 1", Ex10_Metodos.fatorial(0) == 1);
        } catch (UnsupportedOperationException e) {
            naoImplementado("fatorial(int)");
        }

        try {
            checar("somaDigitos(123) deve ser 6", Ex10_Metodos.somaDigitos(123) == 6);
            checar("somaDigitos(9999) deve ser 36", Ex10_Metodos.somaDigitos(9999) == 36);
        } catch (UnsupportedOperationException e) {
            naoImplementado("somaDigitos(int)");
        }
    }

    static void testarEx12Recursao() {
        secao("Exercício 12 — Recursão (fatorial, fibonacci, somaDigitos)");

        try {
            checar("fatorial(5) recursivo deve ser 120", Ex12_Recursao.fatorial(5) == 120);
            checar("fatorial(1) recursivo deve ser 1", Ex12_Recursao.fatorial(1) == 1);
        } catch (UnsupportedOperationException e) {
            naoImplementado("fatorial(int) recursivo");
        }

        try {
            checar("fibonacci(0) deve ser 0", Ex12_Recursao.fibonacci(0) == 0);
            checar("fibonacci(1) deve ser 1", Ex12_Recursao.fibonacci(1) == 1);
            checar("fibonacci(10) deve ser 55", Ex12_Recursao.fibonacci(10) == 55);
        } catch (UnsupportedOperationException e) {
            naoImplementado("fibonacci(int) recursivo");
        }

        try {
            checar("somaDigitos(12345) recursivo deve ser 15", Ex12_Recursao.somaDigitos(12345) == 15);
        } catch (UnsupportedOperationException e) {
            naoImplementado("somaDigitos(int) recursivo");
        }
    }

    static void testarEx21Sacar() {
        secao("Exercício 21 — Tratamento de Exceções (sacar)");

        try {
            double resultado = Ex21_TratamentoExcecoes.sacar(100, 40);
            checar("sacar(100, 40) deve retornar 60.0", resultado == 60.0);
        } catch (UnsupportedOperationException e) {
            naoImplementado("sacar (saque válido)");
        }

        try {
            Ex21_TratamentoExcecoes.sacar(100, 150);
            checar("sacar(100, 150) deveria lançar uma exceção (saldo insuficiente)", false);
        } catch (UnsupportedOperationException e) {
            naoImplementado("sacar (validação de saldo insuficiente)");
        } catch (RuntimeException e) {
            checar("sacar(100, 150) lançou " + e.getClass().getSimpleName() + " corretamente", true);
        }
    }

    static void testarEx27Parenteses() {
        secao("Exercício 27 — Parênteses Balanceados");

        try {
            checar("\"(()())\" deve ser balanceado", Ex27_EstruturasDados.parenteseBalanceado("(()())"));
            checar("\"(()\" NÃO deve ser balanceado", !Ex27_EstruturasDados.parenteseBalanceado("(()"));
            checar("\"\" (vazio) deve ser balanceado", Ex27_EstruturasDados.parenteseBalanceado(""));
            checar("\")(\" NÃO deve ser balanceado", !Ex27_EstruturasDados.parenteseBalanceado(")("));
        } catch (UnsupportedOperationException e) {
            naoImplementado("parenteseBalanceado(String)");
        }
    }

    static void testarEx30Ordenacao() {
        secao("Exercício 30 — Ordenação e Busca");

        try {
            int[] array = {9, 3, 7, 1, 8, 2, 5, 4, 6};
            Ex30_AlgoritmosOrdenacao.bubbleSort(array);
            checar("bubbleSort deve ordenar [9,3,7,1,8,2,5,4,6] em ordem crescente",
                    Arrays.equals(array, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
        } catch (UnsupportedOperationException e) {
            naoImplementado("bubbleSort(int[])");
        }

        try {
            int[] ordenado = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            checar("buscaBinaria deve achar o valor 5 no índice 4",
                    Ex30_AlgoritmosOrdenacao.buscaBinaria(ordenado, 5) == 4);
            checar("buscaBinaria deve retornar -1 para valor 100 (não existe)",
                    Ex30_AlgoritmosOrdenacao.buscaBinaria(ordenado, 100) == -1);
        } catch (UnsupportedOperationException e) {
            naoImplementado("buscaBinaria(int[], int)");
        }

        try {
            int[] array = {5, 2, 9, 1, 5, 6};
            Ex30_AlgoritmosOrdenacao.insertionSort(array);
            checar("insertionSort (extra) deve ordenar [5,2,9,1,5,6] em ordem crescente",
                    Arrays.equals(array, new int[]{1, 2, 5, 5, 6, 9}));
        } catch (UnsupportedOperationException e) {
            naoImplementado("insertionSort(int[]) — extra, opcional");
        }
    }
}
