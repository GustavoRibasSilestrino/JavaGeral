# Guia de Exercícios Java — do Básico ao Muito Avançado

32 exercícios organizados em 4 pacotes, cada um em um arquivo `.java` separado dentro de `src/exercicios/`. Cada arquivo tem: uma explicação do conceito, um desafio, e dicas comentadas (não a resposta pronta). Abra o pacote correspondente no IntelliJ, clique com o botão direito em cada `Ex##_*.java` e escolha **Run** para testar.

## Como usar

1. Vá do básico ao avançado, na ordem — os exercícios mais avançados pressupõem conceitos dos anteriores.
2. Leia a explicação e o desafio no comentário do topo do arquivo.
3. Tente resolver sozinho primeiro. Se travar, descomente as dicas uma de cada vez.
4. Rode o arquivo (`Run`) e confira a saída no console — compare com o bloco **SAÍDA ESPERADA** que fica no comentário do topo de cada arquivo (correção na hora, sem precisar sair do arquivo).
5. Para os exercícios com métodos testáveis, rode `exercicios/testes/TesteAutomatico.java` para conferência automática de verdade, com `[OK]`/`[FALHOU]` (veja abaixo).

## exercicios.basico (01–10)

| Arquivo | Tema |
|---|---|
| Ex01_OlaMundo | Variáveis e String.format |
| Ex02_Variaveis | Tipos primitivos e operadores |
| Ex03_EntradaSaida | Scanner (entrada do usuário) |
| Ex04_CondicionaisSimples | if / else |
| Ex05_SwitchCase | switch, menu de calculadora |
| Ex06_LacosFor | for, tabuada |
| Ex07_LacosWhile | while / do-while, validação |
| Ex08_Arrays | Arrays: soma, média, min, max |
| Ex09_Strings | Manipulação de String, palíndromo |
| Ex10_Metodos | Métodos reutilizáveis (isPrimo, fatorial...) |

## exercicios.intermediario (11–20)

| Arquivo | Tema |
|---|---|
| Ex11_ArraysMultidimensionais | Matrizes, transposta |
| Ex12_Recursao | Recursão (fatorial, fibonacci) |
| Ex13_POO_ClasseBasica | Sua primeira classe (Produto) |
| Ex14_Encapsulamento | private + getters/setters validados |
| Ex15_Heranca | extends, @Override |
| Ex16_Polimorfismo | Lista de superclasse, comportamento dinâmico |
| Ex17_ClassesAbstratas | abstract class, método abstrato |
| Ex18_Interfaces | interface, implements |
| Ex19_Colecoes_ArrayList | Lista de tarefas com ArrayList |
| Ex20_Colecoes_HashMap | Contagem de palavras com HashMap |

## exercicios.avancado (21–27)

| Arquivo | Tema |
|---|---|
| Ex21_TratamentoExcecoes | try/catch/finally, exceção customizada |
| Ex22_Generics | Classe genérica Caixa\<T\> |
| Ex23_StreamsLambda | Stream: filter, map, reduce |
| Ex24_Enum | Enum com método próprio |
| Ex25_ManipulacaoArquivos | Ler/escrever arquivos de texto |
| Ex26_Comparator | Comparable vs Comparator |
| Ex27_EstruturasDados | Pilha e fila (Deque), parênteses balanceados |

## exercicios.muitoavancado (28–32)

| Arquivo | Tema |
|---|---|
| Ex28_Threads | Threads, concorrência, synchronized |
| Ex29_DesignPatterns | Singleton + Observer |
| Ex30_AlgoritmosOrdenacao | Bubble sort, insertion sort, busca binária na mão |
| Ex31_ListaEncadeada | Lista encadeada própria (sem ArrayList) |
| Ex32_ProjetoFinal | Mini sistema bancário — integra tudo |

## exercicios.testes — teste automático

`Testador.java` é um mini framework de verificação (sem JUnit, já que o projeto não usa Maven/Gradle). `TesteAutomatico.java` chama os métodos que você implementou e confere o resultado esperado, imprimindo `[OK]`, `[FALHOU]` ou `[PENDENTE]` (ainda não implementado) para cada caso, com um resumo no final.

Cobre automaticamente: **Ex10, Ex12, Ex21 (sacar), Ex27, Ex30** — os exercícios com métodos que retornam um valor. Os demais exercícios (que só imprimem no console ou pedem para você criar classes novas, como Ex13, Ex15, Ex22, Ex31...) não têm como ser testados sem que as classes já existam — para esses, rode o próprio arquivo e confira a saída manualmente, testando valores diferentes.

Para rodar: abra `TesteAutomatico.java` e clique em **Run**. Pode rodar a qualquer momento, mesmo com exercícios pela metade.
