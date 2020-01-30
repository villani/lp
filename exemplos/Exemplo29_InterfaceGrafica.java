package lp;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 * Este exemplo utiliza recursos gráficos, como caixas de diálogos, para entrada
 * e saída de dados
 * (<a href="https://github.com/villani/lp/blob/master/src/lp/Exemplo29_InterfaceGrafica.java" target="_blank">Ver
 * código</a>).
 *
 * @author Prof. Me. Leonardo Villani
 */
public class Exemplo29_InterfaceGrafica {

    /**
     * Testa diferentes caixas de diálogos, com diferentes argumentos, para
     * entrada e saída de dados.
     *
     * @param args Não utiliza argumentos externos.
     */
    public static void main(String[] args) {

        // ENTRADA DE DADOS POR INTERFACE GRÁFICA.
        String nome, ano_nasc; // - O tipo fornecido é sempre uma String.
        nome = JOptionPane.showInputDialog("Informe seu nome:");
        ano_nasc = JOptionPane.showInputDialog("Informe o ano em que você nasceu:");

        // As entradas precisarão ser convertidas para tipos numéricos para realizar cálculos.
        int ano = Integer.parseInt(ano_nasc); // - Convertendo texto para inteiro.
        int idade = 2017 - ano;

        // SAÍDA POR INTERFACE GRÁFICA.
        JOptionPane.showMessageDialog(null, nome + " em 2017 você terá " + idade + " anos!");

        // OPÇÕES DE SAÍDA.
        Component janelaPai = null;
        String mensagem = "Sua mensagem de saída!";
        String tituloJanela = "Título da Janela";
        int[] icones = {
            JOptionPane.ERROR_MESSAGE, // 0
            JOptionPane.INFORMATION_MESSAGE, // 1
            JOptionPane.PLAIN_MESSAGE, // 2
            JOptionPane.QUESTION_MESSAGE, // 3
            JOptionPane.WARNING_MESSAGE // 4
        };
        JOptionPane.showMessageDialog(janelaPai, mensagem, tituloJanela, icones[4]);
    }

}
