package lp;

import java.util.Arrays;

import javax.swing.JOptionPane;

/**
 * Este exemplo faz uso de métodos predefinidos para alterar informações da
 * cadeia de caracteres
 * (<a href="https://github.com/villani/lp/blob/master/src/lp/Exemplo50_OrdenarPalavras.java" target="_blank">Ver
 * código</a>).
 *
 * @author Prof. Me. Leonardo Villani
 */
public class Exemplo50_OrdenarPalavras {

    /**
     * Recebe uma frase e coloca as palavras em ordem alfabética.
     *
     * @param args Não utiliza argumentos externos.
     */
    public static void main(String[] args) {

        String frase = JOptionPane.showInputDialog("Digite um frase:");
        String[] palavras = frase.toLowerCase().split(" ");
        Arrays.sort(palavras);
        frase = "";
        for (String palavra : palavras) {
            frase += palavra + " ";
        }
        JOptionPane.showMessageDialog(null, frase);

    }

}
