package lp;

/**
 * Este exemplo contém métodos que recebem, como parâmetros de entradas, valores
 * ou referências de variáveis
 * (<a href="https://github.com/villani/lp/blob/master/src/lp/Exemplo35_ReferenciaDeParametros.java" target="_blank">Ver
 * código</a>).
 *
 * @author Prof. Me. Leonardo Villani
 */
public class Exemplo35_ReferenciaDeParametros {

    /**
     * Exibe os resultados de dois métodos, permitindo comparar a diferença
     * entre receber o valor ou a referência de uma variável.
     *
     * @param args Não utiliza argumentos externos.
     */
    public static void main(String[] args) {
        int valor = 2;
        System.out.println("Passagem de valores: " + incrementa(valor)); // Saída: 3
        System.out.println("Verifica valor: " + valor); // Saída: 2

        int[] vetor = {valor}; // Armazena 2 na primeira posição de 'vetor'
        System.out.println("Passagem de referência: " + incrementa(vetor)); // Saída: 3
        System.out.println("Verifica valor: " + vetor[0]); // A referência foi atualizada
    }

    // PASSANDO O VALOR DA VARIÁVEL a PARA O MÉTODO
    /**
     * Método qualquer que recebe como parâmetro de entrada o valor de uma
     * variável.
     *
     * @param a Um valor inteiro qualquer.
     * @return O valor inteiro fornecido mais um.
     */
    public static int incrementa(int a) { // Somente o valor da variável é passado por parâmetro quando se usa tipos primitivos
        return ++a;
    }

    // PASSANDO A REFERÊNCIA DA VARIÁVEL a PARA O MÉTODO
    /**
     * Método qualquer que recebe como parâmetro de entrada a referência de uma
     * variável. O primeiro elemento da matriz fornecida recebe um incremento.
     *
     * @param a Uma matriz com ao menos um valor inteiro qualquer.
     * @return A matriz com o primeiro elemento incrementado.
     */
    public static int incrementa(int[] a) { // Somente a referência da variável é passada por parâmetro quando se usa objetos
        return ++a[0];
    }

}
