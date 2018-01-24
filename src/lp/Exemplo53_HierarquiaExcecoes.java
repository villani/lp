package lp;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * Este exemplo contém a implementação de tratamentos de diferentes tipos de
 * exceções que podem ocorrer durante a execução de um programa.
 *
 * @author Prof. Me. Leonardo Villani
 */
public class Exemplo53_HierarquiaExcecoes {

    /**
     * Tenta acessar uma posição inexistente em um vetor, converte uma palavra
     * em inteiro e trata as possíveis exceções que podem ser lançadas.
     *
     * @param args Não utiliza argumentos externos.
     */
    public static void main(String[] args) {

        try {
            int[] vetor = {1};
            System.out.println("Valor do elemento: " + vetor[0]); // Lança uma exceção se um índice inexistente for acessado.

            String var02 = JOptionPane.showInputDialog("Informe um valor");
            int var03 = Integer.parseInt(var02); // Lança uma exceção se não for possível converter para inteiro.
            JOptionPane.showMessageDialog(null, "Valor informado: " + var03);

            Scanner leitor = new Scanner(System.in);
            System.out.print("Informe um valor: ");
            double var = leitor.nextDouble(); // Lança uma exceção se um texto for informado.
            System.out.println("Valor informado: " + var);
//		} catch(Exception e){
//			System.out.println("Uma exceção foi capturada: " + e);
            /*
             * As outras exceções capturadas não serão executadas dessa maneira.
             * Pois esse bloco catch captura qualquer exceção que for lançada.
             */
        } catch (ArrayIndexOutOfBoundsException ai) {
            System.out.println("Tentativa equivocada de acessar um elemento inexistente no vetor.");
            System.out.println("Parâmetro informado: " + ai.getLocalizedMessage());
        } catch (NumberFormatException nfe) {
            System.out.println("Falha ao tentar converter para o parãmetro para número.");
            System.out.println("Parâmetro informado: " + nfe.getLocalizedMessage());
        } catch (InputMismatchException ime) {
            System.out.println("Falha: um parâmetro do tipo double era esperado.");
            System.out.println("Parâmetro informado: " + ime.getMessage());
        }

    }

}
