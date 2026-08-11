package exercicios.avancado;

import java.io.IOException;
import java.nio.file.Path;

/*
 * Exercício 25 — Manipulação de Arquivos
 * Nível: Avançado
 *
 * EXPLICAÇÃO:
 * A API java.nio.file.Files facilita ler e escrever arquivos de texto
 * sem muito boilerplate. Files.writeString(path, texto) grava um
 * arquivo; Files.readString(path) lê o conteúdo inteiro. Operações de
 * arquivo podem lançar IOException (checked), então você precisa
 * tratar ou declarar "throws IOException".
 *
 * DESAFIO:
 * 1) Escreva uma lista de tarefas (uma por linha) em um arquivo
 *    "tarefas.txt" dentro da pasta do projeto.
 * 2) Leia o arquivo de volta e imprima cada linha numerada no console.
 * 3) Desafio extra: adicione uma nova tarefa ao arquivo já existente
 *    SEM apagar o conteúdo anterior (modo append).
 *
 * DICAS:
 * // dica 1: Path caminho = Path.of("tarefas.txt");
 * // dica 2: Files.writeString(caminho, "linha1\nlinha2\n");
 * // dica 3: List<String> linhas = Files.readAllLines(caminho);
 * // dica 4: para append, use Files.writeString(caminho, texto,
 * //         StandardOpenOption.APPEND)
 *
 * SAÍDA ESPERADA (exemplo, escrevendo "Lavar louça" e "Estudar Java"):
 * 1. Lavar louça
 * 2. Estudar Java
 * (extra) depois do append de "Passear com o cachorro", o arquivo tarefas.txt
 * deve ter as 3 linhas, sem perder as duas primeiras
 */
public class Ex25_ManipulacaoArquivos {
    public static void main(String[] args) throws IOException {
        Path caminho = Path.of("tarefas.txt");

        // TODO: escreva uma lista de tarefas no arquivo

        // TODO: leia o arquivo de volta e imprima as linhas numeradas

        // TODO (extra): adicione uma nova tarefa sem apagar as anteriores (append)
    }
}
