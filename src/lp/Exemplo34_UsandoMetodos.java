package lp;

import javax.swing.JOptionPane;

/**
 * Este exemplo utiliza métodos declarados em outras classes do mesmo pacote.
 *
 * @author Prof. Me. Leonardo Villani
 */
public class Exemplo34_UsandoMetodos {

    /**
     * Obtém do usuário os valores inteiros, executa o método declarado em outra
     * classe do mesmo pacote fornecendo os valores como parâmetros de entrada,
     * armazena e exibe o retorno fornecido.
     *
     * @param args Não utiliza argumentos externos.
     */
    public static void main(String[] args) {

        int parcela01, parcela02, soma;
        String entrada;

        entrada = JOptionPane.showInputDialog("Informe o valor da parcela01:");
        parcela01 = Integer.parseInt(entrada);

        entrada = JOptionPane.showInputDialog("Informe o valor da parcela02:");
        parcela02 = Integer.parseInt(entrada);

        soma = Exemplo33_DeclarandoMetodos4.somar(parcela01, parcela02);
        JOptionPane.showMessageDialog(null, "O resultado da adição é " + soma);

    }

}
