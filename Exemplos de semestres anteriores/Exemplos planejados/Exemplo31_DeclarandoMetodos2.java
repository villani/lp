package lp;

import java.util.Scanner;

/**
 * Este exemplo contém a declaração de um método que utiliza parâmetros de
 * entrada, mas não retorna qualquer valor após a sua execuação
 * (<a href="https://github.com/villani/lp/blob/master/src/lp/Exemplo31_DeclarandoMetodos2.java" target="_blank">Ver
 * código</a>).
 *
 * @author Prof. Me. Leonardo Villani
 */
public class Exemplo31_DeclarandoMetodos2 {

    /**
     * Obtém do usuário os valores inteiros e executa o método declarado
     * fornecendo os valores como parâmetros de entrada.
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

        somar(parcela01, parcela02); // CHAMADA DO MÉTODO

        leitor.close();
    }

    /**
     * Recebe por parâmetros de entrada dois valores inteiros, calcula e exibe a
     * soma deles.
     *
     * @param parcela01 Primeiro valor inteiro.
     * @param parcela02 Segunto valor inteiro.
     */
    public static void somar(int parcela01, int parcela02) {
        int soma;
        soma = parcela01 + parcela02;
        System.out.println("A soma das parcelas é: " + soma);
    }

}
