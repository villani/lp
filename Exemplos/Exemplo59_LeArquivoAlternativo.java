package lp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Este exemplo contém a implementação de uma rotina que realiza a leitura do
 * conteúdo de um arquivo
 * (<a href="https://github.com/villani/lp/blob/master/src/lp/Exemplo59_LeArquivoAlternativo.java" target="_blank">Ver
 * código</a>).
 *
 * @author Prof. Me. Leonardo Villani
 */
public class Exemplo59_LeArquivoAlternativo {

    /**
     * Lê linha por linha de um arquivo
     *
     * @param args Não utiliza argumentos externos.
     * @throws FileNotFoundException Se o arquivo informado não puder ser
     * encontrado.
     */
    public static void main(String[] args) throws FileNotFoundException {

        File relatorio = new File("relatorio.log");
        Scanner leitor = new Scanner(relatorio);

        while (leitor.hasNextLine()) {
            System.out.println(leitor.nextLine());
        }

        leitor.close();

    }

}
