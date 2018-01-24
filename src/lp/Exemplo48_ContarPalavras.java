package lp;

import javax.swing.JOptionPane;

/**
 * Este exemplo faz uso de métodos predefinidos para obter informações da cadeia
 * de caracteres.
 *
 * @author Prof. Me. Leonardo Villani
 */
public class Exemplo48_ContarPalavras {

    /**
     * Recebe uma frase e contabiliza a quantidade de palavras existentes nela.
     *
     * @param args Não utiliza argumentos externos.
     */
    public static void main(String[] args) {

        String frase = JOptionPane.showInputDialog("Digite um frase:");
        String[] palavras = frase.split(" ");
        JOptionPane.showMessageDialog(null, "Na frase digitada há " + palavras.length + " palavras.");

    }

}
