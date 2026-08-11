package exercicios.intermediario;

/*
 * Exercício 11 — Matrizes (Arrays Multidimensionais)
 * Nível: Intermediário
 *
 * EXPLICAÇÃO:
 * Uma matriz é um "array de arrays": int[][] matriz = new int[3][3].
 * Para percorrer, você precisa de dois loops aninhados: um para as
 * linhas, outro para as colunas.
 *
 * DESAFIO:
 * 1) Some todos os elementos de uma matriz 3x3.
 * 2) Calcule a transposta da matriz (troque linhas por colunas) e
 *    imprima o resultado em outra matriz.
 * 3) Desafio extra: verifique se a matriz é "simétrica" (igual à sua
 *    transposta).
 *
 * DICAS:
 * // dica 1: for (int i = 0; i < matriz.length; i++) { for (int j = 0; j < matriz[i].length; j++) { ... } }
 * // dica 2: transposta[j][i] = matriz[i][j]
 * // dica 3: para comparar duas matrizes, compare posição a posição
 *
 * SAÍDA ESPERADA (para a matriz de exemplo já no arquivo):
 * Soma: 45
 * Transposta:
 * 1 4 7
 * 2 5 8
 * 3 6 9
 * (extra) É simétrica? false
 */
public class Ex11_ArraysMultidimensionais {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // TODO: some todos os elementos da matriz

        // TODO: calcule a matriz transposta e imprima-a

        // TODO (extra): verifique se a matriz é simétrica
    }
}
