package lp;

import javax.swing.JOptionPane;

/**
 * Este exemplo faz uso de métodos predefinidos para obter informações da cadeia
 * de caracteres
 * (<a href="https://github.com/villani/lp/blob/master/src/lp/Exemplo47_ContarVogais.java" target="_blank">Ver
 * código</a>).
 *
 * @author Prof. Me. Leonardo Villani
 */
public class Exemplo47_ContarVogais {

    /**
     * Recebe uma frase e contabiliza a quantidade de vogais existentes nela.
     *
     * @param args Não utiliza argumentos externos.
     */
    public static void main(String[] args) {

        String frase = JOptionPane.showInputDialog("Digite sua frase:");
        frase = frase.toLowerCase();
        int contaVogais = 0;
        for (char caractere : frase.toCharArray()) {
            if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
                contaVogais++;
            }
        }
        JOptionPane.showMessageDialog(null, "Na frase digitada há " + contaVogais + " vogais.");
    }

}
