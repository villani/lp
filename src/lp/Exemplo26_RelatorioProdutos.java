package lp;

import java.util.Scanner;

/**
 * Este exemplo contém uma possível implementação de programa que exibe somente
 * os produtos e as respectivas lojas que atendem ao filtro informado.
 *
 * @author Prof. Me. Leonardo Villani
 */
public class Exemplo26_RelatorioProdutos {

    /**
     * Recebe os nomes das lojas e dos produtos, os respectivos preços e o valor
     * usado para filtrar os produtos que serão exibidos.
     *
     * @param args Não utiliza argumentos externos.
     */
    public static void main(String[] args) {

        // Definição das variáveis.
        String[] lojas = new String[4], produtos = new String[3];
        double precos[][] = new double[4][3], filtro;
        int i, j;

        // Definição do objeto responsável pela entrada de dados no programa.
        Scanner leitor = new Scanner(System.in);

        // Iterações para as entradas dos nomes das lojas e dos produtos, bem como os respectivos preços.
        for (i = 0; i < lojas.length; i++) {
            System.out.print("Informe o nome da loja " + (i + 1) + ": ");
            lojas[i] = leitor.nextLine();
        }
        for (i = 0; i < produtos.length; i++) {
            System.out.print("Informe o nome do produto " + (i + 1) + ": ");
            produtos[i] = leitor.nextLine();
        }
        for (i = 0; i < lojas.length; i++) {
            for (j = 0; j < produtos.length; j++) {
                System.out.print("Informe o preço do " + produtos[j] + " da loja " + lojas[i] + ": ");
                precos[i][j] = leitor.nextDouble();
            }
        }

        // Definição do valor que será usado para filtrar os produtos exibidos.
        System.out.print("Informe o valor do filtro: ");
        filtro = leitor.nextDouble();

        // Fechando o objeto de entrada de dados.
        leitor.close();

        // Exibindo as lojas e produtos de acordo com o filtro informado.
        for (i = 0; i < lojas.length; i++) {
            for (j = 0; j < produtos.length; j++) {
                if (precos[i][j] < filtro) {
                    System.out.println(lojas[i] + " - " + produtos[j]);
                }
            }
            System.out.println();
        }

    }

}
