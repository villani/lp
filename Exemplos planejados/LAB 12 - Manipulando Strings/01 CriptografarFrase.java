package lp;

import javax.swing.JOptionPane;

/**
 * Este exemplo faz uso de métodos predefinidos para alterar informações da cadeia de caracteres
 *
 * @author Prof. Me. Leonardo Villani
 */
public class CriptografarFrase {

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
