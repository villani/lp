package lp;

import javax.swing.JOptionPane;

/**
 * Este exemplo faz uso de métodos predefinidos para alterar informações da
 * cadeia de caracteres
 * (<a href="https://github.com/villani/lp/blob/master/src/lp/Exemplo49_CriptografarFrase.java" target="_blank">Ver
 * código</a>).
 *
 * @author Prof. Me. Leonardo Villani
 */
public class Exemplo49_CriptografarFrase {

    /**
     * Recebe uma frase e substitui as vogais por um '*'.
     *
     * @param args Não utiliza argumentos externos.
     */
    public static void main(String[] args) {

        String frase = JOptionPane.showInputDialog("Digite um frase:");
        String vogais = "aeiouAEIOU";
        for (char caractere : vogais.toCharArray()) {
            frase = frase.replace(caractere, '*');
        }
        JOptionPane.showMessageDialog(null, "Nova frase: \n" + frase);

    }

}
