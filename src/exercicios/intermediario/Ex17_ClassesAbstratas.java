package exercicios.intermediario;

/*
 * Exercício 17 — Classes Abstratas
 * Nível: Intermediário
 *
 * EXPLICAÇÃO:
 * Uma classe abstrata não pode ser instanciada diretamente (não dá pra
 * fazer "new Forma()"), mas serve de "contrato parcial" para
 * subclasses. Métodos abstratos (sem corpo) OBRIGAM as subclasses a
 * implementá-los, mas a classe abstrata também pode ter métodos
 * comuns já prontos.
 *
 * DESAFIO:
 * Crie uma classe abstrata Forma com:
 * 1) um método abstrato calcularArea() que retorna double;
 * 2) um método concreto (já implementado) imprimirArea() que chama
 *    calcularArea() e imprime o resultado formatado.
 * Depois crie Circulo (com raio) e Retangulo (com base e altura),
 * cada um implementando calcularArea() com sua própria fórmula.
 *
 * DICAS:
 * // dica 1: abstract class Forma { abstract double calcularArea(); }
 * // dica 2: área do círculo: Math.PI * raio * raio
 * // dica 3: área do retângulo: base * altura
 * // dica 4: imprimirArea() pode ser implementado uma única vez na
 * //         classe abstrata e funcionar para todas as subclasses
 *
 * SAÍDA ESPERADA (exemplo, Circulo com raio=3, Retangulo com base=4 e altura=5):
 * Área: 28.27
 * Área: 20.00
 */
public class Ex17_ClassesAbstratas {

    abstract static class Forma {
        abstract double calcularArea();

        void imprimirArea() {
            System.out.printf("Área: %.2f%n", calcularArea());
        }
    }

    // TODO: crie Circulo extends Forma (atributo raio, implemente calcularArea)

    // TODO: crie Retangulo extends Forma (atributos base e altura, implemente calcularArea)

    public static void main(String[] args) {
        // TODO: crie um Circulo e um Retangulo, e chame imprimirArea() de cada um
    }
}
