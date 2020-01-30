package lp;

import java.util.Scanner;

/**
 * Este exemplo contém a declaração de um método que não utiliza parâmetros de
 * entrada, porém retorna um valor após a sua execuação
 * (<a href="https://github.com/villani/lp/blob/master/src/lp/Exemplo32_DeclarandoMetodos3.java" target="_blank">Ver
 * código</a>).
 *
 * @author Prof. Me. Leonardo Villani
 */
public class Exemplo32_DeclarandoMetodos3 {

    /**
     * Executa o método declarado, armazena e exibe o retorno fornecido.
     *
     * @param args Não utiliza argumentos externos.
     */
    public static void main(String[] args) {

        int soma = somar(); // CHAMADA DO MÉTODO

        System.out.println("O resultado da adição é: " + soma);

    }

    /**
     * Realiza a leitura de dois valores inteiros, calcula e retorna a soma
     * deles.
     *
     * @return A soma calculada.
     */
    public static int somar() {
        int parcela01, parcela02, soma;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe a parcela 01: ");
        parcela01 = leitor.nextInt();
        System.out.print("Informe a parcela 02: ");
        parcela02 = leitor.nextInt();
        leitor.close();
        soma = parcela01 + parcela02;
        return soma;
    }

}
