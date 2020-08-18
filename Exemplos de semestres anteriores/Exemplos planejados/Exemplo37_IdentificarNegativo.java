package lp;

import java.util.Scanner;

/**
 * Este exemplo contém na mesma classe outro método além do método principal
 * (main)
 * (<a href="https://github.com/villani/lp/blob/master/src/lp/Exemplo37_IdentificarNegativo.java" target="_blank">Ver
 * código</a>).
 *
 * @author Prof. Me. Leonardo Villani
 */
public class Exemplo37_IdentificarNegativo {

    /**
     * Usa outro método da própria classe para verificar se um valor inteiro é
     * positivo ou negativo.
     *
     * @param args Não utiliza argumentos externos.
     */
    public static void main(String[] args) {
        int num;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe um número inteiro: ");
        num = leitor.nextInt();
        if (ePositivo(num) == 1) {
            System.out.println("É positivo");
        } else {
            System.out.println("É negativo");
        }
    }

    /**
     * Verificar se um valor inteiro é negativo ou positivo.
     *
     * @param num Valor a ser verificado.
     * @return 1 se for positivo ou 0 se for negativo.
     */
    public static int ePositivo(int num) {
        int retorno;
        if (num > 0) {
            retorno = 1;
        } else {
            retorno = 0;
        }
        return retorno;
    }
}
