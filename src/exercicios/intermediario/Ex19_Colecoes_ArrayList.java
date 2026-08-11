package exercicios.intermediario;

import java.util.ArrayList;
import java.util.List;

/*
 * Exercício 19 — Coleções: ArrayList
 * Nível: Intermediário
 *
 * EXPLICAÇÃO:
 * ArrayList é uma lista de tamanho dinâmico (cresce/diminui conforme
 * você adiciona/remove itens), diferente de arrays comuns que têm
 * tamanho fixo. Métodos principais: add(), remove(), get(index),
 * size(), contains().
 *
 * DESAFIO:
 * Crie uma pequena "lista de tarefas" usando uma List<String> (nome da
 * tarefa) e implemente um menu simples (pode ser fixo no código, sem
 * Scanner, se preferir) que:
 * 1) adiciona tarefas;
 * 2) remove uma tarefa pelo nome;
 * 3) lista todas as tarefas com um número na frente (1. Tarefa X);
 * 4) verifica se uma tarefa específica já existe antes de adicionar
 *    (evite duplicatas).
 *
 * DICAS:
 * // dica 1: List<String> tarefas = new ArrayList<>();
 * // dica 2: tarefas.contains("nome") retorna true/false
 * // dica 3: para numerar ao listar, use um for tradicional com índice:
 * //         for (int i = 0; i < tarefas.size(); i++) { ... (i+1) ... }
 *
 * SAÍDA ESPERADA (exemplo, adicionando "Estudar Java", "Lavar louça", "Estudar Java" de novo, removendo "Lavar louça"):
 * "Estudar Java" já existe, não foi adicionada de novo
 * 1. Estudar Java
 */
public class Ex19_Colecoes_ArrayList {
    public static void main(String[] args) {
        List<String> tarefas = new ArrayList<>();

        // TODO: adicione algumas tarefas (evitando duplicatas)

        // TODO: remova uma tarefa pelo nome

        // TODO: liste todas as tarefas numeradas
    }
}
