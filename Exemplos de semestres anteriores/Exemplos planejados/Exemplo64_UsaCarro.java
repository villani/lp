package lp;

import javax.swing.JOptionPane;

/**
 * Este exemplo usa um novo tipo de dado implementado em outro arquivo
 * (<a href="https://github.com/villani/lp/blob/master/src/lp/Exemplo64_UsaCarro.java" target="_blank">Ver
 * código</a>).
 *
 * @author Prof. Me. Leonardo Villani
 */
public class Exemplo64_UsaCarro {

    /**
     * Cria objetos a partir do novo tipo de dado definido.
     *
     * @param args Não utiliza argumentos externos.
     */
    public static void main(String[] args) {

        Exemplo63_Carro carro01 = new Exemplo63_Carro();
        carro01.modelo = "Fusca";
        carro01.valor = 15000;

        Exemplo63_Carro outroCarro = new Exemplo63_Carro();
        outroCarro.modelo = "Opala";

        Exemplo63_Carro[] carros = new Exemplo63_Carro[5];
        int maisBarato = 0;
        double valor = 0;

        for (int i = 0; i < 5; i++) {
            carros[i] = new Exemplo63_Carro();
            carros[i].modelo = JOptionPane.showInputDialog("Informe o modelo "
                    + "do carro: ");
            carros[i].valor = Integer.valueOf(JOptionPane.showInputDialog("Informe"
                    + " o valor do carro: "));
            if (i == 0 || carros[i].valor < valor) {
                valor = carros[i].valor;
                maisBarato = i;
            }
        }
        System.out.println("O modelo mais barato é: "
                + carros[maisBarato].modelo + " (" + valor + ")");
    }

}
