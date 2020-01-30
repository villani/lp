package lp;

import java.util.Scanner;

/**
 * Este exemplo contém uma possível implementação de programa que exibe a
 * posição e o valor do elemento MINIMAX de uma matriz
 * (<a href="https://github.com/villani/lp/blob/master/src/lp/Exemplo28_CalcularMinimax.java" target="_blank">Ver
 * código</a>).
 *
 * @author Prof. Me. Leonardo Villani
 */
public class Exemplo28_CalcularMinimax {

    /**
     * Recebe os valores dos elementos de uma matriz, identifica e mostra qual
     * deles é o MINIMAX da matriz.
     *
     * @param args Não utiliza argumentos externos.
     */
    public static void main(String[] args) {

        // Definição das variáveis.
        int matriz[][] = new int[4][5], menor, maior, i, j, l_menor, col;

        // Definição do objeto responsável pela entrada de dados no programa.
        Scanner leitor = new Scanner(System.in);

        // Iterações para as entradas dos valores dos elementos da matriz.
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[0].length; j++) {
                System.out.print("Informe o valor da linha " + i + " coluna " + j + ": ");
                matriz[i][j] = leitor.nextInt();
            }
            System.out.println();
        }

        // Fechando o objeto de entrada de dados.
        leitor.close();

        // Identificando o elemento MINIMAX.
        // - Identificando a linha que contém o elemento com o menor valor.
        menor = matriz[0][0];
        l_menor = 0;
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                    l_menor = i;
                }
            }
        }

        // - Identificando o elemento de maior valor da linha encontrada.
        maior = matriz[l_menor][0];
        col = 0;
        for (i = 1; i < matriz[0].length; i++) {
            if (matriz[l_menor][i] > maior) {
                maior = matriz[l_menor][i];
                col = i;
            }
        }

        // Exibindo o valor do elemento e a sua posição na matriz.
        System.out.println("Minmax: " + maior);
        System.out.println("Posição: Linha " + l_menor + " coluna " + col);
    }

}
