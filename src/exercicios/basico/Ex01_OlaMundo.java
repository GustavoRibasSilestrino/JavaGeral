package exercicios.basico;

import java.time.LocalDate;

/*
 * Exercício 01 — Olá, Mundo com Variáveis
 * Nível: Básico
 *
 * EXPLICAÇÃO:
 * Em Java, toda informação que queremos guardar precisa de uma variável
 * com um tipo definido (String, int, double, boolean...). String.format
 * (ou printf) permite montar textos "com espaços em branco" que são
 * preenchidos por variáveis, usando marcadores como %s (texto), %d
 * (inteiro) e %.2f (decimal com 2 casas).
 *
 * DESAFIO:
 * Crie três variáveis: nome (String), idade (int) e cidade (String).
 * Depois, usando String.format, monte e imprima a frase:
 * "Olá, meu nome é <nome>, tenho <idade> anos e moro em <cidade>."
 * Em seguida, calcule e imprima em que ano essa pessoa completa 100 anos.
 *
 * DICAS (descomente se travar):
 * // dica 1: String frase = String.format("Olá, meu nome é %s, tenho %d anos...", nome, idade, cidade);
 * // dica 2: para o ano dos 100 anos, pegue o ano atual e some (100 - idade).
 * // dica 3: java.time.LocalDate.now().getYear() te dá o ano atual sem "chutar" um valor fixo.
 *
 * SAÍDA ESPERADA (formato — os valores exatos dependem do nome/idade/cidade que você escolher):
 * Olá, meu nome é <nome>, tenho <idade> anos e moro em <cidade>.
 * Ano em que completa 100 anos: <anoAtual + (100 - idade)>
 */
public class Ex01_OlaMundo {
    public static void main(String[] args) {
        // TODO: declare as variáveis nome, idade e cidade
        String nome = "Gustavo"; // %s é o primeiro argumento
        int idade = 19; // %d éo segundo argumento
        String cidade = "Sorocaba"; // %s terceiro argumento

        // %s para string, %d para inteiros, int, long, %n quebra de linha, %f ponto flutuante(nome tecnico para numeros com casas decimais)
        // %c ponto flutuante, %b boleano
        String frase = String.format("Olá, meu nome é %s, tenho %d anos e moro em %s.", nome, idade, cidade);
        // String.format("Molde" Valor 1, valor 2, valor 3);
        System.out.println(frase);
        // TODO: monte a frase com String.format e imprima com System.out.println
        String nm = "Gustavo";
        String cdd = "Salto";
        int idd = 19;

        String presentacion = String.format("Olá, sou o %s, sou de %s, tenho %d anos, e estou estudando JAVA: ", nm, cdd, idd);
        System.out.println(presentacion);

        // TODO: calcule e imprima o ano em que a pessoa completa 100 anos
        // LocalDate representa uma data, sem hora - so ano, mes e dia. Por exemplo: 10 de agosto de 2026
        // o LocalDate.now() chama direto da classe, sem "new LocalDate();" ele pega a data atual do relogio
        // do sistema onde o programa está rodando, e devolve um objeto LocalDate representando "hoje";
        // se eu colcar algum valor dentro do LocalDate.now() GetYear();, ele vai pegar o valor que está
        // dentro do parenteses para sempre, se eu colcar 2026, em 2030, ele ainda vai estar puxando 2026
        // por isso não colocamos nada dentro dos parenteses

        // Ex:

        //LocalDate hoje = LocalDate.now();
        //
        //int ano = hoje.getYear();        // 2026
        //int mes = hoje.getMonthValue();  // 8 (agosto)
        //int dia = hoje.getDayOfMonth();  // 10

        int anoAtual = LocalDate.now().getYear();
        // aqui eu estou declarando a data, e sempre será atualizada pelo registro do sistema que eu
        // estou rodando o codigo.
        int anoCem = anoAtual + (100 - idade);
        System.out.println("Ano em que completa 100" + anoCem);
    }
}