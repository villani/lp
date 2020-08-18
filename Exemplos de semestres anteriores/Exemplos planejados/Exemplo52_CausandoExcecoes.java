package lp;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * Este exemplo contém a implementação de códigos que possivelmente lançaram
 * exceções
 * (<a href="https://github.com/villani/lp/blob/master/src/lp/Exemplo52_CausandoExcecoes.java" target="_blank">Ver
 * código</a>).
 *
 * @author Prof. Me. Leonardo Villani
 */
public class Exemplo52_CausandoExcecoes {

    public static void main(String[] args) {

        int[] vetor = {1};
        System.out.println("Valor do elemento: " + vetor[1]); // Lança uma exceção se um índice inexistente for acessado.

        String var02 = JOptionPane.showInputDialog("Informe um valor");
        int var03 = Integer.parseInt(var02); // Lança uma exceção se não for possível converter para inteiro.
        JOptionPane.showMessageDialog(null, "Valor informado: " + var03);

        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe um valor: ");
        double var = leitor.nextDouble(); // Lança uma exceção se um texto for informado.
        System.out.println("Valor informado: " + var);

    }

}
