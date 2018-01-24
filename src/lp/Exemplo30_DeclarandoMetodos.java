package lp;

import java.util.Scanner;

/**
 * Este exemplo contém a declaração de um método que não utiliza parâmetros de
 * entrada e também não retorna qualquer valor após a sua execuação.
 *
 * @author Prof. Me. Leonardo Villani
 */
public class Exemplo30_DeclarandoMetodos {

    /**
     * Executa o método declarado.
     *
     * @param args Não utiliza argumentos externos.
     */
    public static void main(String[] args) {

        somar(); // CHAMADA DO MÉTODO

    }

    /**
     * Realiza a leitura de dois valores inteiros, calcula e exibe a soma deles.
     *
     */
    public static void somar() {
        int soma, parcela01, parcela02;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe a parcela 01: ");
        parcela01 = leitor.nextInt();
        System.out.print("Informe a parcela 02: ");
        parcela02 = leitor.nextInt();
        soma = parcela01 + parcela02;
        System.out.println("A soma das parcelas é: " + soma);
        leitor.close();
    }

}
