package lp;

import java.util.Scanner;

/**
 * Este exemplo contém a declaração de um método utiliza parâmetros de entrada e
 * retorna um valor após a sua execuação.
 *
 * @author Prof. Me. Leonardo Villani
 */
public class Exemplo33_DeclarandoMetodos4 {

    /**
     * Obtém do usuário os valores inteiros, executa o método declarado
     * fornecendo os valores como parâmetros de entrada, armazena e exibe o
     * retorno fornecido.
     *
     * @param args Não utiliza argumentos externos.
     */
    public static void main(String[] args) {

        int parcela01, parcela02;
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe a parcela 01: ");
        parcela01 = leitor.nextInt();
        System.out.print("Informe a parcela 02: ");
        parcela02 = leitor.nextInt();

        int soma = somar(parcela01, parcela02); // CHAMADA DO MÉTODO

        System.out.println("O resultado da adição é: " + soma);
        leitor.close();
    }

    /**
     * Recebe por parâmetros de entrada dois valores inteiros, calcula e retorna
     * a soma deles.
     *
     * @param parcela01 Primeiro valor inteiro.
     * @param parcela02 Segundo valor inteiro.
     * @return A soma calculada.
     */
    public static int somar(int parcela01, int parcela02) {
        return parcela01 + parcela02;
    }

}
